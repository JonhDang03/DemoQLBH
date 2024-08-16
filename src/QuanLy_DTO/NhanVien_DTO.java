/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

/**
 *
 * @author dangm
 */
public class NhanVien_DTO extends Nguoi_DTO{
    String MaNV;
    String SDT;

    public NhanVien_DTO() {
    }

    public NhanVien_DTO(String MaNV, String SDT) {
        this.MaNV = MaNV;
        this.SDT = SDT;
    }

    
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    
}
