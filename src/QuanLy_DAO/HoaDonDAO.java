/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DAO;

import QuanLy_DTO.ChiTietHD_DTO;
import QuanLy_DTO.HoaDon_DTO;
import java.math.BigDecimal;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * DAO (Data action object) : Ðoi tuong truy cap du lieu
 */
public class HoaDonDAO extends ConnectSQL {

    public HoaDonDAO() {
    }

    public ArrayList<HoaDon_DTO> getListHoaDon() {
        ArrayList<HoaDon_DTO> listhd = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                HoaDon_DTO hd = new HoaDon_DTO();
                hd.setMahoadon(rs.getInt("Mahoadon"));
                hd.setMakhach(rs.getInt("Makhach"));
                hd.setTenkhach(rs.getString("Tenkhach"));
                String str = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    str = dateFormat.format(rs.getDate("Ngaylap"));
                } catch (Exception e) {
                }
                hd.setNgaylap(str);

                hd.setTongsl(rs.getInt("Tongsl"));
                hd.setTongtien(BigDecimal.valueOf(rs.getDouble("Tongtien")));
                hd.setTrangthai(rs.getString("Trangthai"));
                hd.setTienkhachtra(BigDecimal.valueOf(rs.getDouble("tienkhachtra")));
                hd.setTientralai(BigDecimal.valueOf(rs.getDouble("tientralai")));
                hd.setIsdelete(rs.getInt("isdelete"));
                if (hd.getIsdelete() == 0) {
                    listhd.add(hd); // Them san pham vào list
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhd;
    }

    public ArrayList<HoaDon_DTO> getListTimkiem(String trangthai) {
        ArrayList<HoaDon_DTO> listhd = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon Where Trangthai=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);   //tạo kết nối
            ps.setString(1, trangthai);
            ResultSet rs = ps.executeQuery();   //Đọc dữ liệu từ SQL  //tạo đói tượng resultset
            while (rs.next()) {   // lặp kiểm tra hết các cột
                HoaDon_DTO hd = new HoaDon_DTO();
                hd.setMahoadon(rs.getInt("Mahoadon"));
                hd.setMakhach(rs.getInt("Makhach"));
                hd.setTenkhach(rs.getString("Tenkhach"));
                String str = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    str = dateFormat.format(rs.getDate("Ngaylap"));
                } catch (Exception e) {
                }
                hd.setNgaylap(str);

                hd.setTongsl(rs.getInt("Tongsl"));
                hd.setTongtien(BigDecimal.valueOf(rs.getDouble("Tongtien")));
                hd.setTrangthai(rs.getString("Trangthai"));
                hd.setTienkhachtra(BigDecimal.valueOf(rs.getDouble("tienkhachtra")));
                hd.setTientralai(BigDecimal.valueOf(rs.getDouble("tientralai")));
                hd.setIsdelete(rs.getInt("isdelete"));
                if (hd.getIsdelete() == 0) {
                    listhd.add(hd); // Them san pham vào list
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhd;
    }

    public boolean addHoaDonNULL(String d) {
        String sql = "insert into HoaDon "
                + "values (NULL,NULL,?,NULL,NULL,NULL,0,NULL,NULL)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(1, new Date(dateFormat.parse(d).getTime()));
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addHoaDon(HoaDon_DTO hd) {
        //Tao cau lenh truy van
        String sql = "INSERT INTO HoaDon "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            //T?o ket noi den csdl
            PreparedStatement ps = conn.prepareStatement(sql);
            //Thuc hien truy van
            ps.setInt(1, hd.getMakhach());
            ps.setString(2, hd.getTenkhach());
            // ép về kiểu date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(3, new Date(dateFormat.parse(hd.getNgaylap()).getTime()));

            ps.setInt(4, hd.getTongsl());
            ps.setDouble(5, hd.getTongtien().doubleValue());
            ps.setString(6, hd.getTrangthai());
            ps.setInt(7, hd.getIsdelete());
            ps.setDouble(8, hd.getTienkhachtra().doubleValue());
            ps.setDouble(9, hd.getTientralai().doubleValue());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaHoaDon(HoaDon_DTO hd) {
        String sql = "update HoaDon set Makhach=? ,Tenkhach=? ,Ngaylap=? ,Tongsl=? ,"
                + "Tongtien=? ,Trangthai=? ,tienkhachtra=? ,tientralai=?  where Mahoadon =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hd.getMakhach());
            ps.setString(2, hd.getTenkhach());
            // ép về kiểu date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(3, new Date(dateFormat.parse(hd.getNgaylap()).getTime()));

            ps.setInt(4, hd.getTongsl());
            ps.setDouble(5, hd.getTongtien().doubleValue());
            ps.setString(6, hd.getTrangthai());
            ps.setDouble(7, hd.getTienkhachtra().doubleValue());
            ps.setDouble(8, hd.getTientralai().doubleValue());
            ps.setInt(9, hd.getMahoadon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean suaHoaDonNullmk(HoaDon_DTO hd) {
        String sql = "update HoaDon set Tenkhach=? ,Ngaylap=? ,Tongsl=? ,"
                + "Tongtien=? ,Trangthai=? ,tienkhachtra=? ,tientralai=?  where Mahoadon =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getTenkhach());
            // ép về kiểu date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ps.setDate(2, new Date(dateFormat.parse(hd.getNgaylap()).getTime()));

            ps.setInt(3, hd.getTongsl());
            ps.setDouble(4, hd.getTongtien().doubleValue());
            ps.setString(5, hd.getTrangthai());
            ps.setDouble(6, hd.getTienkhachtra().doubleValue());
            ps.setDouble(7, hd.getTientralai().doubleValue());
            ps.setInt(8, hd.getMahoadon());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean HDThanhtoan(int mahd, BigDecimal tkt, BigDecimal ttl, String tt) {
        String sql = "update HoaDon set tienkhachtra=? ,tientralai=? ,Trangthai=? where Mahoadon =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBigDecimal(1, tkt);
            ps.setBigDecimal(2, ttl);
            ps.setString(3, tt);
            ps.setInt(4, mahd);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean xoaHoaDon(int mahoadon) {
        String sql = "update HoaDon set isdelete = 1 where Mahoadon =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, mahoadon);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
}
