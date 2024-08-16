/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_BUS;

import QuanLy_DAO.ChiTietHDDAO;
import QuanLy_DTO.ChiTietHD_DTO;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ChitietHD_BUS {

    public BigDecimal tamtinh(double g, int sl) {
        BigDecimal sum = new BigDecimal(String.valueOf(Math.round(g * sl)));
        return sum;
    }

    public BigDecimal tienkm(BigDecimal sum, float gt) {
        if (String.valueOf(gt).equals(null)) {
            gt = 0;
        }
        double d = sum.doubleValue() * (gt / 100f);;
        BigDecimal sumkm = new BigDecimal(String.valueOf(Math.round(d)));
        return sumkm;
    }

    public BigDecimal tongtien(BigDecimal sum, BigDecimal tienkm) {
        BigDecimal tongtien = new BigDecimal(String.valueOf(Math.round(sum.doubleValue() - tienkm.doubleValue())));
        return tongtien;
    }

    public BigDecimal tongtien(double sum, double tienkm) {
        BigDecimal tongtien = new BigDecimal(String.valueOf(Math.round(sum - tienkm)));
        return tongtien;
    }

    public boolean addChiTietHD(ChiTietHD_DTO ct) {
        ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(ct.getMahoadon());
        try {
            for (ChiTietHD_DTO cthd : list) {
                if (ct.getMaSP() == cthd.getMaSP()) {
                    new ChiTietHDDAO().upDateSL(ct);
                    return true;
                }
            }
            if(ct.getMakhuyenmai() == 0){
               new ChiTietHDDAO().addChiTietHDNULLKM(ct);
            }else{
            new ChiTietHDDAO().addChiTietHD(ct);
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean deleteChitietHD(int mahd, int masp){
        return (new ChiTietHDDAO().xoaCT(mahd, masp));
    }
}
