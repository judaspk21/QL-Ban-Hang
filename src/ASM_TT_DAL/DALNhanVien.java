/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_DAL;

import ASM_TT_DTO.NhanVien;
import ASM_TT_HALPER.ChuyenDoi;
import java.sql.*;
import javax.swing.*;
import java.util.Date.*;
import ASM_TT_HALPER.SQLHalper;
import ASM_TT_HALPER.ThongBao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class DALNhanVien {

    public static ResultSet getALLNhanVien() {
        String sql = "SELECT * FROM NhanVien";
        return SQLHalper.executeQuery(sql);
    }

    

    public static ResultSet DangNhap(String TenDangNhap, String MatKhau) {
        String sql = "select * from NhanVien where "
                + "TenDangNhap = ? and MatKhau = ?";
        return SQLHalper.executeQuery(sql, TenDangNhap, MatKhau);
    }

    public static ResultSet getALLChucVu() {
        String sql = "SELECT * FROM dbo.ChucVu";
        return SQLHalper.executeQuery(sql);
    }

    public static ResultSet getChucVu(String MaCV) {
        String sql = "SELECT * FROM dbo.ChucVu WHERE MaChucVu = ?";
        return SQLHalper.executeQuery(sql, MaCV);
    }

    public static ResultSet getNhanVien(String MaNV) {
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien = ?";
        return SQLHalper.executeQuery(sql, MaNV);
    }

    public static void ThemNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY INSERT INTO [dbo].[NhanVien]([MaNhanVien],[MaChucVu],[HoTen],[GioiTinh],[NgaySinh] "
                + "           ,[DiaChi],[SDT],[CMND],[NgayVaoLam],[Email],[TenDangNhap],[MatKhau]) "
                + "     VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";

        SQLHalper.executeUpdate(sql,
                nv.getMaNhanVien(),
                nv.getMaChucVu(),
                nv.getHoTen(),
                nv.isGioiTinh(),
                ChuyenDoi.LayNgayString(nv.getNgaySinh()),
                nv.getDiaChi(),
                nv.getSDT(),
                nv.getCMND(),
                ChuyenDoi.LayNgayString(nv.getNgayVaoLam()),
                nv.getEmail(),
                nv.getTenDangNhap(),
                nv.getMatKhau());
    }

    public static void UpdateNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY  UPDATE [dbo].[NhanVien] "
                + "   SET [MaChucVu] = ? "
                + "      ,[HoTen] = ? "
                + "      ,[GioiTinh] = ? "
                + "      ,[NgaySinh] =? "
                + "      ,[DiaChi] = ? "
                + "      ,[SDT] = ? "
                + "      ,[CMND] = ? "
                + "      ,[NgayVaoLam] = ? "
                + "      ,[Email] =? "
                + "      ,[TenDangNhap] = ? "
                + "      ,[MatKhau] = ? "
                + " WHERE [MaNhanVien] = ? ";
        SQLHalper.executeUpdate(sql,
                nv.getMaChucVu(),
                nv.getHoTen(),
                nv.isGioiTinh(),
                ChuyenDoi.LayNgayString(nv.getNgaySinh()),
                nv.getDiaChi(),
                nv.getSDT(),
                nv.getCMND(),
                ChuyenDoi.LayNgayString(nv.getNgayVaoLam()),
                nv.getEmail(),
                nv.getTenDangNhap(),
                nv.getMatKhau(),
                nv.getMaNhanVien());
    }

    // H??m xo?? nh??n vi??n SQL
    public static boolean kiemtraCoTheXoa(String MaNV) {
        String sql = "SELECT TOP 1* FROM  dbo.HoaDon WHERE MaNhanVien = ?";
        ResultSet rs = SQLHalper.executeQuery(sql, MaNV);

        try {
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DALSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void DeleteNhanVien(String MaNV) {
        String sql = " DELETE FROM NHANVIEN WHERE MANHANVIEN = ?";
        SQLHalper.executeUpdate(sql, MaNV);
    }

    public static ResultSet TimKiem(String TenNhanVien, String ChucVu) {
        String sql = "{call spTimKiemNV (?, ?)}";
        return SQLHalper.executeQuery(sql, TenNhanVien, ChucVu);
    }

}
