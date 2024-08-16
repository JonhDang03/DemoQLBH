/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

import java.util.Date;

/*
 * @author FPT
*/
public class Nguoi_DTO {
    private String ten;
    private String diaChi;
    private String ngaySinh;

    public Nguoi_DTO() {
    }

    public Nguoi_DTO(String ten, String ngaySinh, String diachi) {
        this.ten = ten;
        this.diaChi = diachi;
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
