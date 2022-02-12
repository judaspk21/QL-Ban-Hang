/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM_TT_BLL;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import ASM_TT_HALPER.ThongBao;
import ASM_TT_DAL.DALNhanVien;
import ASM_TT_DTO.NhanVien;
import ASM_TT_HALPER.ChuyenDoi;
import ASM_TT_HALPER.Mycombobox;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BLLNhanVien {

    public static void ThemNhanVien(NhanVien nv) {

        // Kiểm tra tên đang nhập đa tồn tại
        // kiểm tra ok -> gọi hàm thêm từ DALNhanVien
        DALNhanVien.ThemNhanVien(nv);
    }

    public static NhanVien DangNhap(String TenDangNhap, String MatKhau) {
        try {
            ResultSet rs = DALNhanVien.DangNhap(TenDangNhap, MatKhau);
            if (rs.next()) {
                return LayNhanVienTheoMa(rs.getString("MaNhanVien"));
            }
        } catch (SQLException ex) {
            ThongBao.ThongBaoDangNhap("Thông báo lỗi", "Lỗi SQL đăng nhập!");
        }
        return null;
    }

    public static void LoadNhanVien(JTable tblDanhSach) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALNhanVien.getALLNhanVien();
        Object obj[] = new Object[13];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNhanVien");
                obj[2] = rs.getString("MaChucVu");
                obj[3] = rs.getString("HoTen");
                boolean gt = rs.getBoolean("GioiTinh");
                if (gt) {
                    obj[4] = "Nam";
                } else {
                    obj[4] = "Nữ";
                }
                obj[5] = ChuyenDoi.LayNgayString(rs.getDate("NgaySinh"));
                obj[6] = rs.getString("DiaChi");
                obj[7] = rs.getString("SDT");
                obj[8] = rs.getString("CMND");
                obj[9] = ChuyenDoi.LayNgayString(rs.getDate("NgayVaoLam"));
                obj[10] = rs.getString("Email");
                obj[11] = rs.getString("TenDangNhap");
                obj[12] = rs.getString("MatKhau");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Nhân Viên");
        }
    }

    public static NhanVien LayNhanVienTheoMa(String MaNV) {
        ResultSet rs = DALNhanVien.getNhanVien(MaNV);
        try {
            if (rs.next()) {
                // Nếu Có Nhân Viên 
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setMaChucVu(rs.getString("MaChucVu"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("SDT"));
                nv.setCMND(rs.getString("CMND"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                nv.setEmail(rs.getString("Email"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                // Trả về nhân viên 
                return nv;

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo", "Lỗi Lấy Nhân Viên Theo Mã");
        }
        return null;
    }

    public static void UpdateNhanVien(NhanVien nv) {

        DALNhanVien.UpdateNhanVien(nv);
    }

    public static void Delete(List<String> lstMaNV) {

        String danhSachKhongTheXoa = "";
        String danhSachDaXoa = "";

        for (String MaNV : lstMaNV) {

            if (DALNhanVien.kiemtraCoTheXoa(MaNV)) {
                DALNhanVien.DeleteNhanVien(MaNV);
                danhSachDaXoa += MaNV + " \n";
            } else {
                danhSachKhongTheXoa += MaNV + " \n";
            }
        }

        if (!danhSachDaXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Đã Xóa Mã : \n" + danhSachDaXoa);
        }
        if (!danhSachKhongTheXoa.equals("")) {
            ThongBao.ThongBaoSQL("Thông Báo", "Không Thể Xóa Mã :\n" + danhSachKhongTheXoa);
        }

    }

    public static void LoadChucVu(JComboBox cbbChucVu) {

        ResultSet rs = DALNhanVien.getALLChucVu();
        BLLCombobox.Load(cbbChucVu, rs, true);
    }

    public static void TimNhanVien(JTable tblDanhSach, String TenNhanVien, String ChucVu) {
        DefaultTableModel tbModel = (DefaultTableModel) tblDanhSach.getModel();
        tbModel.setRowCount(0); // sét số dòng trong bảng về 0
        // Lấy dự liệu danh sách nhân viên từ DAL
        ResultSet rs = DALNhanVien.TimKiem(TenNhanVien, ChucVu);
        Object obj[] = new Object[11];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getString("MaNhanVien");
                obj[2] = rs.getString("MaChucVu");
                obj[3] = rs.getString("HoTen");
                boolean gt = rs.getBoolean("GioiTinh");
                if (gt) {
                    obj[4] = "Nam";
                } else {
                    obj[4] = "Nữ";
                }
                obj[5] = ChuyenDoi.LayNgayString(rs.getDate("NgaySinh"));
                obj[6] = rs.getString("DiaChi");
                obj[7] = rs.getString("SDT");
                obj[8] = rs.getString("CMND");
                obj[9] = ChuyenDoi.LayNgayString(rs.getDate("NgayVaoLam"));
                obj[10] = rs.getString("Email");
                // Thêm obj vào table 
                tbModel.addRow(obj);

            }
        } catch (SQLException e) {
            ThongBao.ThongBaoDangNhap("Thông Báo Lỗi", "Lỗi Lấy Danh Sách Nhân Viên");
        }
    }

  

}
