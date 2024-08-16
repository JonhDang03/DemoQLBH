/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_BUS;

import QuanLy_DAO.KhuyenMaiDAO;
import QuanLy_DTO.SanPham_DTO;
import QuanLy_DAO.SanPhamDAO;
import QuanLy_DTO.KhuyenMai_DTO;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

/**
 * @author dangm
 */
public class SanPham_BUS {

    ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();

    public boolean checkso(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String checkSP(SanPham_DTO sp) {
        int check = 0;
        try {
            for (SanPham_DTO sanPham : list) {
                if (sanPham.getMaSP() == sp.getMaSP()) {
                    check = 1;
                }
            }
        } catch (Exception e) {
        }
        if (check == 1) {
            return "Sản phẩm đã tồn tại !!";
        } else {
            if(sp.getMaKM().equals("")){
                if (new SanPhamDAO().addSanPhamNULL(sp)) {
                return "Thêm thành công!";
            }
                
            }
            if (new SanPhamDAO().addSanPham(sp)) {
                return "Thêm thành công!";
            } else {
                return "Thêm không thành công !";
            }
        }
    }

    public ArrayList<SanPham_DTO> getlisttimkiem(int check, String tieuchi) {
        ArrayList<SanPham_DTO> list = new SanPhamDAO().TimSanpham(check, tieuchi);
        return list;
    }

    public String Chuyendoi(double gia) {
    if(String.valueOf(gia).equals("")){
      return "0";
    }
     gia = Math.ceil(gia);
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat fomat = NumberFormat.getNumberInstance(localeVN);
        return fomat.format(gia);
    }
    
    
    public double Chuyendoi(String so){
        try {
                so = so.replaceAll("[+.^:,]","");
       return Double.parseDouble(so); 
        } catch (Exception e) {
            return 0;
        }
    }

     
}
