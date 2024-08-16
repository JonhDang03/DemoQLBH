/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DAO;

import QuanLy_DTO.KhachHang_DTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

// ke thua l?i lop ket noi
public class KhachHangDAO extends ConnectSQL {

    //Tao ArrayList khach hang
    public ArrayList<KhachHang_DTO> getListKhachHang() {
        ArrayList<KhachHang_DTO> listkh = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                KhachHang_DTO khmoi = new KhachHang_DTO();
                khmoi.setMak(rs.getInt("Makhach"));
                khmoi.setTen(rs.getString("Tenkhach"));
                String str = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    str = dateFormat.format(rs.getDate("Ngaysinh"));
                } catch (Exception e) {
                    e.printStackTrace();

                }
                khmoi.setNgaySinh(str);
                khmoi.setDiaChi(rs.getString("Diachi"));
                khmoi.setSDT(rs.getString("Sdt"));
                khmoi.setDiemTichLuy(rs.getInt("Diemtichluy"));
                khmoi.setAnhkh(rs.getString("Anhkh"));
                khmoi.setIsdelete(rs.getInt("isdelete"));
                if (khmoi.getIsdelete() == 0) {
                    listkh.add(khmoi);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listkh;
    }

    //Them khach hang
    public boolean addKH(KhachHang_DTO kh) {
        //Tao cau lenh truy van
        String sql = "INSERT INTO KhachHang(Tenkhach ,Ngaysinh ,Diachi ,Sdt ,Diemtichluy ,Anhkh ,isdelete)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            //T?o ket noi den csdl
            PreparedStatement ps = conn.prepareStatement(sql);

            //Thuc hien truy van
            ps.setString(1, kh.getTen());
            // ép vè kieu date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(2, new Date(dateFormat.parse(kh.getNgaySinh()).getTime()));
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSDT());
            if((kh.getDiemTichLuy()+"").equals("")){
            ps.setString(5, "NULL");
            }else{
                ps.setInt(5, (int) kh.getDiemTichLuy());
            }
            ps.setString(6, kh.getAnhkh());
            ps.setInt(7, kh.getIsdelete());
            // update  dữ liệu  số lượng thêm vào phải lớn hơn  0
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
        }
        return false;
    }

    //Xóa khách hàng
    public boolean xoaKhachHang(KhachHang_DTO kh) {
        String sql = "update KhachHang set isdelete = 1 where Makhach =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, kh.getMak());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //Sưa khác hàng
    public boolean suaKhachHang(KhachHang_DTO kh) {
        try {
            String sql = "UPDATE KhachHang SET Tenkhach=?, Ngaysinh=? , Diachi=?  ,Sdt=?  ,Diemtichluy=? , Anhkh=?"
                    + " WHERE Makhach=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getTen());
            // chuyển 
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(2, new Date(dateFormat.parse(kh.getNgaySinh()).getTime()));
            ps.setString(3, kh.getDiaChi());
            ps.setString(4, kh.getSDT());
            if((kh.getDiemTichLuy()+"").equals("")){
            ps.setString(5, "NULL");
            }else{
                ps.setInt(5, (int) kh.getDiemTichLuy());
            }
            ps.setString(6, kh.getAnhkh());
            ps.setInt(7, kh.getMak());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
           // e.printStackTrace();
        }
        return false;
    }

    //Tìm kiếm khách hàng 
    public ArrayList<KhachHang_DTO> Timkhachhang(String mak, String diachi) {
        ArrayList<KhachHang_DTO> listkh = new ArrayList<>();

        if (diachi.equals("") && !mak.equals("")) {
            try {
                String sql = "SELECT * FROM KhachHang WHERE Makhach=?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setInt(1, Integer.parseInt(mak));
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhachHang_DTO khmoi = new KhachHang_DTO();
                    khmoi.setMak(rs.getInt("Makhach"));
                    khmoi.setTen(rs.getString("Tenkhach"));
                    String str = null;

                    try {
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        str = dateFormat.format(rs.getDate("Ngaysinh"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    khmoi.setNgaySinh(str);

                    khmoi.setDiaChi(rs.getString("Diachi"));
                    khmoi.setSDT(rs.getString("Sdt"));
                    khmoi.setDiemTichLuy(rs.getInt("Diemtichluy"));
                    khmoi.setAnhkh(rs.getString("Anhkh"));
                    khmoi.setIsdelete(rs.getInt("isdelete"));
                    if (khmoi.getIsdelete() == 0) {
                        listkh.add(khmoi);
                    }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (mak.equals("") && !diachi.equals("")) {
            try {
                String sql = "SELECT * FROM KhachHang WHERE Diachi=?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setString(1, diachi);
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhachHang_DTO khmoi = new KhachHang_DTO();
                    khmoi.setMak(rs.getInt("Makhach"));
                    khmoi.setTen(rs.getString("Tenkhach"));
                    String str = null;

                    try {
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        str = dateFormat.format(rs.getDate("Ngaysinh"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    khmoi.setNgaySinh(str);

                    khmoi.setDiaChi(rs.getString("Diachi"));
                    khmoi.setSDT(rs.getString("Sdt"));
                    khmoi.setDiemTichLuy(rs.getInt("Diemtichluy"));
                    khmoi.setAnhkh(rs.getString("Anhkh"));
                    khmoi.setIsdelete(rs.getInt("isdelete"));
                    if (khmoi.getIsdelete() == 0) {
                        listkh.add(khmoi);
                    }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!mak.equals("") && !diachi.equals("")) {
            try {
                String sql = "SELECT * FROM KhachHang WHERE Makhach=? AND Diachi=?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setInt(1, Integer.parseInt(mak));
                ps.setString(2, diachi);
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhachHang_DTO khmoi = new KhachHang_DTO();
                    khmoi.setMak(rs.getInt("Makhach"));
                    khmoi.setTen(rs.getString("Tenkhach"));
                    String str = null;

                    try {
                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        str = dateFormat.format(rs.getDate("Ngaysinh"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    khmoi.setNgaySinh(str);
                    khmoi.setDiaChi(rs.getString("Diachi"));
                    khmoi.setSDT(rs.getString("Sdt"));
                    khmoi.setDiemTichLuy(rs.getInt("Diemtichluy"));
                    khmoi.setAnhkh(rs.getString("Anhkh"));
                    khmoi.setIsdelete(rs.getInt("isdelete"));
                    if (khmoi.getIsdelete() == 0) {
                        listkh.add(khmoi);
                    }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listkh;
    }

    public boolean tangdiemtichluy(int mak) {
        String sql = "UPDATE KhachHang set Diemtichluy = (Diemtichluy + 10) "
                + "WHERE Makhach = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, mak);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
        }
        return false;
    }
}
