/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_BUS;

import QuanLy_DAO.KhachHangDAO;
import QuanLy_DTO.KhachHang_DTO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author dangm
 */
public class KhachHang_BUS {

    ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();

    public boolean checkso(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Giá trị ngày tháng đúng

    public interface DateValidator {

        boolean isValid(String dateStr);//Định nghĩa chuỗi data
    }

    public class DateValidatorUsingDateFormat implements DateValidator {

        private String dateFormat;

        public DateValidatorUsingDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public boolean isValid(String dateStr) {
            DateFormat sdf = new SimpleDateFormat(this.dateFormat);
            sdf.setLenient(false);
            try {
                sdf.parse(dateStr);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }

    public String checkkhach(KhachHang_DTO khach) {
        int check = 0;
        try {
            for (KhachHang_DTO kh : list) {
                if (kh.getMak() == khach.getMak()) {
                    check = 1;
                }
            }
        } catch (Exception e) {
        }

        if (khach.getTen().equals("") || khach.getNgaySinh().equals("")
                || khach.getDiaChi().equals("") || khach.getSDT().equals("")) {
            return "Vui lòng nhập đầy đủ thông tin !!";
        }

        if (check == 1) {
            return "Khách hàng đã tồn tại !!";
        }
        if (!checkso(khach.getSDT())) {
            return "Số điện thoại không hợp lệ";
        }
        if (checkso(khach.getTen())) {
            return "Tên khách không hợp lệ!!";
        }

        //bắt lỗi ngày sinh     
        DateValidator validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");
        if (!validator.isValid(khach.getNgaySinh())) {
            return "Nhập sai định dạng ngày sinh";
        }
        if (new KhachHangDAO().addKH(khach)) {
            return "Thêm thành công!";
        } else {
            return "Thêm không thành công !";
        }
    }
    public String checksuakhach(KhachHang_DTO khach) {

        if (khach.getTen().equals("") || khach.getNgaySinh().equals("")
                || khach.getDiaChi().equals("") || khach.getSDT().equals("")) {
            return "Vui lòng nhập đầy đủ thông tin !!";
        }

        if (!checkso(khach.getSDT())) {
            return "Số điện thoại không hợp lệ";
        }
        if (checkso(khach.getTen())) {
            return "Tên khách không hợp lệ!!";
        }

        //bắt lỗi ngày sinh     
        DateValidator validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");
        if (!validator.isValid(khach.getNgaySinh())) {
            return "Nhập sai định dạng ngày sinh";
        }
        if (new KhachHangDAO().suaKhachHang(khach)) {
            return "Sửa thành công!";
        } else {
            return "Sửa không thành công !";
        }
    }
    

    public ArrayList<KhachHang_DTO> getlisttimkiem(String mak, String diachi) {
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().Timkhachhang(mak, diachi);
        return list;
    }
    

}
