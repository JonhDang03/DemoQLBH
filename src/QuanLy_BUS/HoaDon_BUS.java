/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_BUS;

import QuanLy_DAO.HoaDonDAO;
import QuanLy_DAO.KhachHangDAO;
import QuanLy_DAO.SanPhamDAO;
import QuanLy_DTO.HoaDon_DTO;
import QuanLy_DTO.KhachHang_DTO;
import QuanLy_DTO.SanPham_DTO;
import java.util.ArrayList;

/**
 * @author dangm
 */
public class HoaDon_BUS {
    public SanPham_DTO getsp(String masp) {
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        SanPham_DTO sp = new SanPham_DTO();
        int ma = Integer.parseInt(masp);
        for (SanPham_DTO sanPham_DTO : list) {
            if (sanPham_DTO.getMaSP() == ma) {
                sp = sanPham_DTO;
                return sp;
            }
        }
        return sp;
    }
    
    public HoaDon_DTO gethd(String mahd){
      HoaDon_DTO hd = new HoaDon_DTO();
       ArrayList<HoaDon_DTO> list = new HoaDonDAO().getListHoaDon();
       int ma = 0;
        try {
         ma = Integer.parseInt(mahd);
        } catch (Exception e) {
        }
        for (HoaDon_DTO hdd : list) {
            if (hdd.getMahoadon() == ma) {
                hd = hdd;
                return hd;
            }
        }
      
      return null;
    }

    public boolean addhd(HoaDon_DTO hd){
        if(hd.getMakhach()==0){
          new HoaDonDAO().suaHoaDonNullmk(hd);
          return true;
        }else{
          new HoaDonDAO().suaHoaDon(hd);
          return true;
        }
    }
    public KhachHang_DTO getkh(String mak) {
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        KhachHang_DTO kh = new KhachHang_DTO();
        int ma = Integer.parseInt(mak);
        for (KhachHang_DTO list1 : list) {
            if (list1.getMak() == ma) {
                kh = list1;
                return kh;
            }
        }
        return kh;
    }
    
    public int newmahd(){
       ArrayList<HoaDon_DTO> list = new HoaDonDAO().getListHoaDon();
       int ma=0 ;
        for (HoaDon_DTO hd : list) {
          if(hd.getMahoadon() > ma){
            ma = hd.getMahoadon();
          }  
        }
        return ma;
    }

    public boolean decrease(int masp, int sl) {
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
          for (SanPham_DTO sp : list) {
            if(sp.getMaSP() == masp && sp.getSoLuong() <= 0){
             return false;
            }
        }
        return new SanPhamDAO().giamsoluong(masp,sl);
    }
    
    public boolean tangdiemTl(int mak){
        return new KhachHangDAO().tangdiemtichluy(mak);
    }

}
