/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.KhachHang;
import ASM_TT_HALPER.ChuyenDoi;
import java.sql.*;
import javax.swing.*;
import java.util.Date.*;
import ASM_TT_HALPER.SQLHalper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class DALKhachHang {

    public static ResultSet getALLKhachHang() {
        String sql = "SELECT * FROM KhachHang";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getKhachHang(String MaKH) {
        String sql = "SELECT * FROM KhachHang WHERE MaKhachHang = ?";
        return SQLHalper.executeQuery(sql, MaKH);
    }

    public static void ThemKhachHang(KhachHang kh) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[KhachHang]([MaKhachHang],[HoTen] "
                + "   ,[GioiTinh],[DiaChi],[SDT],[NgaySinh],[Email]) "
                + "    VALUES(?,?,?,?,?,?,?) ";

        SQLHalper.executeUpdate(sql,
                kh.getMaKhachHang(),
                kh.getHoTen(),
                kh.isGioiTinh(),
                kh.getDiaChi(),
                kh.getSDT(),
                ChuyenDoi.LayNgayString(kh.getNgaySinh()),
                kh.getEmail());

    }

    public static void UpdateKhachHang(KhachHang kh) {
        String sql = " SET DATEFORMAT DMY UPDATE [dbo].[KhachHang] "
                + "   SET [HoTen] =? ,[GioiTinh] =? ,[DiaChi] = ? "
                + "   ,[SDT] =? ,[NgaySinh] = ? ,[Email] = ? "
                + " WHERE [MaKhachHang] = ? ";
        SQLHalper.executeUpdate(sql,
                kh.getHoTen(),
                kh.isGioiTinh(),
                kh.getDiaChi(),
                kh.getSDT(),
                ChuyenDoi.LayNgayString(kh.getNgaySinh()),
                kh.getEmail(),
                kh.getMaKhachHang());
    }
    // Hàm xoá Khách Hàng SQL
    // Hàm xoá nhân viên SQL

    public static boolean kiemtraCoTheXoa(String MaKH) {
        String sql = "SELECT TOP 1* FROM  dbo.HoaDon WHERE MaKhachHang = ?";
        ResultSet rs = SQLHalper.executeQuery(sql, MaKH);

        try {
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DALSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void DeleteKhachHang(String MaKH) {
        String sql = " DELETE FROM dbo.KhachHang WHERE MaKhachHang = ? ";
        SQLHalper.executeUpdate(sql, MaKH);
    }

    public static ResultSet TimKiem(String TenKhachHang) {
        String sql = "{call spTimKiemKH (? )}";
        return SQLHalper.executeQuery(sql, TenKhachHang);
    }
}
