
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_DTO;

/**
 *
 * @author FPT
 */
public class QuanLy_DTO extends Nguoi_DTO{
    private String maNV;
    private String SDT;
    private String maTK;
    private String user;
    private String pass;

    public QuanLy_DTO() {
    }

    public QuanLy_DTO(String maNV, String SDT, String maTK, String user, String pass) {
        this.maNV = maNV;
        this.SDT = SDT;
        this.maTK = maTK;
        this.user = user;
        this.pass = pass;
    }

    
    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
         
}
