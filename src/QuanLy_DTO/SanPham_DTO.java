/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;
 
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FPT
 */
public class SanPham_DTO {
    private int maSP;
    private String tenSP;
    private String loaiSP; 
    private double donGia;
    private int soLuong;
    private String maKM;
    private String Anhsp;
    int isdelete=0;

    public SanPham_DTO() {
    }

    public SanPham_DTO(int maSP, String tenSP, String loaiSP, int soLuong, double donGia, String maKM) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maKM = maKM;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
    

    public String getAnhsp() {
        return Anhsp;
    }

    public void setAnhsp(String Anhsp) {
        this.Anhsp = Anhsp;
    }
 
    
    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

}
