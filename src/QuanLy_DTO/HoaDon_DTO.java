/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

import java.math.BigDecimal;

/**  DTO = Data tranfer object
 Ánh xạ cách bảng trong database
 */
public class HoaDon_DTO {
   private int Mahoadon;
   private int Makhach;
   private String Tenkhach;
   private String Ngaylap;
   private int Tongsl;
   private BigDecimal Tongtien;
   private String Trangthai = "Chưa Thanh Toán";
   private BigDecimal tienkhachtra;
   private BigDecimal tientralai;
   int isdelete = 0;

    public HoaDon_DTO() {
    }

    public BigDecimal getTongtien() {
        return Tongtien;
    }

    public void setTongtien(BigDecimal Thanhtien) {
        this.Tongtien = Thanhtien;
    }

    public BigDecimal getTienkhachtra() {
        return tienkhachtra;
    }

    public void setTienkhachtra(BigDecimal tienkhachtra) {
        this.tienkhachtra = tienkhachtra;
    }

    public BigDecimal getTientralai() {
        return tientralai;
    }

    public void setTientralai(BigDecimal tientralai) {
        this.tientralai = tientralai;
    }

    
    public int getMahoadon() {
        return Mahoadon;
    }

    public void setMahoadon(int Mahoadon) {
        this.Mahoadon = Mahoadon;
    }

    public int getMakhach() {
        return Makhach;
    }

    public void setMakhach(int Makhach) {
        this.Makhach = Makhach;
    }

    public String getTenkhach() {
        return Tenkhach;
    }

    public void setTenkhach(String Tenkhach) {
        this.Tenkhach = Tenkhach;
    }

    public String getNgaylap() {
        return Ngaylap;
    }

    public void setNgaylap(String Ngaylap) {
        this.Ngaylap = Ngaylap;
    }

    public int getTongsl() {
        return Tongsl;
    }

    public void setTongsl(int Tongsl) {
        this.Tongsl = Tongsl;
    }


    public String getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
   
   
}
