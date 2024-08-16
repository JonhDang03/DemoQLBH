/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;




/**
 *
 * @author FPT
 */
public class KhachHang_DTO extends Nguoi_DTO{
    private int Mak;
    private String Sdt;
    private int diemTichLuy;   //Điểm tích lũy
    private String Anhkh;
    int isdelete=0;

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }
       

 public KhachHang_DTO() {
    }

    public KhachHang_DTO(int mak, String SDT, int diemTichLuy) {
        this.Mak = mak;
        this.Sdt = SDT;
        this.diemTichLuy = diemTichLuy;
    }

    public String getAnhkh() {
        return Anhkh;
    }

    public void setAnhkh(String Anhkh) {
        this.Anhkh = Anhkh;
    }

    
    public int getMak() {
        return Mak;
    }

    public void setMak(int mak) {
        this.Mak = mak;
    }

    public String getSDT() {
        return Sdt;
    }

    public void setSDT(String SDT) {
        this.Sdt = SDT;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

}
