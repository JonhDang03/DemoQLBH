/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DAO;

import QuanLy_DTO.QuanLy_DTO;
import QuanLy_DTO.SanPham_DTO;
import com.sun.source.doctree.DocTree;
import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * DAO (Data action object) : Ðoi tuong truy cap du lieu
 */
public class SanPhamDAO extends ConnectSQL {

    public SanPhamDAO() {
    }
// Ðang nhap

    public QuanLy_DTO dangnhap(String username, String password) {
        QuanLy_DTO ng = null;
        try {
            String sql = "select * from TaiKhoan where TenTk=? and Mk=?";  // truy vấn tài khoản đăng nhaap
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                ng = new QuanLy_DTO();
                ng.setMaNV(rs.getString(1));
                ng.setUser(rs.getString(2));
                ng.setPass(rs.getString(3));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ng;
    }

    public boolean addSanPham(SanPham_DTO sp) {

        String sql = "INSERT INTO SanPham(TenSP, LoaiSP, GiaBan, SoLuong, MaKhuyenMai ,anhsp,isdelete)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);  // Lệnh truy vẫn tham số với SQL
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoaiSP());
            ps.setFloat(3, (float) sp.getDonGia());
            ps.setFloat(4, (float) sp.getSoLuong());
            ps.setString(5, sp.getMaKM());
            ps.setString(6, sp.getAnhsp());
            ps.setInt(7, sp.getIsdelete());

            return ps.executeUpdate() > 0;  // update  dữ liệu  số lượng thêm vào phải lớn hơn  0
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        public boolean addSanPhamNULL(SanPham_DTO sp) {

        String sql = "INSERT INTO SanPham(TenSP, LoaiSP, GiaBan, SoLuong, MaKhuyenMai ,anhsp,isdelete)"
                + "VALUES(?,?,?,?,NULL,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);  // Lệnh truy vẫn tham số với SQL
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoaiSP());
            ps.setFloat(3, (float) sp.getDonGia());
            ps.setFloat(4, (float) sp.getSoLuong());
            ps.setString(5, sp.getAnhsp());
            ps.setInt(6, sp.getIsdelete());

            return ps.executeUpdate() > 0;  // update  dữ liệu  số lượng thêm vào phải lớn hơn  0
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<SanPham_DTO> getListSanpham() {
        ArrayList<SanPham_DTO> listsp = new ArrayList<>();
        String sql = "SELECT * FROM SanPham";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                SanPham_DTO spmoi = new SanPham_DTO();
                spmoi.setMaSP(rs.getInt("MaSP"));
                spmoi.setTenSP(rs.getString("TenSP"));
                spmoi.setLoaiSP(rs.getString("LoaiSP"));
                spmoi.setDonGia(rs.getDouble("GiaBan"));
                spmoi.setSoLuong(rs.getInt("SoLuong"));
                spmoi.setMaKM(rs.getString("MaKhuyenMai"));
                spmoi.setAnhsp(rs.getString("anhsp"));
                spmoi.setIsdelete(rs.getInt("isdelete"));
                if(spmoi.getIsdelete() == 0){
                listsp.add(spmoi); 
            }}
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listsp;
    }

    public ArrayList<SanPham_DTO> TimSanpham(int i, String ma) {
        ArrayList<SanPham_DTO> listsp = new ArrayList<>();

        if (i == 0) {
            try {
                String sql = "SELECT * FROM SanPham WHERE MaSP=?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setInt(1, Integer.parseInt(ma));
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    SanPham_DTO spmoi = new SanPham_DTO();
                    spmoi.setMaSP(rs.getInt("MaSP"));
                    spmoi.setTenSP(rs.getString("TenSP"));
                    spmoi.setLoaiSP(rs.getString("LoaiSP"));
                    spmoi.setDonGia(rs.getDouble("GiaBan"));
                    spmoi.setSoLuong(rs.getInt("SoLuong"));
                    spmoi.setMaKM(rs.getString("makhuyenmai"));
                    spmoi.setAnhsp(rs.getString("anhsp"));
                spmoi.setIsdelete(rs.getInt("isdelete"));
                if(spmoi.getIsdelete() == 0){
                listsp.add(spmoi); 
            }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 1) {
            try {
                String sql = "SELECT * FROM SanPham WHERE LoaiSP=?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setString(1, ma);
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    SanPham_DTO spmoi = new SanPham_DTO();
                    spmoi.setMaSP(rs.getInt("MaSP"));
                    spmoi.setTenSP(rs.getString("TenSP"));
                    spmoi.setLoaiSP(rs.getString("LoaiSP"));
                    spmoi.setDonGia(rs.getDouble("GiaBan"));
                    spmoi.setSoLuong(rs.getInt("SoLuong"));
                    spmoi.setMaKM(rs.getString("makhuyenmai"));
                    spmoi.setAnhsp(rs.getString("anhsp"));  
                spmoi.setIsdelete(rs.getInt("isdelete"));
                if(spmoi.getIsdelete() == 0){
                listsp.add(spmoi); 
            }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                String sql = "SELECT * FROM SanPham WHERE GiaBan >= ?";
                PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
                ps.setInt(1, Integer.parseInt(ma));
                ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    SanPham_DTO spmoi = new SanPham_DTO();
                    spmoi.setMaSP(rs.getInt("MaSP"));
                    spmoi.setTenSP(rs.getString("TenSP"));
                    spmoi.setLoaiSP(rs.getString("LoaiSP"));
                    spmoi.setDonGia(rs.getDouble("GiaBan"));
                    spmoi.setSoLuong(rs.getInt("SoLuong"));
                    spmoi.setMaKM(rs.getString("makhuyenmai"));
                    spmoi.setAnhsp(rs.getString("anhsp"));
                spmoi.setIsdelete(rs.getInt("isdelete"));
                if(spmoi.getIsdelete() == 0){
                listsp.add(spmoi); 
            }
                }
                conn.close();
                ps.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listsp;
    }

    public boolean xoaSP(SanPham_DTO sp) {
        String sql = "update SanPham set isdelete = 1 where MaSP = ?  ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sp.getMaSP());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean SuaSP(SanPham_DTO sp) {
        try {
            String sql = "UPDATE SanPham SET TenSP=?, LoaiSP=? , GiaBan=?  ,SoLuong=?  ,makhuyenmai =? ,anhsp=?"
                    + " WHERE MaSP=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoaiSP());
            ps.setDouble(3, sp.getDonGia());
            ps.setFloat(4, sp.getSoLuong());
            ps.setString(5, sp.getMaKM());
            ps.setString(6, sp.getAnhsp());
            ps.setInt(7, sp.getMaSP());
            
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        public boolean SuaSPNULL(SanPham_DTO sp) {
        try {
            String sql = "UPDATE SanPham SET TenSP=?, LoaiSP=? , GiaBan=?  ,SoLuong=?  ,makhuyenmai =NULL ,anhsp=?"
                    + " WHERE MaSP=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setString(2, sp.getLoaiSP());
            ps.setDouble(3, sp.getDonGia());
            ps.setFloat(4, sp.getSoLuong());
            ps.setString(5, sp.getAnhsp());
            ps.setInt(6, sp.getMaSP());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean giamsoluong(int masp, int sl) {
        String sql = "UPDATE SanPham set SoLuong =( SoLuong-?) WHERE MaSP = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setInt(2,masp);
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
