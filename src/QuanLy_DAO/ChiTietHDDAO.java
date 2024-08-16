/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DAO;
import java.util.ArrayList;
import QuanLy_DTO.ChiTietHD_DTO;
import QuanLy_DTO.SanPham_DTO;
import java.math.BigDecimal;
import java.sql.*;

/**DAO (Data action object) : Ðoi tuong truy cap du lieu
 * DAO : TRuy vấn cơ sở dữ liệu 
 */
public class ChiTietHDDAO extends ConnectSQL{   
    
    public ArrayList<ChiTietHD_DTO> getlistCTHD(int mahd){
       ArrayList<ChiTietHD_DTO> listcthd = new ArrayList<>();
       String sql = "Select * from ChiTietHD where Mahoadon = ?";
       try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ps.setInt(1, mahd);
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                ChiTietHD_DTO hd = new ChiTietHD_DTO();
                hd.setMahoadon(rs.getInt("Mahoadon"));
                hd.setMaSP(rs.getInt("MaSP"));
                hd.setTenSP(rs.getString("TenSP"));
                hd.setSoluong(rs.getInt("SoLuong"));
                hd.setGiaban(rs.getDouble("GiaBan"));
                hd.setMakhuyenmai(rs.getInt("makhuyenmai"));
                hd.setTongkhuyenmai(rs.getBigDecimal("tongkhuyenmai"));
                hd.setthanhtien(rs.getBigDecimal("thanhtien"));
                listcthd.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return listcthd;
    } 
    
    public boolean addChiTietHD(ChiTietHD_DTO chitiethd){
      String sql = "insert into ChiTietHD values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, chitiethd.getMahoadon());
            ps.setInt(2, chitiethd.getMaSP());
            ps.setString(3, chitiethd.getTenSP());
            ps.setInt(4, chitiethd.getSoluong());
            ps.setDouble(5, chitiethd.getGiaban());
            ps.setInt(6, chitiethd.getMakhuyenmai());
            ps.setBigDecimal(7, chitiethd.getTongkhuyenmai());
            ps.setBigDecimal(8, chitiethd.getthanhtien());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
        public boolean addChiTietHDNULLKM(ChiTietHD_DTO chitiethd){
      String sql = "insert into ChiTietHD values (?,?,?,?,?,NULL,0,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, chitiethd.getMahoadon());
            ps.setInt(2, chitiethd.getMaSP());
            ps.setString(3, chitiethd.getTenSP());
            ps.setInt(4, chitiethd.getSoluong());
            ps.setDouble(5, chitiethd.getGiaban());
            ps.setBigDecimal(6, chitiethd.getthanhtien());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    
    
    public boolean upDateSL(ChiTietHD_DTO ct){
        String sql = "Update ChiTietHD set SoLuong = SoLuong + ?,tongkhuyenmai =tongkhuyenmai +?, thanhtien= thanhtien+?  Where MaSP=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ct.getSoluong());
            ps.setBigDecimal(2, ct.getTongkhuyenmai());
            ps.setBigDecimal(3, ct.getthanhtien());
            ps.setInt(4, ct.getMaSP());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    public boolean xoaCT(int mahd,int masp){
        String sql = "Delete From ChiTietHD where Mahoadon=? and MaSP=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, mahd);
            ps.setInt(2, masp);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    public boolean resetSL(int sl,int masp){
       String sql ="Update SanPham set SoLuong = SoLuong+? Where MaSP=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sl);
            ps.setInt(2, masp);
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
}
