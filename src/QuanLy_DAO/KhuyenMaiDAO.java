/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DAO;

import QuanLy_DTO.KhuyenMai_DTO;
import java.util.ArrayList;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author dangm
 */
public class KhuyenMaiDAO extends ConnectSQL {
    
    public KhuyenMai_DTO getKhuyenMai(int ma) {

            KhuyenMai_DTO km = new KhuyenMai_DTO();
        String sql = "SELECT * FROM KhuyenMai where makhuyenmai=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ps.setInt(1, ma);
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
              while (rs.next()) { 
                km.setMakm(rs.getInt("makhuyenmai"));
                km.setGiatrikm(rs.getFloat("giatri"));
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return km;
    }
    
    public ArrayList<KhuyenMai_DTO> getListKhuyenMai() {
        ArrayList<KhuyenMai_DTO> listkh = new ArrayList<>();
        String sql = "SELECT * FROM KhuyenMai";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                KhuyenMai_DTO kmoi = new KhuyenMai_DTO();

                kmoi.setMakm(rs.getInt("makhuyenmai"));
                kmoi.setTenkm(rs.getString("tenkhuyenmai"));
                // ép kiểu ngày tháng
                String str1 = null, str = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    str = dateFormat.format(rs.getDate("ngaybatdau"));
                    str1 = dateFormat.format(rs.getDate("ngayketthuc"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                kmoi.setNgaybd(str);
                kmoi.setNgaykt(str1);
                kmoi.setGiatrikm(rs.getFloat("giatri"));
                kmoi.setIsdelete(rs.getInt("isdelete"));
                if(kmoi.getIsdelete() == 0){
                    listkh.add(kmoi);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listkh;
    }

    public boolean addKM(KhuyenMai_DTO km) {
        //Tao cau lenh truy van
        String sql = "INSERT INTO KhuyenMai(tenkhuyenmai ,ngaybatdau ,ngayketthuc ,giatri ,isdelete)"
                + "VALUES(?,?,?,?,?)";
        try {
            //T?o ket noi den csdl
            PreparedStatement ps = conn.prepareStatement(sql);

            //Thuc hien truy van
            ps.setString(1, km.getTenkm());
            // ép vè kieu date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(2, new Date(dateFormat.parse(km.getNgaybd()).getTime()));
            ps.setDate(3, new Date(dateFormat.parse(km.getNgaykt()).getTime()));
            ps.setFloat(4, (float) km.getGiatrikm());
            ps.setInt(5,km.getIsdelete());
                  
            // update  dữ liệu  số lượng thêm vào phải lớn hơn  0
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

// Xóa Khuyến Mại
    public boolean xoaKM(KhuyenMai_DTO km) {
        String sql = "update KhuyenMai set isdelete = 1 where makhuyenmai=?" ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, km.getMakm());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaKM(KhuyenMai_DTO km) {
        try {
            String sql = "UPDATE KhuyenMai SET tenkhuyenmai=?, ngaybatdau=? , ngayketthuc=?  ,giatri=? "
                    + " WHERE makhuyenmai=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, km.getTenkm());

            // chuyển định dạng
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(2, new Date(dateFormat.parse(km.getNgaybd()).getTime()));
            ps.setDate(3, new Date(dateFormat.parse(km.getNgaykt()).getTime()));
            ps.setFloat(4, km.getGiatrikm());
            ps.setInt(5, km.getMakm());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<KhuyenMai_DTO> getlisttkkm(int index ,String tenkm, String date) {
        ArrayList<KhuyenMai_DTO> listkm = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (!tenkm.equals("") && index == 0) {
            String sql = "SELECT * FROM KhuyenMai WHERE tenkhuyenmai like ? ";
            try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, tenkm);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhuyenMai_DTO kmoi = new KhuyenMai_DTO();
                    kmoi.setMakm(rs.getInt("makhuyenmai"));
                    kmoi.setTenkm(rs.getString("tenkhuyenmai"));

                    // ép kiểu ngày tháng
                    String str1 = null, str = null;
                    try {
                        str = dateFormat.format(rs.getDate("ngaybatdau"));
                        str1 = dateFormat.format(rs.getDate("ngayketthuc"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    kmoi.setNgaybd(str);
                    kmoi.setNgaykt(str1);
                    kmoi.setGiatrikm(rs.getFloat("giatri"));
                    kmoi.setIsdelete(rs.getInt("isdelete"));
                    if(kmoi.getIsdelete() == 0){
                        listkm.add(kmoi);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return listkm;
        }
        
        if(!date.equals("") && index == 1){
            String sql = "SELECT * FROM KhuyenMai WHERE ngaybatdau >= ?";
                      try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setDate(1, new Date(dateFormat.parse(date).getTime()));
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhuyenMai_DTO kmoi = new KhuyenMai_DTO();
                    kmoi.setMakm(rs.getInt("makhuyenmai"));
                    kmoi.setTenkm(rs.getString("tenkhuyenmai"));

                    // ép kiểu ngày tháng
                    String str1 = null, str = null;
                    try {
                        str = dateFormat.format(rs.getDate("ngaybatdau"));
                        str1 = dateFormat.format(rs.getDate("ngayketthuc"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    kmoi.setNgaybd(str);
                    kmoi.setNgaykt(str1);
                    kmoi.setGiatrikm(rs.getFloat("giatri"));
                    kmoi.setIsdelete(rs.getInt("isdelete"));
                    if(kmoi.getIsdelete() == 0){
                        listkm.add(kmoi);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return listkm;
            
        }if(!date.equals("") && index == 2){
            String sql = "SELECT * FROM KhuyenMai WHERE ngayketthuc <= ?";
                      try {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setDate(1, new Date(dateFormat.parse(date).getTime()));
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {   // lặp kiểm tra hết các cột
                    KhuyenMai_DTO kmoi = new KhuyenMai_DTO();
                    kmoi.setMakm(rs.getInt("makhuyenmai"));
                    kmoi.setTenkm(rs.getString("tenkhuyenmai"));

                    // ép kiểu ngày tháng
                    String str1 = null, str = null;
                    try {
                        str = dateFormat.format(rs.getDate("ngaybatdau"));
                        str1 = dateFormat.format(rs.getDate("ngayketthuc"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    kmoi.setNgaybd(str);
                    kmoi.setNgaykt(str1);
                    kmoi.setGiatrikm(rs.getFloat("giatri"));
                    kmoi.setIsdelete(rs.getInt("isdelete"));
                    if(kmoi.getIsdelete() == 0){
                        listkm.add(kmoi);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return listkm;
        }
        return null;
    }
    
    public boolean CheckAll(){
        String sql = "Update KhuyenMai set isdelete = 1 where GETDATE() < ngaybatdau or GETDATE() > ngayketthuc\n" +
"Update KhuyenMai set isdelete = 0 where ngaybatdau <=	CONVERT(DATE ,GETDATE(), 102)"
                + " and CONVERT(DATE ,GETDATE(), 102) <= ngayketthuc" ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            return ps.executeUpdate() >= 0;
        } catch (Exception e) {
        }      
        return false;
    }
}
