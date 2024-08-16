/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

import java.math.BigDecimal;

/**
 *
 * @author dangm
 */
public class ChiTietHD_DTO {
    private int Mahoadon; 
    private int MaSP; 
    private String TenSP; 
    private int Soluong; 
    private double Giaban; 
    private int makhuyenmai; 
    private BigDecimal tongkhuyenmai; 
    private BigDecimal thanhtien;

    public ChiTietHD_DTO() {
    }


    public int getMahoadon() {
        return Mahoadon;
    }

    public void setMahoadon(int Mahoadon) {
        this.Mahoadon = Mahoadon;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double Giaban) {
        this.Giaban = Giaban;
    }

    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public BigDecimal getTongkhuyenmai() {
        return tongkhuyenmai;
    }

    public void setTongkhuyenmai(BigDecimal tongkhuyenmai) {
        this.tongkhuyenmai = tongkhuyenmai;
    }

    public BigDecimal getthanhtien() {
        return thanhtien;
    }

    public void setthanhtien(BigDecimal tongtien) {
        this.thanhtien = tongtien;
    }
    
    
    
}
