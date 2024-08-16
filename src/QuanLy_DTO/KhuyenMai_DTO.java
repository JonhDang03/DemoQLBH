/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

/**
 *
 * @author dangm
 */
public class KhuyenMai_DTO {
    int makm;
    String tenkm;
    String ngaybd;
    String ngaykt;
    Float giatrikm;
    int isdelete=0;

    public KhuyenMai_DTO() {
    }

    public KhuyenMai_DTO(int makm, String tenkm, String ngaybd, String ngaykt, Float giatrikm) {
        this.makm = makm;
        this.tenkm = tenkm;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.giatrikm = giatrikm;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
    
    

    public int getMakm() {
        return makm;
    }

    public void setMakm(int makm) {
        this.makm = makm;
    }

    public String getTenkm() {
        return tenkm;
    }

    public void setTenkm(String tenkm) {
        this.tenkm = tenkm;
    }

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public String getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    public Float getGiatrikm() {
        return giatrikm;
    }

    public void setGiatrikm(Float giatrikm) {
        this.giatrikm = giatrikm;
    }
    
     
}
