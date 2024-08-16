/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy_BUS;

import QuanLy_DAO.KhuyenMaiDAO;
import QuanLy_DTO.KhuyenMai_DTO;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
public class KhuyenMai_BUS {
    
    public KhuyenMai_DTO getkm(int ma){
        KhuyenMai_DTO list = new KhuyenMaiDAO().getKhuyenMai(ma);
        return list;
    }

    public boolean checkso(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //băts định dạng ngày sinh
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

    public String checkKM(KhuyenMai_DTO km) {
        ArrayList<KhuyenMai_DTO> listkhuyenmai = new KhuyenMaiDAO().getListKhuyenMai();
        int check = 0;
        try {
            for (KhuyenMai_DTO listkm : listkhuyenmai) {
                if (listkm.getMakm() == km.getMakm()) {
                    check = 1;
                }
            }
        } catch (Exception e) {
        }

        if (check == 1) {
            return "Khuyến mãi này đã tồn tại !!";
        }
        //bắt lỗi ngày thangs năm     
        DateValidator validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");
        if (!validator.isValid(km.getNgaybd()) || !validator.isValid(km.getNgaykt())) {
            return "Nhập sai định dạng ngày bắt đầu hoặc kết thúc";
        }

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = format.parse(km.getNgaybd());
            Date d2 = format.parse(km.getNgaykt());
            if (!d1.before(d2) && d1.compareTo(d2) != 0) {
                return "Sai định dạng ngày bắt đầu và ngày kết thúc!";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (km.getGiatrikm() < 0 || km.getGiatrikm() > 100) {
            return "Giá trị khuyến mại không hợp lệ!";
        }
        if (new KhuyenMaiDAO().addKM(km)) {
            return "Thêm thành công!";
        } else {
            return "Thêm không thành công !";
        }
    }

    public String checksuaKM(KhuyenMai_DTO km) {
        ArrayList<KhuyenMai_DTO> listkhuyenmai = new KhuyenMaiDAO().getListKhuyenMai();

        //bắt lỗi ngày thangs năm     
        DateValidator validator = new DateValidatorUsingDateFormat("dd/MM/yyyy");
        if (!validator.isValid(km.getNgaybd()) || !validator.isValid(km.getNgaykt())) {
            return "Nhập sai định dạng ngày bắt đầu hoặc kết thúc";
        }
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date d1 = format.parse(km.getNgaybd());
            Date d2 = format.parse(km.getNgaykt());
            if (!d1.before(d2) && d1.compareTo(d2) != 0) {
                return "Sai định dạng ngày bắt đầu và ngày kết thúc!";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (km.getGiatrikm() < 0 || km.getGiatrikm() > 100) {
            return "Giá trị khuyến mại không hợp lệ!";
        }
        if (new KhuyenMaiDAO().suaKM(km)) {
            return "Sửa thành công!";
        } else {
            return "Sửa không thành công !";
        }
    }

    public ArrayList<KhuyenMai_DTO> getlisttimkiem(int vt, String tenkm, String date) {

        ArrayList<KhuyenMai_DTO> listkm = new KhuyenMaiDAO().getlisttkkm(vt, tenkm, date);
        return listkm;
    }

    public String ChuyendoiPercent(float tile) {
        try {
             Double d = (double) tile/100;
        NumberFormat f = NumberFormat.getPercentInstance();
        return f.format((double) d);
        } catch (Exception e) {
            return "";
        }
       
    }
    public Float ChuyendoiPercent(String tile){
        try {
            tile = tile.replaceAll("[+.^:,%]","");//Xóa kí tự đặc biệt
            Float f = Float.parseFloat(tile);
            return f;
        } catch (Exception e) {
            return 0f;
        }
    }
    
}
