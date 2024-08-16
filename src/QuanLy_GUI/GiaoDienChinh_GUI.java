/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLy_GUI;
import ChangeCell.TableAction;
import ChangeCell.TableAction1;
import ChangeCell.TableActionEvents;
import ChangeCell.TableActionsCellEditer;
import ChangeCell.TableActionsCelledit;
import QuanLy_BUS.ChitietHD_BUS;
import QuanLy_BUS.HoaDon_BUS;
import QuanLy_BUS.KhachHang_BUS;
import QuanLy_BUS.KhuyenMai_BUS;
import QuanLy_BUS.SanPham_BUS;
import QuanLy_DAO.ChiTietHDDAO;
import QuanLy_DAO.HoaDonDAO;
import QuanLy_DAO.SanPhamDAO;
import QuanLy_DAO.KhachHangDAO;
import QuanLy_DAO.KhuyenMaiDAO;
import QuanLy_DTO.ChiTietHD_DTO;
import QuanLy_DTO.HoaDon_DTO;
import QuanLy_DTO.KhachHang_DTO;
import QuanLy_DTO.KhuyenMai_DTO;
import QuanLy_DTO.SanPham_DTO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.math.BigDecimal;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.sound.midi.Soundbank;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.math3.stat.inference.ChiSquareTest;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class GiaoDienChinh_GUI extends javax.swing.JFrame {

    private ArrayList<SanPham_DTO> listsp;
    private ArrayList<KhachHang_DTO> listkhach;
    private ArrayList<KhuyenMai_DTO> listkhuyenmai;
    private ArrayList<HoaDon_DTO> listhoadon;
    DefaultTableModel table;
    DefaultTableModel tablek;
    DefaultTableModel tablekm;
    DefaultTableModel tablehdsp;
    DefaultTableModel tablehdkh;
    private int newmaHD;

    String duongdananh = "C:\\Users\\dangm\\OneDrive\\Tài liệu\\NetBeansProjects\\QLBanMP_Nhom5\\src\\Pictures\\rsz_1addanh.jpg";

    public GiaoDienChinh_GUI() {
        initComponents();

        //Bang sản phẩm
        listsp = new SanPhamDAO().getListSanpham();
        table = (DefaultTableModel) tableSP.getModel();
        table.setColumnIdentifiers(new Object[]{"Mã SP", "Tên SP", "Loại SP", "Giá Bán", "Số Lượng", "Mã Khuyến Mại"});
        showTableSP();
        //Bảng khách hàng
        listkhach = new KhachHangDAO().getListKhachHang();
        tablek = (DefaultTableModel) tableKhach.getModel();
        tablek.setColumnIdentifiers(new Object[]{"Mã Khách", "Tên Khách", "Ngày Sinh", "Địa Chỉ", "SĐT", "Điểm Tích Lũy"});
        showtableKhach();
        docheckboxKH();

        //Bảng khuyến mại
        listkhuyenmai = new KhuyenMaiDAO().getListKhuyenMai();
        new KhuyenMaiDAO().CheckAll();
        tablekm = (DefaultTableModel) tablekhuyenmai.getModel();
        tablekm.setColumnIdentifiers(new Object[]{
            "Mã Khuyến Mại", "Tên Khuyến Mại", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị"});
        showtableKM();

        //Bảng hóa đơn
        showtablehd();
        listhoadon = new HoaDonDAO().getListHoaDon();

        //Thống kê
        showtableThongKe();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdialogSP = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jtexttensp = new javax.swing.JTextField();
        jtextgia = new javax.swing.JTextField();
        jtextslcon = new javax.swing.JTextField();
        spinnerslmua = new javax.swing.JSpinner();
        exitdialogSP = new javax.swing.JButton();
        okdialogSP = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jdialogKH = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        exitdialogKH = new javax.swing.JButton();
        okdialogKH = new javax.swing.JButton();
        anhdialogKh = new javax.swing.JLabel();
        dtldialogKH = new javax.swing.JTextField();
        sdtdialogKH = new javax.swing.JTextField();
        diachidialogKH = new javax.swing.JTextField();
        ngaysdialogKH = new javax.swing.JTextField();
        TendialogKH = new javax.swing.JTextField();
        madialogKH = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jdialogThemHD = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableChitietHD = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableSPHD = new javax.swing.JTable();
        cboxhdloaisp = new javax.swing.JComboBox<>();
        checkdongia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        checkten = new javax.swing.JTextField();
        checkDC = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableHDKH = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        btnExithd = new javax.swing.JButton();
        btnThemhd = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jlbsohoadon = new javax.swing.JLabel();
        jlbtongtien = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlbthoigianlap = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jlbdiachi = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jlbtongsl = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txttienkhachtra = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txttientralai = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jlbmak = new javax.swing.JLabel();
        txttenkhach = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jcbhdkm = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jdialogView = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        viewtablechitietHD = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        btnViewexit = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        viewmahd = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        viewngaytao = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        viewtongsl = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        viewmak = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        viewtienkt = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        viewtientl = new javax.swing.JTextField();
        viewtongtien = new javax.swing.JTextField();
        viewtenk = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        viewdiachi = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jdialogEditHD = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tableChitietHD1 = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableSPHD1 = new javax.swing.JTable();
        cboxhdloaisp1 = new javax.swing.JComboBox<>();
        checkdongia1 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        checkten1 = new javax.swing.JTextField();
        checkDC1 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        tableHDKH1 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        btnExithd1 = new javax.swing.JButton();
        btnSuahd = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jlbsohoadon1 = new javax.swing.JLabel();
        edittongtien = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jlbthoigianlap1 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jlbdiachi1 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jlbtongsl1 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        edittkhachttra = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        editttralai = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jlbmak1 = new javax.swing.JLabel();
        txttenkhach1 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jcbeditHD = new javax.swing.JComboBox<>();
        jLabel108 = new javax.swing.JLabel();
        jdialogKH1 = new javax.swing.JDialog();
        jPanel20 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        exitdialogKH1 = new javax.swing.JButton();
        okdialogKH1 = new javax.swing.JButton();
        anhdialogKh1 = new javax.swing.JLabel();
        dtldialogKH1 = new javax.swing.JTextField();
        sdtdialogKH1 = new javax.swing.JTextField();
        diachidialogKH1 = new javax.swing.JTextField();
        ngaysdialogKH1 = new javax.swing.JTextField();
        TendialogKH1 = new javax.swing.JTextField();
        madialogKH1 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jdialogSP1 = new javax.swing.JDialog();
        jPanel25 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jtexttensp1 = new javax.swing.JTextField();
        jtextgia1 = new javax.swing.JTextField();
        jtextslcon1 = new javax.swing.JTextField();
        spinnerslmua1 = new javax.swing.JSpinner();
        exitdialogSP1 = new javax.swing.JButton();
        okdialogSP1 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jdialogThanhtoan = new javax.swing.JDialog();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        viewtablechitietHD1 = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        btnViewexit1 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        viewmahd1 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        viewngaytao1 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        viewtongsl1 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        viewmak1 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        viewtienkt1 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        viewtientl1 = new javax.swing.JTextField();
        viewtongtien1 = new javax.swing.JTextField();
        viewtenk1 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        viewdiachi1 = new javax.swing.JLabel();
        btnViewexit2 = new javax.swing.JButton();
        btnQR = new javax.swing.JButton();
        jLabel120 = new javax.swing.JLabel();
        QR = new javax.swing.JDialog();
        jPanel32 = new javax.swing.JPanel();
        btsetdathanhtoan = new javax.swing.JButton();
        anhQR = new javax.swing.JLabel();
        qrma = new javax.swing.JLabel();
        tk_dialogDoanhthu = new javax.swing.JDialog();
        jPanel31 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        dt_slsp = new javax.swing.JLabel();
        dt_slhd = new javax.swing.JLabel();
        dt_tongtien = new javax.swing.JLabel();
        tk_dtExit = new javax.swing.JButton();
        GiaoDienQL = new javax.swing.JTabbedPane();
        QLSanPham = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        anhsp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        masp = new javax.swing.JTextField();
        tensp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        giaban = new javax.swing.JTextField();
        soluong = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        loaisp = new javax.swing.JTextField();
        ChonanhSP = new javax.swing.JButton();
        spcomboxkm = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        themSP = new javax.swing.JButton();
        xoaSP = new javax.swing.JButton();
        suaSP = new javax.swing.JButton();
        lammoisp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        timkiemsp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        combobox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txttieuchi = new javax.swing.JTextField();
        QLKhachHang = new javax.swing.JPanel();
        Form = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        anhkh = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        makhach = new javax.swing.JTextField();
        tenkhach = new javax.swing.JTextField();
        ngaysinh = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        diachi = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        diemtl = new javax.swing.JTextField();
        ChonanhKH = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbtthemkh = new javax.swing.JButton();
        jbtsuakh = new javax.swing.JButton();
        jbtxoakh = new javax.swing.JButton();
        jbtlammoikh = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKhach = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jbttimkiemkh = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cboxkhach = new javax.swing.JComboBox<>();
        cboxdiachi = new javax.swing.JComboBox<>();
        QLKhuyenMai = new javax.swing.JPanel();
        FormKM = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        themkm = new javax.swing.JButton();
        jbtxoa = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jbtlammoikm = new javax.swing.JButton();
        jbtsuakm = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btntimkiemkm = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cboxtieuchi = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txttieuchiten = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cboxtcngay = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablekhuyenmai = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        txttenkm = new javax.swing.JTextField();
        txtmakm = new javax.swing.JTextField();
        txtngaybd = new javax.swing.JTextField();
        txtngaykt = new javax.swing.JTextField();
        txtgiarti = new javax.swing.JTextField();
        QLHoaDon = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableqlhd = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        ThemHD = new javax.swing.JButton();
        ThanhToan = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jcomboTrangthai = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jcbngaylaphd = new javax.swing.JComboBox<>();
        QLThongKe = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tk_tableSP = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tk_tableKH = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tk_tableHD = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        tk_comboxtieuchi = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        tk_tke = new javax.swing.JButton();
        tk_thongkedoanhthu = new javax.swing.JButton();
        tk_tatca = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();

        jdialogSP.setTitle("Form xác nhận thông tin Sản  Phẩm");
        jdialogSP.setMinimumSize(new java.awt.Dimension(460, 350));
        jdialogSP.setModal(true);

        jPanel18.setBackground(new java.awt.Color(255, 204, 153));
        jPanel18.setMinimumSize(new java.awt.Dimension(460, 350));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel38.setText("Lựa chọn số lượng sản phẩm");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Tên sản phẩm :");

        jtexttensp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtexttensp.setEnabled(false);

        jtextgia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtextgia.setEnabled(false);

        jtextslcon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtextslcon.setEnabled(false);

        spinnerslmua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerslmua.setAutoscrolls(true);

        exitdialogSP.setBackground(new java.awt.Color(255, 51, 0));
        exitdialogSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitdialogSP.setText("Exit");
        exitdialogSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitdialogSPActionPerformed(evt);
            }
        });

        okdialogSP.setBackground(new java.awt.Color(0, 255, 102));
        okdialogSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okdialogSP.setText("OK");
        okdialogSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdialogSPActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Giá :");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Số lượng còn :");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Nhập số lượng mua :");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerslmua)
                            .addComponent(jtextgia)
                            .addComponent(jtextslcon)
                            .addComponent(jtexttensp, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(exitdialogSP, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okdialogSP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel38)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextgia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtextslcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerslmua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitdialogSP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okdialogSP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdialogSPLayout = new javax.swing.GroupLayout(jdialogSP.getContentPane());
        jdialogSP.getContentPane().setLayout(jdialogSPLayout);
        jdialogSPLayout.setHorizontalGroup(
            jdialogSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogSPLayout.setVerticalGroup(
            jdialogSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jdialogKH.setTitle("Form xác nhận thông tin Khách Hàng");
        jdialogKH.setBackground(new java.awt.Color(255, 204, 153));
        jdialogKH.setMinimumSize(new java.awt.Dimension(800, 420));
        jdialogKH.setModal(true);

        jPanel19.setBackground(new java.awt.Color(255, 204, 153));
        jPanel19.setAutoscrolls(true);
        jPanel19.setMaximumSize(null);
        jPanel19.setRequestFocusEnabled(false);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel51.setText("Xác nhận thông tin Khách Hàng");

        exitdialogKH.setBackground(new java.awt.Color(255, 51, 0));
        exitdialogKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitdialogKH.setText("Exit");
        exitdialogKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitdialogKHActionPerformed(evt);
            }
        });

        okdialogKH.setBackground(new java.awt.Color(0, 255, 51));
        okdialogKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okdialogKH.setText("ỌK");
        okdialogKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdialogKHActionPerformed(evt);
            }
        });

        anhdialogKh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/rsz_1addanh.jpg"))); // NOI18N
        anhdialogKh.setText("jLabel3");

        dtldialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sdtdialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        diachidialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ngaysdialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TendialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        madialogKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        madialogKH.setEnabled(false);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel58.setText("Điểm tlũy :");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setText("SDT :");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setText("Địa Chỉ :");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel54.setText("Ngày Sinh :");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setText("Tên :");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setText("Mã :");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(exitdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(anhdialogKh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(madialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TendialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaysdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diachidialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sdtdialogKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtldialogKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anhdialogKh)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diachidialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TendialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdtdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaysdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtldialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okdialogKH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jdialogKHLayout = new javax.swing.GroupLayout(jdialogKH.getContentPane());
        jdialogKH.getContentPane().setLayout(jdialogKHLayout);
        jdialogKHLayout.setHorizontalGroup(
            jdialogKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogKHLayout.setVerticalGroup(
            jdialogKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialogKHLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdialogThemHD.setTitle("Form Thêm Hóa Đơn");
        jdialogThemHD.setMinimumSize(new java.awt.Dimension(1153, 630));

        jPanel7.setBackground(new java.awt.Color(255, 204, 153));

        tableChitietHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableChitietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã SP", "Số lượng", "Mã KM", "Giá bán", "Tổng KM ", "Tổng Tiền", "Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChitietHD.setRowHeight(25);
        jScrollPane3.setViewportView(tableChitietHD);

        jPanel14.setBackground(new java.awt.Color(91, 209, 215));
        jPanel14.setDoubleBuffered(false);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setText("Thông tin sản phẩm:");

        tableSPHD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableSPHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableSPHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSPHD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSPHD.setOpaque(false);
        tableSPHD.setRequestFocusEnabled(false);
        tableSPHD.setShowGrid(false);
        tableSPHD.setUpdateSelectionOnSort(false);
        tableSPHD.setVerifyInputWhenFocusTarget(false);
        tableSPHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPHDMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tableSPHD);

        cboxhdloaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxhdloaispActionPerformed(evt);
            }
        });

        checkdongia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkdongiaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Đơn giá :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Loại sản phẩm :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkdongia)
                            .addComponent(cboxhdloaisp, 0, 190, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxhdloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(91, 209, 215));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Thông tin khách hàng:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("Địa Chỉ :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText("Tên Khách :");

        checkten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checktenKeyReleased(evt);
            }
        });

        checkDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkDCKeyReleased(evt);
            }
        });

        tableHDKH.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableHDKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableHDKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHDKHMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tableHDKH);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkDC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkten, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel33))
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkten, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(91, 209, 215));

        btnExithd.setBackground(new java.awt.Color(255, 51, 0));
        btnExithd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExithd.setText("Exit");
        btnExithd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExithdActionPerformed(evt);
            }
        });

        btnThemhd.setBackground(new java.awt.Color(0, 255, 0));
        btnThemhd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemhd.setText("Thêm");
        btnThemhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemhdActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Mã hóa đơn :");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Tên khách hàng :");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Tổng tiền :");

        jlbsohoadon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jlbtongtien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbtongtien.setText("0");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Thời gian lập :");

        jlbthoigianlap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setText("Địa Chỉ :");

        jlbdiachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Tổng số lượng :");

        jlbtongsl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbtongsl.setText("0");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Tiền khách trả :");

        txttienkhachtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttienkhachtraKeyReleased(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setText("Tiền trả lại :");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Mã Khách :");

        jlbmak.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText("Mã KM :");

        jcbhdkm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcbhdkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbhdkmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExithd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel55)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jlbsohoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbmak, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbhdkm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbthoigianlap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addComponent(txttenkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addComponent(txttienkhachtra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttientralai, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jlbtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbdiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jlbtongsl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemhd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbthoigianlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jlbmak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbsohoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbhdkm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttenkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbtongsl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttientralai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttienkhachtra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemhd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExithd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setText("Bảng Thông Tin Hóa Đơn:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jdialogThemHDLayout = new javax.swing.GroupLayout(jdialogThemHD.getContentPane());
        jdialogThemHD.getContentPane().setLayout(jdialogThemHDLayout);
        jdialogThemHDLayout.setHorizontalGroup(
            jdialogThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogThemHDLayout.setVerticalGroup(
            jdialogThemHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jdialogView.setTitle("View Hóa Đơn");
        jdialogView.setMinimumSize(new java.awt.Dimension(1153, 630));

        jPanel13.setBackground(new java.awt.Color(255, 204, 153));

        viewtablechitietHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        viewtablechitietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã SP", "Số lượng", "Mã KM", "Giá bán", "Tổng KM ", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(viewtablechitietHD);

        jPanel24.setBackground(new java.awt.Color(91, 209, 215));

        btnViewexit.setBackground(new java.awt.Color(255, 51, 0));
        btnViewexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewexit.setText("Exit");
        btnViewexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewexitActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("Thông Tin Chi Tiết Hóa Đơn :");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setText("Mã hóa đơn :");

        viewmahd.setText("jLabel70");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setText("Ngày tạo :");

        viewngaytao.setText("jLabel72");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setText("Tổng Số Lượng :");

        viewtongsl.setText("jLabel74");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setText("Tổng Tiền :");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setText("Mã khách :");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel77.setText("Tiền Khách Trả :");

        viewmak.setText("jLabel78");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setText("Tên Khách :");

        viewtienkt.setText("jTextField1");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setText("Tiền Trả Lại :");

        viewtientl.setText("jTextField2");

        viewtongtien.setText("jTextField3");

        viewtenk.setText("jTextField4");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText("Địa Chỉ :");

        viewdiachi.setText("jLabel83");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewmahd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewmak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewtongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addGap(18, 18, 18)
                                .addComponent(viewtienkt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewtenk)
                                    .addComponent(viewngaytao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewtientl, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(viewtongsl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewdiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewexit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewtongsl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewmak, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewtenk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewdiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtienkt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtientl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnViewexit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel82.setText("Bảng Thông Tin Hóa Đơn:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jdialogViewLayout = new javax.swing.GroupLayout(jdialogView.getContentPane());
        jdialogView.getContentPane().setLayout(jdialogViewLayout);
        jdialogViewLayout.setHorizontalGroup(
            jdialogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogViewLayout.setVerticalGroup(
            jdialogViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jdialogEditHD.setTitle("Edit Hóa Đơn");
        jdialogEditHD.setMinimumSize(new java.awt.Dimension(1153, 630));

        jPanel23.setBackground(new java.awt.Color(255, 204, 153));

        tableChitietHD1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableChitietHD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã SP", "Số lượng", "Mã KM", "Giá bán", "Tổng KM ", "Tổng Tiền", "Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChitietHD1.setRowHeight(25);
        jScrollPane13.setViewportView(tableChitietHD1);

        jPanel26.setBackground(new java.awt.Color(91, 209, 215));
        jPanel26.setDoubleBuffered(false);

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel92.setText("Thông tin sản phẩm:");

        tableSPHD1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableSPHD1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableSPHD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSPHD1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSPHD1.setOpaque(false);
        tableSPHD1.setRequestFocusEnabled(false);
        tableSPHD1.setShowGrid(false);
        tableSPHD1.setUpdateSelectionOnSort(false);
        tableSPHD1.setVerifyInputWhenFocusTarget(false);
        tableSPHD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPHD1MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tableSPHD1);

        cboxhdloaisp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxhdloaisp1ActionPerformed(evt);
            }
        });

        checkdongia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkdongia1KeyReleased(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel93.setText("Đơn giá :");

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel94.setText("Loại sản phẩm :");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel92))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkdongia1)
                            .addComponent(cboxhdloaisp1, 0, 190, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkdongia1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxhdloaisp1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(91, 209, 215));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel95.setText("Thông tin khách hàng:");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel96.setText("Địa Chỉ :");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel97.setText("Tên Khách :");

        checkten1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkten1KeyReleased(evt);
            }
        });

        checkDC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkDC1KeyReleased(evt);
            }
        });

        tableHDKH1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableHDKH1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableHDKH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHDKH1MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tableHDKH1);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkDC1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkten1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel95))
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkten1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(91, 209, 215));

        btnExithd1.setBackground(new java.awt.Color(255, 51, 0));
        btnExithd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExithd1.setText("Exit");
        btnExithd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExithd1ActionPerformed(evt);
            }
        });

        btnSuahd.setBackground(new java.awt.Color(0, 255, 0));
        btnSuahd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuahd.setText("Sửa");
        btnSuahd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuahdActionPerformed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setText("Mã hóa đơn :");

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel99.setText("Tên khách hàng :");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setText("Tổng tiền :");

        jlbsohoadon1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        edittongtien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel101.setText("Thời gian lập :");

        jlbthoigianlap1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel102.setText("Địa Chỉ :");

        jlbdiachi1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel103.setText("Tổng số lượng :");

        jlbtongsl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlbtongsl1.setText("0");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel104.setText("Tiền khách trả :");

        edittkhachttra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edittkhachttraKeyReleased(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel105.setText("Tiền trả lại :");

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel106.setText("Mã Khách :");

        jlbmak1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel107.setText("Mã KM :");

        jcbeditHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcbeditHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbeditHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExithd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel98)
                        .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jlbsohoadon1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbmak1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbeditHD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbthoigianlap1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                                .addComponent(txttenkhach1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel28Layout.createSequentialGroup()
                                .addComponent(edittkhachttra, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editttralai, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(edittongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbdiachi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jlbtongsl1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSuahd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbthoigianlap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jlbmak1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbsohoadon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbeditHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbdiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttenkhach1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edittongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbtongsl1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editttralai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edittkhachttra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuahd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExithd1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel108.setText("Bảng Thông Tin Hóa Đơn:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jdialogEditHDLayout = new javax.swing.GroupLayout(jdialogEditHD.getContentPane());
        jdialogEditHD.getContentPane().setLayout(jdialogEditHDLayout);
        jdialogEditHDLayout.setHorizontalGroup(
            jdialogEditHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogEditHDLayout.setVerticalGroup(
            jdialogEditHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jdialogKH1.setTitle("Form xác nhận thông tin Khách Hàng");
        jdialogKH1.setBackground(new java.awt.Color(255, 204, 153));
        jdialogKH1.setMinimumSize(new java.awt.Dimension(800, 420));
        jdialogKH1.setModal(true);

        jPanel20.setBackground(new java.awt.Color(255, 204, 153));
        jPanel20.setAutoscrolls(true);
        jPanel20.setMaximumSize(null);
        jPanel20.setRequestFocusEnabled(false);

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel72.setText("Xác nhận thông tin Khách Hàng");

        exitdialogKH1.setBackground(new java.awt.Color(255, 51, 0));
        exitdialogKH1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitdialogKH1.setText("Exit");
        exitdialogKH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitdialogKH1ActionPerformed(evt);
            }
        });

        okdialogKH1.setBackground(new java.awt.Color(0, 255, 51));
        okdialogKH1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okdialogKH1.setText("ỌK");
        okdialogKH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdialogKH1ActionPerformed(evt);
            }
        });

        anhdialogKh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/rsz_1addanh.jpg"))); // NOI18N
        anhdialogKh1.setText("jLabel3");

        dtldialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sdtdialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        diachidialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ngaysdialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TendialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        madialogKH1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        madialogKH1.setEnabled(false);

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel74.setText("Điểm tlũy :");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setText("SDT :");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel83.setText("Địa Chỉ :");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel85.setText("Ngày Sinh :");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel86.setText("Tên :");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setText("Mã :");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(exitdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(anhdialogKh1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(madialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TendialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaysdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(diachidialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sdtdialogKH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtldialogKH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anhdialogKh1)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diachidialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TendialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdtdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaysdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtldialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okdialogKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jdialogKH1Layout = new javax.swing.GroupLayout(jdialogKH1.getContentPane());
        jdialogKH1.getContentPane().setLayout(jdialogKH1Layout);
        jdialogKH1Layout.setHorizontalGroup(
            jdialogKH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogKH1Layout.setVerticalGroup(
            jdialogKH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialogKH1Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jdialogSP1.setTitle("Form xác nhận thông tin Sản  Phẩm");
        jdialogSP1.setMinimumSize(new java.awt.Dimension(460, 350));
        jdialogSP1.setModal(true);

        jPanel25.setBackground(new java.awt.Color(255, 204, 153));
        jPanel25.setMinimumSize(new java.awt.Dimension(460, 350));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel88.setText("Lựa chọn số lượng sản phẩm");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setText("Tên sản phẩm :");

        jtexttensp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtexttensp1.setEnabled(false);

        jtextgia1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtextgia1.setEnabled(false);

        jtextslcon1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtextslcon1.setEnabled(false);

        spinnerslmua1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerslmua1.setAutoscrolls(true);

        exitdialogSP1.setBackground(new java.awt.Color(255, 51, 0));
        exitdialogSP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitdialogSP1.setText("Exit");
        exitdialogSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitdialogSP1ActionPerformed(evt);
            }
        });

        okdialogSP1.setBackground(new java.awt.Color(0, 255, 102));
        okdialogSP1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okdialogSP1.setText("OK");
        okdialogSP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdialogSP1ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel90.setText("Giá :");

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel91.setText("Số lượng còn :");

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel109.setText("Nhập số lượng mua :");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerslmua1)
                            .addComponent(jtextgia1)
                            .addComponent(jtextslcon1)
                            .addComponent(jtexttensp1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(exitdialogSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okdialogSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel88)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexttensp1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtextslcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerslmua1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitdialogSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okdialogSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jdialogSP1Layout = new javax.swing.GroupLayout(jdialogSP1.getContentPane());
        jdialogSP1.getContentPane().setLayout(jdialogSP1Layout);
        jdialogSP1Layout.setHorizontalGroup(
            jdialogSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogSP1Layout.setVerticalGroup(
            jdialogSP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jdialogThanhtoan.setTitle("Thanh Toán Hóa Đơn");
        jdialogThanhtoan.setMinimumSize(new java.awt.Dimension(1153, 630));

        jPanel29.setBackground(new java.awt.Color(255, 204, 153));

        viewtablechitietHD1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        viewtablechitietHD1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã SP", "Số lượng", "Mã KM", "Giá bán", "Tổng KM ", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(viewtablechitietHD1);

        jPanel30.setBackground(new java.awt.Color(91, 209, 215));

        btnViewexit1.setBackground(new java.awt.Color(255, 51, 0));
        btnViewexit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewexit1.setText("Exit");
        btnViewexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewexit1ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel110.setText("Thông Tin Chi Tiết Hóa Đơn :");

        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel111.setText("Mã hóa đơn :");

        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel112.setText("Ngày tạo :");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel113.setText("Tổng Số Lượng :");

        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel114.setText("Tổng Tiền :");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel115.setText("Mã khách :");

        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel116.setText("Tiền Khách Trả :");

        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel117.setText("Tên Khách :");

        viewtienkt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                viewtienkt1KeyReleased(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel118.setText("Tiền Trả Lại :");

        viewtongtien1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewtongtien1.setEnabled(false);

        viewtenk1.setBackground(new java.awt.Color(240, 240, 240));
        viewtenk1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewtenk1.setEnabled(false);

        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel119.setText("Địa Chỉ :");

        btnViewexit2.setBackground(new java.awt.Color(255, 51, 0));
        btnViewexit2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewexit2.setText("Thanh Toán");
        btnViewexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewexit2ActionPerformed(evt);
            }
        });

        btnQR.setBackground(new java.awt.Color(0, 255, 102));
        btnQR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQR.setText("Quét QR");
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewmahd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewmak1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewtongtien1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(jLabel116)
                                        .addGap(18, 18, 18)
                                        .addComponent(viewtienkt1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(viewtenk1)
                                            .addComponent(viewngaytao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewtientl1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(viewtongsl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewdiachi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(btnViewexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewmahd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewtongsl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewngaytao1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewmak1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewtenk1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewdiachi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtienkt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtientl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewtongtien1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel120.setText("Bảng Thông Tin Hóa Đơn:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jdialogThanhtoanLayout = new javax.swing.GroupLayout(jdialogThanhtoan.getContentPane());
        jdialogThanhtoan.getContentPane().setLayout(jdialogThanhtoanLayout);
        jdialogThanhtoanLayout.setHorizontalGroup(
            jdialogThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jdialogThanhtoanLayout.setVerticalGroup(
            jdialogThanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        QR.setTitle("Form xác nhận thông tin Sản  Phẩm");
        QR.setMinimumSize(new java.awt.Dimension(800, 790));

        jPanel32.setBackground(new java.awt.Color(0, 255, 255));

        btsetdathanhtoan.setBackground(new java.awt.Color(0, 255, 51));
        btsetdathanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btsetdathanhtoan.setText("Đã Thanh Toán");
        btsetdathanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsetdathanhtoanActionPerformed(evt);
            }
        });

        qrma.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anhQR, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qrma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btsetdathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(anhQR, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsetdathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qrma))
                .addContainerGap())
        );

        javax.swing.GroupLayout QRLayout = new javax.swing.GroupLayout(QR.getContentPane());
        QR.getContentPane().setLayout(QRLayout);
        QRLayout.setHorizontalGroup(
            QRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRLayout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        QRLayout.setVerticalGroup(
            QRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRLayout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tk_dialogDoanhthu.setMinimumSize(new java.awt.Dimension(490, 390));
        tk_dialogDoanhthu.setModal(true);

        jPanel31.setBackground(new java.awt.Color(91, 209, 215));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel121.setText("Thống kê doanh thu trong ngày ");

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel122.setText("Tổng số sản phẩm được bán trong ngày :");

        jLabel123.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel123.setText("Tổng số hóa đơn được tạo trong ngày :");

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel124.setText("Tổng số tiền kiếm được trong ngày :");

        dt_slsp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        dt_slhd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        dt_tongtien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        tk_dtExit.setBackground(new java.awt.Color(253, 80, 37));
        tk_dtExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tk_dtExit.setText("Exit");
        tk_dtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tk_dtExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel121)
                .addGap(112, 112, 112))
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tk_dtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(dt_tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dt_slhd, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(dt_slsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel122, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(dt_slsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dt_slhd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dt_tongtien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(tk_dtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout tk_dialogDoanhthuLayout = new javax.swing.GroupLayout(tk_dialogDoanhthu.getContentPane());
        tk_dialogDoanhthu.getContentPane().setLayout(tk_dialogDoanhthuLayout);
        tk_dialogDoanhthuLayout.setHorizontalGroup(
            tk_dialogDoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tk_dialogDoanhthuLayout.setVerticalGroup(
            tk_dialogDoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tk_dialogDoanhthuLayout.createSequentialGroup()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        setResizable(false);

        GiaoDienQL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        QLSanPham.setBackground(new java.awt.Color(255, 204, 153));

        jPanel1.setBackground(new java.awt.Color(91, 209, 215));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thông tin sản phẩm :");

        anhsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/rsz_1addanh.jpg"))); // NOI18N
        anhsp.setText("jLabel3");

        jLabel7.setText("Mã SP :");

        jLabel8.setText("Tên SP :");

        jLabel9.setText("Số Lượng :");

        masp.setEditable(false);
        masp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        masp.setEnabled(false);

        jLabel10.setText("Giá Bán :");

        jLabel11.setText("Mã Khuyến Mại :");

        jLabel20.setText("Loại SP :");

        ChonanhSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChonanhSP.setText("Chọn Ảnh");
        ChonanhSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChonanhSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(anhsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(masp, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(tensp)
                            .addComponent(loaisp))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soluong, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(giaban)
                            .addComponent(spcomboxkm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(ChonanhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(masp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(giaban, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tensp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spcomboxkm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(anhsp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(ChonanhSP)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(91, 209, 215));
        jPanel2.setName("Chức năng"); // NOI18N

        themSP.setBackground(new java.awt.Color(51, 255, 51));
        themSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        themSP.setText("Thêm ");
        themSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSPActionPerformed(evt);
            }
        });

        xoaSP.setBackground(new java.awt.Color(255, 0, 0));
        xoaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xoaSP.setText("Xóa");
        xoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaSPActionPerformed(evt);
            }
        });

        suaSP.setBackground(new java.awt.Color(255, 255, 0));
        suaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        suaSP.setText("Sửa");
        suaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaSPActionPerformed(evt);
            }
        });

        lammoisp.setBackground(new java.awt.Color(51, 255, 255));
        lammoisp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lammoisp.setText("Làm mới");
        lammoisp.setMaximumSize(null);
        lammoisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lammoispActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Chức Năng :  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(themSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(suaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lammoisp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lammoisp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(themSP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableSP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Loại SP", "Giá Bán", "Số Lượng", "Mã Khuyến Mại"
            }
        ));
        tableSP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableSP.setPreferredSize(null);
        tableSP.setRowHeight(20);
        jScrollPane1.setViewportView(tableSP);

        jPanel3.setBackground(new java.awt.Color(91, 209, 215));

        timkiemsp.setBackground(new java.awt.Color(0, 255, 0));
        timkiemsp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timkiemsp.setText("Tím Kiếm");
        timkiemsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemspActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tìm Kiếm :");

        combobox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã SP", "Tìm kiếm theo loại SP", "Tìm kiếm theo giá SP (Lớn hơn giá tìm kiếm)" }));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tiêu chí :");

        txttieuchi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combobox1, 0, 300, Short.MAX_VALUE)
                    .addComponent(txttieuchi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(timkiemsp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(timkiemsp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QLSanPhamLayout = new javax.swing.GroupLayout(QLSanPham);
        QLSanPham.setLayout(QLSanPhamLayout);
        QLSanPhamLayout.setHorizontalGroup(
            QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(QLSanPhamLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLSanPhamLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        QLSanPhamLayout.setVerticalGroup(
            QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLSanPhamLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QLSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );

        GiaoDienQL.addTab("QL Sản Phẩm", QLSanPham);

        Form.setBackground(new java.awt.Color(255, 204, 153));

        jPanel4.setBackground(new java.awt.Color(91, 209, 215));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Thông tin khách hàng :");

        anhkh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/rsz_1addanh.jpg"))); // NOI18N
        anhkh.setText("jLabel3");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Mã Khách :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Tên Khách :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Ngày Sinh :");

        makhach.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Địa chỉ :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("SDT :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Điểm tích lũy:");

        ChonanhKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChonanhKH.setText("Chọn Ảnh");
        ChonanhKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChonanhKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(anhkh, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makhach, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tenkhach)
                    .addComponent(ngaysinh))
                .addGap(100, 100, 100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diemtl, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(ChonanhKH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anhkh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(makhach, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diemtl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChonanhKH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(91, 209, 215));

        jbtthemkh.setBackground(new java.awt.Color(0, 255, 0));
        jbtthemkh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtthemkh.setText("Thêm ");
        jbtthemkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtthemkhActionPerformed(evt);
            }
        });

        jbtsuakh.setBackground(new java.awt.Color(255, 255, 0));
        jbtsuakh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtsuakh.setText("Sửa");
        jbtsuakh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsuakhActionPerformed(evt);
            }
        });

        jbtxoakh.setBackground(new java.awt.Color(255, 51, 51));
        jbtxoakh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtxoakh.setText("Xóa");
        jbtxoakh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtxoakhActionPerformed(evt);
            }
        });

        jbtlammoikh.setBackground(new java.awt.Color(0, 255, 255));
        jbtlammoikh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtlammoikh.setText("Làm mới");
        jbtlammoikh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlammoikhActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Chức Năng :  ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbtthemkh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbtsuakh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtxoakh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jbtlammoikh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtthemkh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtsuakh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtxoakh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtlammoikh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tableKhach.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableKhach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách", "Tên Khách", "Ngày Sinh", "Địa chỉ ", "SDT", "CMND/CCCD"
            }
        ));
        tableKhach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableKhach.setMinimumSize(null);
        tableKhach.setPreferredSize(null);
        tableKhach.setRowHeight(20);
        tableKhach.setShowGrid(true);
        jScrollPane2.setViewportView(tableKhach);

        jPanel6.setBackground(new java.awt.Color(91, 209, 215));

        jbttimkiemkh.setBackground(new java.awt.Color(0, 255, 0));
        jbttimkiemkh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbttimkiemkh.setText("Tím Kiếm");
        jbttimkiemkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttimkiemkhActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Theo mã khách :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Theo địa chỉ :");

        cboxkhach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboxkhach.setMaximumRowCount(100);

        cboxdiachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboxdiachi.setPreferredSize(new java.awt.Dimension(72, 36));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxkhach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxdiachi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbttimkiemkh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cboxdiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbttimkiemkh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout QLKhachHangLayout = new javax.swing.GroupLayout(QLKhachHang);
        QLKhachHang.setLayout(QLKhachHangLayout);
        QLKhachHangLayout.setHorizontalGroup(
            QLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLKhachHangLayout.createSequentialGroup()
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        QLKhachHangLayout.setVerticalGroup(
            QLKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GiaoDienQL.addTab("QL Khách Hàng", QLKhachHang);

        QLKhuyenMai.setForeground(new java.awt.Color(255, 204, 204));

        FormKM.setBackground(new java.awt.Color(255, 204, 153));

        jPanel8.setBackground(new java.awt.Color(91, 209, 215));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Thông tin khuyến mại :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(91, 209, 215));

        themkm.setBackground(new java.awt.Color(0, 255, 0));
        themkm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        themkm.setText("Thêm ");
        themkm.setMargin(new java.awt.Insets(3, 14, 3, 14));
        themkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themkmActionPerformed(evt);
            }
        });

        jbtxoa.setBackground(new java.awt.Color(255, 51, 51));
        jbtxoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtxoa.setText("Xóa");
        jbtxoa.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jbtxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtxoaActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Chức Năng :  ");

        jbtlammoikm.setBackground(new java.awt.Color(0, 255, 255));
        jbtlammoikm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtlammoikm.setText("Làm mới");
        jbtlammoikm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlammoikmActionPerformed(evt);
            }
        });

        jbtsuakm.setBackground(new java.awt.Color(255, 255, 51));
        jbtsuakm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtsuakm.setText("Sửa");
        jbtsuakm.setMargin(new java.awt.Insets(3, 14, 3, 14));
        jbtsuakm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsuakmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themkm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtsuakm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtlammoikm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtsuakm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(themkm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtlammoikm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jPanel10.setBackground(new java.awt.Color(91, 209, 215));

        btntimkiemkm.setBackground(new java.awt.Color(0, 255, 0));
        btntimkiemkm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btntimkiemkm.setText("Tìm Kiếm");
        btntimkiemkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemkmActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Tiêu Chí :");

        cboxtieuchi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo tên KM", "Ngày bắt đầu", "Ngày kết thúc" }));
        cboxtieuchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxtieuchiActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Ngày    :");

        txttieuchiten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttieuchitenKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Tìm kiếm :");

        cboxtcngay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxtieuchi, 0, 178, Short.MAX_VALUE)
                            .addComponent(cboxtcngay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(txttieuchiten, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntimkiemkm)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboxtieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttieuchiten, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(cboxtcngay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btntimkiemkm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tablekhuyenmai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tablekhuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Tên KM", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị KM"
            }
        ));
        tablekhuyenmai.setAlignmentX(0.1F);
        tablekhuyenmai.setRowHeight(20);
        jScrollPane4.setViewportView(tablekhuyenmai);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Mã KM :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Tên KM :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Ngày bắt đầu :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Ngày kết thúc :");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Giá trị KM (%) :");

        jPanel16.setBackground(new java.awt.Color(255, 204, 153));

        txtmakm.setEnabled(false);

        txtngaykt.setMinimumSize(new java.awt.Dimension(70, 35));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgiarti, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmakm, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttenkm, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtmakm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txttenkm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(txtgiarti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FormKMLayout = new javax.swing.GroupLayout(FormKM);
        FormKM.setLayout(FormKMLayout);
        FormKMLayout.setHorizontalGroup(
            FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormKMLayout.createSequentialGroup()
                .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FormKMLayout.createSequentialGroup()
                        .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormKMLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormKMLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)))
        );
        FormKMLayout.setVerticalGroup(
            FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormKMLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormKMLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FormKMLayout.createSequentialGroup()
                        .addGroup(FormKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormKMLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormKMLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout QLKhuyenMaiLayout = new javax.swing.GroupLayout(QLKhuyenMai);
        QLKhuyenMai.setLayout(QLKhuyenMaiLayout);
        QLKhuyenMaiLayout.setHorizontalGroup(
            QLKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QLKhuyenMaiLayout.setVerticalGroup(
            QLKhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormKM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE)
        );

        GiaoDienQL.addTab("QL Khuyến Mại", QLKhuyenMai);

        QLHoaDon.setBackground(new java.awt.Color(255, 204, 153));

        tableqlhd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tableqlhd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách ", "Tên Khách", "Ngày Lập", "Tổng Số Lượng", "Tổng Tiền", "Trạng Thái", "Chức năng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableqlhd.setRowHeight(25);
        jScrollPane10.setViewportView(tableqlhd);
        if (tableqlhd.getColumnModel().getColumnCount() > 0) {
            tableqlhd.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableqlhd.getColumnModel().getColumn(1).setPreferredWidth(10);
            tableqlhd.getColumnModel().getColumn(2).setMinWidth(100);
            tableqlhd.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanel21.setBackground(new java.awt.Color(91, 209, 215));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Chức năng :");

        ThemHD.setBackground(new java.awt.Color(0, 255, 0));
        ThemHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ThemHD.setText("Thêm Mới ");
        ThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemHDActionPerformed(evt);
            }
        });

        ThanhToan.setBackground(new java.awt.Color(0, 255, 255));
        ThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ThanhToan.setText("Thanh Toán");
        ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Bảng Hóa Đơn");

        jPanel22.setBackground(new java.awt.Color(91, 209, 215));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Tìm kiếm :");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel64.setText("Trạng Thái :");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setText("Ngày Lập :");

        jcomboTrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Chưa Thanh Toán", "Đã Thanh Toán", "Nợ" }));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Tìm Kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Tất Cả");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jcbngaylaphd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcomboTrangthai, 0, 243, Short.MAX_VALUE)
                    .addComponent(jcbngaylaphd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcomboTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jcbngaylaphd)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout QLHoaDonLayout = new javax.swing.GroupLayout(QLHoaDon);
        QLHoaDon.setLayout(QLHoaDonLayout);
        QLHoaDonLayout.setHorizontalGroup(
            QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
            .addGroup(QLHoaDonLayout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(QLHoaDonLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        QLHoaDonLayout.setVerticalGroup(
            QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QLHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(QLHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        GiaoDienQL.addTab("QL Hóa Đơn", QLHoaDon);

        jPanel12.setBackground(new java.awt.Color(255, 204, 153));

        tk_tableSP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tk_tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên Sản Phẩm", "Giá Bán", "Số Lương"
            }
        ));
        tk_tableSP.setMinimumSize(null);
        jScrollPane5.setViewportView(tk_tableSP);
        if (tk_tableSP.getColumnModel().getColumnCount() > 0) {
            tk_tableSP.getColumnModel().getColumn(0).setPreferredWidth(15);
            tk_tableSP.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        tk_tableKH.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tk_tableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách", "Tên Khách", "Ngày Sinh", "Địa Chỉ"
            }
        ));
        jScrollPane6.setViewportView(tk_tableKH);
        if (tk_tableKH.getColumnModel().getColumnCount() > 0) {
            tk_tableKH.getColumnModel().getColumn(0).setPreferredWidth(15);
            tk_tableKH.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        tk_tableHD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tk_tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách", "Tên Khách", "Ngày Lập ", "Tổng Số Lượng", "Tổng Tiền", "Trạng Thái"
            }
        ));
        jScrollPane7.setViewportView(tk_tableHD);
        if (tk_tableHD.getColumnModel().getColumnCount() > 0) {
            tk_tableHD.getColumnModel().getColumn(0).setPreferredWidth(15);
            tk_tableHD.getColumnModel().getColumn(1).setPreferredWidth(15);
            tk_tableHD.getColumnModel().getColumn(3).setPreferredWidth(30);
            tk_tableHD.getColumnModel().getColumn(4).setPreferredWidth(15);
            tk_tableHD.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jPanel15.setBackground(new java.awt.Color(91, 209, 215));

        tk_comboxtieuchi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tk_comboxtieuchi.setMaximumRowCount(100);
        tk_comboxtieuchi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Các mặt hàng bán được trong ngày hôm nay.", "Khách hàng mua hàng trong ngày hôm nay.", "Hóa đơn được tạo trong ngày hôm nay.", "Hóa đơn được tạo trong tháng." }));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel48.setText("Tiêu chí :");

        tk_tke.setBackground(new java.awt.Color(0, 255, 51));
        tk_tke.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tk_tke.setText("Thống kê");
        tk_tke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tk_tkeActionPerformed(evt);
            }
        });

        tk_thongkedoanhthu.setBackground(new java.awt.Color(0, 255, 255));
        tk_thongkedoanhthu.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tk_thongkedoanhthu.setText("Thống kê doanh thu");
        tk_thongkedoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tk_thongkedoanhthuActionPerformed(evt);
            }
        });

        tk_tatca.setBackground(new java.awt.Color(0, 255, 102));
        tk_tatca.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tk_tatca.setText("Tất Cả");
        tk_tatca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tk_tatcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tk_comboxtieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(tk_tke, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tk_thongkedoanhthu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tk_tatca, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tk_tke, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tk_thongkedoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tk_comboxtieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tk_tatca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Bảng thông tin khách hàng :");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Bảng thông tin sản phẩm :");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setText("Bảng thông tin hóa đơn :");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setText("Thống kê theo tiêu chí :");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel44)
                            .addGap(938, 938, 938))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel41)
                                        .addComponent(jScrollPane6))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout QLThongKeLayout = new javax.swing.GroupLayout(QLThongKe);
        QLThongKe.setLayout(QLThongKeLayout);
        QLThongKeLayout.setHorizontalGroup(
            QLThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QLThongKeLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1114, Short.MAX_VALUE)
                .addContainerGap())
        );
        QLThongKeLayout.setVerticalGroup(
            QLThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        GiaoDienQL.addTab("Thống Kê", QLThongKe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GiaoDienQL, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GiaoDienQL, javax.swing.GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Đổ dữ liệu từ SQL ra bảng
    public void showTableSP() {
        table.setRowCount(0);
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        ArrayList<KhuyenMai_DTO> list1 = new KhuyenMaiDAO().getListKhuyenMai();
        spcomboxkm.removeAllItems();
        spcomboxkm.addItem("");
        for (KhuyenMai_DTO km : list1) {
            spcomboxkm.addItem(km.getMakm() + "");
        }

        for (SanPham_DTO sp : list) {
            table.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(),
                new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
        }
        //Đổ dữ liệu từ bảng vào textfield
        tableSP.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tableSP.getSelectedRow() >= 0) {
                    masp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 0) + "");
                    tensp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 1) + "");
                    loaisp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 2) + "");
                    giaban.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 3) + "");
                    soluong.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 4) + "");
                    spcomboxkm.removeAllItems();
                    if (!(tableSP.getValueAt(tableSP.getSelectedRow(), 5) + "").equals("null")) {
                        spcomboxkm.addItem(tableSP.getValueAt(tableSP.getSelectedRow(), 5) + "");
                    } else {
                        spcomboxkm.addItem("");
                    }
                    spcomboxkm.addItem("");
                    for (KhuyenMai_DTO km : list1) {
                        spcomboxkm.addItem(km.getMakm() + "");
                    }
                    int i = Integer.parseInt(tableSP.getValueAt(tableSP.getSelectedRow(), 0).toString());
                    ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
                    for (SanPham_DTO sp : list) {
                        if (i == sp.getMaSP()) {
                            duongdananh = sp.getAnhsp();
                            anhsp.setIcon(ResizeImage(String.valueOf(sp.getAnhsp())));
                        }
                    }
                }
            }
        });
        showtableThongKe();
    }

    public boolean checkso(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

// KHÁCH HÀNG
    public void showtableKhach() {
        tablek.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        for (KhachHang_DTO kh : list) {
            tablek.addRow(new Object[]{
                kh.getMak(), kh.getTen(), kh.getNgaySinh(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
        }
        //Đổ dữ liệu từ bảng vào textfield
        tableKhach.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tableKhach.getSelectedRow() >= 0) {
                    makhach.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 0) + "");
                    tenkhach.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 1) + "");
                    ngaysinh.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 2) + "");
                    diachi.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 3) + "");
                    sdt.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 4) + "");
                    diemtl.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 5) + "");

                    int i = Integer.parseInt(tableKhach.getValueAt(tableKhach.getSelectedRow(), 0).toString());
                    ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
                    for (KhachHang_DTO kh : list) {
                        if (i == kh.getMak()) {
                            duongdananh = kh.getAnhkh();
                            anhkh.setIcon(ResizeImage(String.valueOf(kh.getAnhkh())));
                        }
                    }
                }
            }
        });
        showtableThongKe();
    }

   //đổ dữ liệu vào check box
    public void docheckboxKH() {
        //Xóa tất cả trong combobox
        cboxkhach.removeAllItems();
        cboxdiachi.removeAllItems();
        // set jcombo box cho tìm kiếm khách hàng
        List<Integer> listmakh = new ArrayList<Integer>();
        List<String> listdiachi = new ArrayList<>();
        listkhach = new KhachHangDAO().getListKhachHang();
        for (KhachHang_DTO kh : listkhach) {
            listmakh.add(kh.getMak());
            listdiachi.add(kh.getDiaChi());
        }
        //Xóa ọbject trùng nhau
        listmakh = listmakh.stream().distinct().collect(Collectors.toList());
        listdiachi = listdiachi.stream().distinct().collect(Collectors.toList());

        cboxkhach.addItem("");
        cboxdiachi.addItem("");
        for (Integer mak : listmakh) {
            cboxkhach.addItem(mak.toString());
        }
        for (String diachi : listdiachi) {
            cboxdiachi.addItem(diachi);
        }
    }

// KHUYẾN MẠI  
    public void showtableKM() {
        tablekm.setRowCount(0);
        ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
        for (KhuyenMai_DTO km : list) {
            if (km.getIsdelete() == 0) {
                tablekm.addRow(new Object[]{
                    km.getMakm(), km.getTenkm(), km.getNgaybd(), km.getNgaykt(),
                    new KhuyenMai_BUS().ChuyendoiPercent(km.getGiatrikm())});
            }
        }
        //Đổ dữ liệu từ bảng vào textfield
        tablekhuyenmai.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tablekhuyenmai.getSelectedRow() >= 0) {
                    txtmakm.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 0) + "");
                    txttenkm.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 1) + "");
                    txtngaybd.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 2) + "");
                    txtngaykt.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 3) + "");
                    txtgiarti.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 4) + "");
                }
            }
        });
    }

    public void docheckboxkhuyenmai(int index) {
        //Xóa tất cả trong combobox
        cboxtcngay.removeAllItems();
        // set jcombo box cho tìm kiếm khách hàng
        List<String> listngay = new ArrayList<String>();

        listkhuyenmai = new KhuyenMaiDAO().getListKhuyenMai();
        if (index == 1) {
            for (KhuyenMai_DTO km : listkhuyenmai) {
                listngay.add(km.getNgaybd());
            }
        }
        if (index == 2) {
            for (KhuyenMai_DTO km : listkhuyenmai) {
                listngay.add(km.getNgaykt());
            }
        }

        //Xóa ọbject trùng nhau
        listngay = listngay.stream().distinct().collect(Collectors.toList());
        cboxtcngay.addItem("");
        for (String date : listngay) {
            cboxtcngay.addItem(date);
        }
        listngay.clear();
    }
    ArrayList<ChiTietHD_DTO> listcu;
// HÓA ĐƠN
    //Show table hóa đơn

    public void showtablehd() {
        listhoadon = new HoaDonDAO().getListHoaDon();
        List<String> lists = new ArrayList<>();
        for (HoaDon_DTO hd : listhoadon) {
            lists.add(hd.getNgaylap());
        }
        lists = lists.stream().distinct().collect(Collectors.toList());
        jcbngaylaphd.removeAllItems();
        jcbngaylaphd.addItem("");
        for (String list : lists) {
            jcbngaylaphd.addItem(list);
        }
        ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(newmaHD);
        DefaultTableModel df = (DefaultTableModel) tableqlhd.getModel();
        df.setRowCount(0);
        for (HoaDon_DTO hd : listhoadon) {
            if (hd.getIsdelete() == 0) {
                df.addRow(new Object[]{
                    hd.getMahoadon(), hd.getMakhach(), hd.getTenkhach(), hd.getNgaylap(),
                    hd.getTongsl(), new SanPham_BUS().Chuyendoi(hd.getTongtien().doubleValue()), hd.getTrangthai()
                });
            }
        }

        TableActionEvents event = new TableActionEvents() {
            public void onEdit(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                HoaDon_DTO hd1 = new HoaDon_DTO();
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                    listcu = new ChiTietHDDAO().getlistCTHD(mahd);
                } catch (Exception e) {
                }
                ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(mahd);
                for (HoaDon_DTO hd : listhoadon) {
                    if (hd.getMahoadon() == mahd) {
                        hd1 = hd;
                    }
                }
                ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
                for (KhuyenMai_DTO km : list) {
                    jcbeditHD.addItem(km.getMakm() + "");
                }
                jlbsohoadon1.setText(mahd + "");
                jlbmak1.setText(hd1.getMakhach() + "");
                jlbthoigianlap1.setText(hd1.getNgaylap());
                txttenkhach1.setText(hd1.getTenkhach());
                jlbtongsl1.setText(hd1.getTongsl() + "");
                edittongtien.setText(new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()));
                KhachHang_DTO kh = new KhachHang_DTO();
                try {
                    kh = new HoaDon_BUS().getkh(hd1.getMakhach() + "");
                } catch (Exception e) {
                }
                jlbdiachi1.setText(kh.getDiaChi() + "");
                edittkhachttra.setText(new SanPham_BUS().Chuyendoi(hd1.getTienkhachtra().doubleValue()));
                editttralai.setText(new SanPham_BUS().Chuyendoi(hd1.getTientralai().doubleValue()));
                showtableHDSP1();
                showtableHDKH1();
                showtableCTHD1(mahd);
                jdialogEditHD.setLocationRelativeTo(GiaoDienQL);
                jdialogEditHD.setVisible(true);
            }

            @Override
            public void onDelete(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                } catch (Exception e) {
                }
                int tk = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không ?");
                if (tk == JOptionPane.YES_OPTION) {
                    if (new HoaDonDAO().xoaHoaDon(mahd)) {
                        JOptionPane.showMessageDialog(rootPane, "Xóa Hóa Đơn thành công !", "Thông Báo !", 1);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Xóa không thành công!", "Thông Báo !", 0);
                    }
                } else {
                    return;
                }
                showtablehd();
            }

            @Override
            public void onView(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                HoaDon_DTO hd1 = new HoaDon_DTO();
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                } catch (Exception e) {
                }
                ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(mahd);
                for (HoaDon_DTO hd : listhoadon) {
                    if (hd.getMahoadon() == mahd) {
                        hd1 = hd;
                    }
                }
                DefaultTableModel df = (DefaultTableModel) viewtablechitietHD.getModel();
                df.setRowCount(0);
                for (ChiTietHD_DTO hd : listchitiet) {

                    df.addRow(new Object[]{
                        hd.getMahoadon(), hd.getMaSP(), hd.getSoluong(), hd.getMakhuyenmai(),
                        new SanPham_BUS().Chuyendoi(hd.getGiaban()),
                        new SanPham_BUS().Chuyendoi(hd.getTongkhuyenmai().doubleValue()),
                        new SanPham_BUS().Chuyendoi(hd.getthanhtien().doubleValue())});
                }
                viewmahd.setText(mahd + "");
                viewngaytao.setText(hd1.getNgaylap() + "");
                viewtongsl.setText(hd1.getTongsl() + "");
                viewmak.setText(hd1.getMakhach() + "");
                KhachHang_DTO kh = new KhachHang_DTO();
                try {
                    kh = new HoaDon_BUS().getkh(hd1.getMakhach() + "");
                } catch (Exception e) {
                }
                viewtenk.setText(hd1.getTenkhach());
                viewdiachi.setText(kh.getDiaChi());
                viewtongtien.setText(new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()));
                viewtienkt.setText(new SanPham_BUS().Chuyendoi(hd1.getTienkhachtra().doubleValue()));
                viewtientl.setText(new SanPham_BUS().Chuyendoi(hd1.getTientralai().doubleValue()));
                jdialogView.setLocationRelativeTo(GiaoDienQL);
                jdialogView.setVisible(true);
            }
        };
        tableqlhd.getColumnModel().getColumn(7).setCellRenderer(new TableAction());
        tableqlhd.getColumnModel().getColumn(7).setCellEditor(new TableActionsCellEditer(event));
    }

    public void showtableCTHD(int mahd) {
        DefaultTableModel df = (DefaultTableModel) tableChitietHD.getModel();
        df.setRowCount(0);
        ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(mahd);
        int sl = 0;
        BigDecimal tt = new BigDecimal("0");
        for (ChiTietHD_DTO hd : list) {
            df.addRow(new Object[]{
                hd.getMahoadon(), hd.getMaSP(), hd.getSoluong(), hd.getMakhuyenmai(),
                new SanPham_BUS().Chuyendoi(hd.getGiaban()),
                new SanPham_BUS().Chuyendoi(hd.getTongkhuyenmai().doubleValue()),
                new SanPham_BUS().Chuyendoi(hd.getthanhtien().doubleValue())});
            sl += hd.getSoluong();
            tt = BigDecimal.valueOf(tt.doubleValue() + hd.getthanhtien().doubleValue());
        }
        jlbtongsl.setText(sl + "");
        jlbtongtien.setText(new SanPham_BUS().Chuyendoi(tt.doubleValue()));
        TableActionEvents eventt = new TableActionEvents() {
            @Override
            public void onEdit(int row) {
            }

            @Override
            public void onView(int row) {
            }

            @Override
            public void onDelete(int row) {
                if (tableChitietHD.isEditing()) {
                    tableChitietHD.getCellEditor().stopCellEditing();
                }
                int masp;
                try {
                    masp = Integer.parseInt(tableChitietHD.getValueAt(row, 1) + "");
                    int sl = Integer.parseInt(tableChitietHD.getValueAt(row, 2) + "");
                    new ChitietHD_BUS().deleteChitietHD(mahd, masp);
                    showtableCTHD(mahd);
                } catch (Exception e) {
                }

            }

        };
        tableChitietHD.getColumnModel().getColumn(7).setCellRenderer(new TableAction1());
        tableChitietHD.getColumnModel().getColumn(7).setCellEditor(new TableActionsCelledit(eventt));
        showtableHDSP();
        showtableHDKH();
    }

    public void showtableCTHD1(int mahd) {
        DefaultTableModel df = (DefaultTableModel) tableChitietHD1.getModel();
        df.setRowCount(0);
        ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(mahd);
        int sl = 0;
        BigDecimal tt = new BigDecimal("0");
        for (ChiTietHD_DTO hd : list) {
            df.addRow(new Object[]{
                hd.getMahoadon(), hd.getMaSP(), hd.getSoluong(), hd.getMakhuyenmai(),
                new SanPham_BUS().Chuyendoi(hd.getGiaban()),
                new SanPham_BUS().Chuyendoi(hd.getTongkhuyenmai().doubleValue()),
                new SanPham_BUS().Chuyendoi(hd.getthanhtien().doubleValue())});
            sl += hd.getSoluong();
            tt = BigDecimal.valueOf(tt.doubleValue() + hd.getthanhtien().doubleValue());
        }
        jlbtongsl1.setText(sl + "");
        edittongtien.setText(new SanPham_BUS().Chuyendoi(tt.doubleValue()));
        TableActionEvents eventt = new TableActionEvents() {
            @Override
            public void onEdit(int row) {
            }

            @Override
            public void onView(int row) {
            }

            @Override
            public void onDelete(int row) {
                if (tableChitietHD1.isEditing()) {
                    tableChitietHD1.getCellEditor().stopCellEditing();
                }
                int masp;
                try {
                    masp = Integer.parseInt(tableChitietHD1.getValueAt(row, 1) + "");
                    int sl = Integer.parseInt(tableChitietHD1.getValueAt(row, 2) + "");
                    new ChitietHD_BUS().deleteChitietHD(mahd, masp);
                    new ChiTietHDDAO().resetSL(sl, masp);
                    showtableCTHD1(mahd);
                    showtableHDSP1();
                } catch (Exception e) {
                }

            }

        };
        tableChitietHD1.getColumnModel().getColumn(7).setCellRenderer(new TableAction1());
        tableChitietHD1.getColumnModel().getColumn(7).setCellEditor(new TableActionsCelledit(eventt));
        showtableHDSP();
        showtableHDKH();
    }

    // Thêm hóa đơn
    public void lammoihd() {
        jlbsohoadon.setText("");
        jlbmak.setText("");
        jlbthoigianlap.setText("");
        txttenkhach.setText("");
        jlbdiachi.setText("");
        jlbtongsl.setText("0");
        jlbtongtien.setText("0");
        txttienkhachtra.setText("");
        txttientralai.setText("");

    }

    public void showtableHDSP() {
        List<String> listLoai = new ArrayList<>();
        tablehdsp = (DefaultTableModel) tableSPHD.getModel();
        tablehdsp.setRowCount(0);
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        tablehdsp.setColumnIdentifiers(new Object[]{
            "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá Bán", "Số lượng còn", "Mã khuyến mại"});
        for (SanPham_DTO sp : list) {
            tablehdsp.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
            listLoai.add(sp.getLoaiSP());
        }

        cboxhdloaisp.removeAllItems();
        cboxhdloaisp.addItem("");
        listLoai = listLoai.stream().distinct().collect(Collectors.toList());
        for (String loai : listLoai) {
            cboxhdloaisp.addItem(loai);
        }
    }

    public void showtableHDKH() {
        tablehdkh = (DefaultTableModel) tableHDKH.getModel();
        tablehdkh.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        tablehdkh.setColumnIdentifiers(new Object[]{
            "Mã Khách", "Tên khách", "Địa chỉ", "SDT", "Điểm tích lũy"});
        for (KhachHang_DTO kh : list) {
            tablehdkh.addRow(new Object[]{
                kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
        }
    }

    private void btnThemhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemhdActionPerformed
        HoaDon_DTO hd = new HoaDon_DTO();
        try {
            if (jlbtongtien.getText().equals("0")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng lựa chọn sản phẩm để thanh toán !!");
                return;
            }

            if (txttienkhachtra.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Thêm mà chưa thanh toán !!");
                hd.setTrangthai("Chưa Thanh Toán");
            }
            if (Double.parseDouble(txttienkhachtra.getText()) < new SanPham_BUS().Chuyendoi(jlbtongtien.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Thanh toán còn thiếu !!");
                hd.setTrangthai("Nợ");
            }
            if (Double.parseDouble(txttienkhachtra.getText()) >= new SanPham_BUS().Chuyendoi(jlbtongtien.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Đã thanh toán");
                hd.setTrangthai("Đã Thanh Toán");
            }
        } catch (Exception e) {
        }
        try {
            hd.setMahoadon(newmaHD);
            hd.setTenkhach(txttenkhach.getText());
            hd.setNgaylap(jlbthoigianlap.getText());
            hd.setTongsl(Integer.parseInt(jlbtongsl.getText()));
            hd.setTongtien(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(jlbtongtien.getText())));
            if (!jlbmak.getText().equals("")) {
                hd.setMakhach(Integer.parseInt(jlbmak.getText()));
            }
            hd.setTienkhachtra(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(txttienkhachtra.getText())));
            hd.setTientralai(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(txttientralai.getText())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String kt = new HoaDon_BUS().addhd(hd) + "";
        try {
            if (kt.equals("true")) {
                if ((hd.getMakhach() + "") != "") {
                    new HoaDon_BUS().tangdiemTl(hd.getMakhach());
                }
                ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(hd.getMahoadon());
                for (ChiTietHD_DTO ct : list) {
                    new HoaDon_BUS().decrease(ct.getMaSP(), ct.getSoluong());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        jdialogThemHD.setVisible(false);
        showtablehd();
        showTableSP();
        showtableKhach();
    }//GEN-LAST:event_btnThemhdActionPerformed

    // Thêm hóa đơn
    private void cboxhdloaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxhdloaispActionPerformed
        try {
            String loaisp = cboxhdloaisp.getSelectedItem().toString();
            if (loaisp.equals("")) {
                return;
            }
            ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
            tablehdsp.setRowCount(0);
            for (SanPham_DTO sp : list) {
                if (sp.getLoaiSP().equals(loaisp)) {
                    tablehdsp.addRow(new Object[]{
                        sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboxhdloaispActionPerformed

    private void checkdongiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkdongiaKeyReleased
        // Theo dõi từng kí tự khi người dùng nhập     
        String check = checkdongia.getText();
        tablehdsp.setRowCount(0);
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        if (check.equals("")) {
            for (SanPham_DTO sp : list) {
                tablehdsp.addRow(new Object[]{
                    sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
            }
        } else {
            try {
                Double gia = Double.parseDouble(check);
                for (SanPham_DTO sp : list) {
                    if (sp.getDonGia() >= gia) {
                        tablehdsp.addRow(new Object[]{
                            sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checkdongiaKeyReleased

    private void checkDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkDCKeyReleased
        // Theo dõi từng kí tự khi người dùng nhập     
        String check = checkDC.getText();
        tablehdkh.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        if (check.equals("")) {
            for (KhachHang_DTO kh : list) {
                tablehdkh.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
            }
        } else {
            try {
                for (KhachHang_DTO kh : list) {
                    if (kh.getDiaChi().contains(check) || kh.getDiaChi().toLowerCase().contains(check)) {
                        tablehdkh.addRow(new Object[]{
                            kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checkDCKeyReleased

    private void checktenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checktenKeyReleased
        String check = checkten.getText();
        tablehdkh.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        if (check.equals("")) {
            for (KhachHang_DTO kh : list) {
                tablehdkh.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
            }
        } else {
            try {
                for (KhachHang_DTO kh : list) {
                    if (kh.getTen().contains(check) || kh.getTen().toLowerCase().contains(check)) {
                        tablehdkh.addRow(new Object[]{
                            kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checktenKeyReleased

    private void tableSPHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPHDMouseClicked
        String ma = tableSPHD.getValueAt(tableSPHD.getSelectedRow(), 0).toString();
        try {
            int slcon = Integer.parseInt(tableSPHD.getValueAt(tableSPHD.getSelectedRow(), 4).toString());
            if (slcon <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Sản phẩm đã hết !!");
                return;
            }
        } catch (Exception e) {
        }

        SanPham_DTO sp = new HoaDon_BUS().getsp(ma);
        jtexttensp.setText(sp.getTenSP());
        jtextgia.setText(sp.getDonGia() + "");
        jtextslcon.setText(sp.getSoLuong() + "");
        jdialogSP.setLocationRelativeTo(GiaoDienQL);
        try {
            SpinnerNumberModel model = new SpinnerNumberModel(1, 0, sp.getSoLuong(), 1);
            spinnerslmua.setModel(model);
        } catch (Exception e) {
        }
        jdialogSP.setVisible(true);
    }//GEN-LAST:event_tableSPHDMouseClicked

    private void exitdialogSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitdialogSPActionPerformed
        jdialogSP.setVisible(false);
    }//GEN-LAST:event_exitdialogSPActionPerformed

    private void okdialogSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdialogSPActionPerformed
        int sl = (int) spinnerslmua.getValue();
        if (sl > Integer.parseInt(jtextslcon.getText())) {
            JOptionPane.showMessageDialog(this, "Số lượng không đủ");
            return;
        }
        if (sl <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng bằng 0 !!");
            return;
        }
        String ma = tableSPHD.getValueAt(tableSPHD.getSelectedRow(), 0).toString();
        SanPham_DTO sp = new HoaDon_BUS().getsp(ma);
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        try {
            km = new KhuyenMai_BUS().getkm(Integer.parseInt(sp.getMaKM()));
        } catch (Exception e) {
        }

        ChiTietHD_DTO chitiet = new ChiTietHD_DTO();
        try {

            chitiet.setMahoadon(newmaHD);
            chitiet.setMaSP(sp.getMaSP());
            chitiet.setTenSP(sp.getTenSP());
            chitiet.setSoluong(sl);
            chitiet.setGiaban(sp.getDonGia());
            double tongkm = 0;
            try {
                if ((sp.getMaKM() + "").equals("")) {
                    chitiet.setMakhuyenmai(0);
                    chitiet.setTongkhuyenmai(BigDecimal.valueOf(0));
                } else {
                    chitiet.setMakhuyenmai(Integer.parseInt(sp.getMaKM()));
                    chitiet.setTongkhuyenmai(new ChitietHD_BUS().tienkm(new ChitietHD_BUS().tamtinh(sp.getDonGia(), sl), km.getGiatrikm()));
                    tongkm = chitiet.getTongkhuyenmai().doubleValue();
                }
            } catch (Exception e) {
            }
            try {
                chitiet.setthanhtien(new ChitietHD_BUS().tongtien(new ChitietHD_BUS().tamtinh(sp.getDonGia(), sl).doubleValue(), tongkm));
            } catch (Exception e) {
            }
            new ChitietHD_BUS().addChiTietHD(chitiet);
            showtableCTHD(newmaHD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jdialogSP.setVisible(false);
    }//GEN-LAST:event_okdialogSPActionPerformed

    private void tableHDKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHDKHMouseClicked
        String ma = tableHDKH.getValueAt(tableHDKH.getSelectedRow(), 0).toString();
        KhachHang_DTO kh = new HoaDon_BUS().getkh(ma);
        anhdialogKh.setIcon(ResizeImage(String.valueOf(kh.getAnhkh())));
        madialogKH.setText(kh.getMak() + "");
        TendialogKH.setText(kh.getTen());
        diachidialogKH.setText(kh.getDiaChi());
        sdtdialogKH.setText(kh.getSDT());
        ngaysdialogKH.setText(kh.getNgaySinh());
        dtldialogKH.setText(kh.getDiemTichLuy() + "");

        jdialogKH.setLocationRelativeTo(GiaoDienQL);
        jdialogKH.setVisible(true);
    }//GEN-LAST:event_tableHDKHMouseClicked

    private void exitdialogKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitdialogKHActionPerformed
        jdialogKH.setVisible(false);
    }//GEN-LAST:event_exitdialogKHActionPerformed

    private void okdialogKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdialogKHActionPerformed
        String ma = madialogKH.getText();
        KhachHang_DTO kh = new HoaDon_BUS().getkh(ma);
        jlbmak.setText(kh.getMak() + "");
        txttenkhach.setText(kh.getTen());
        jlbdiachi.setText(kh.getDiaChi());
        jdialogKH.setVisible(false);
    }//GEN-LAST:event_okdialogKHActionPerformed

    private void btnExithdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExithdActionPerformed
        jdialogThemHD.setVisible(false);
    }//GEN-LAST:event_btnExithdActionPerformed

    private void btnViewexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewexitActionPerformed
        jdialogView.setVisible(false);
    }//GEN-LAST:event_btnViewexitActionPerformed

    // Edit hóa đơn
    public void showtableHDSP1() {
        List<String> listLoai = new ArrayList<>();
        DefaultTableModel df = (DefaultTableModel) tableSPHD1.getModel();
        df.setRowCount(0);
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        df.setColumnIdentifiers(new Object[]{
            "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm", "Giá Bán", "Số lượng còn", "Mã khuyến mại"});
        for (SanPham_DTO sp : list) {
            df.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
            listLoai.add(sp.getLoaiSP());
        }

        cboxhdloaisp1.removeAllItems();
        cboxhdloaisp1.addItem("");
        listLoai = listLoai.stream().distinct().collect(Collectors.toList());
        for (String loai : listLoai) {
            cboxhdloaisp1.addItem(loai);
        }
    }

    public void showtableHDKH1() {
        DefaultTableModel df = (DefaultTableModel) tableHDKH1.getModel();
        df.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        df.setColumnIdentifiers(new Object[]{
            "Mã Khách", "Tên khách", "Địa chỉ", "SDT", "Điểm tích lũy"});
        for (KhachHang_DTO kh : list) {
            df.addRow(new Object[]{
                kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
        }
    }

    private void tableSPHD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPHD1MouseClicked
        try {
            String ma = tableSPHD1.getValueAt(tableSPHD1.getSelectedRow(), 0).toString();
            int slcon = Integer.parseInt(tableSPHD1.getValueAt(tableSPHD1.getSelectedRow(), 4).toString());
            if (slcon <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Sản phẩm đã hết !!");
                return;
            }
            SanPham_DTO sp = new HoaDon_BUS().getsp(ma);
            jtexttensp1.setText(sp.getTenSP());
            jtextgia1.setText(sp.getDonGia() + "");
            jtextslcon1.setText(sp.getSoLuong() + "");
            SpinnerNumberModel model = new SpinnerNumberModel(1, 0, sp.getSoLuong(), 1);
            spinnerslmua1.setModel(model);
            jdialogSP1.setLocationRelativeTo(GiaoDienQL);
            jdialogSP1.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableSPHD1MouseClicked

    private void cboxhdloaisp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxhdloaisp1ActionPerformed
        try {
            String loaisp = cboxhdloaisp1.getSelectedItem().toString();
            if (loaisp.equals("")) {
                return;
            }
            DefaultTableModel df = (DefaultTableModel) tableSPHD1.getModel();
            ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
            df.setRowCount(0);
            for (SanPham_DTO sp : list) {
                if (sp.getLoaiSP().equals(loaisp)) {
                    df.addRow(new Object[]{
                        sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboxhdloaisp1ActionPerformed

    private void checkdongia1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkdongia1KeyReleased
        // Theo dõi từng kí tự khi người dùng nhập     
        String check = checkdongia1.getText();
        DefaultTableModel df = (DefaultTableModel) tableSPHD1.getModel();
        df.setRowCount(0);
        ArrayList<SanPham_DTO> list = new SanPhamDAO().getListSanpham();
        if (check.equals("")) {
            for (SanPham_DTO sp : list) {
                df.addRow(new Object[]{
                    sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
            }
        } else {
            try {
                Double gia = Double.parseDouble(check);
                for (SanPham_DTO sp : list) {
                    if (sp.getDonGia() >= gia) {
                        df.addRow(new Object[]{
                            sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checkdongia1KeyReleased

    private void checkten1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkten1KeyReleased
        String check = checkten1.getText();
        DefaultTableModel df = (DefaultTableModel) tableHDKH1.getModel();
        df.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        if (check.equals("")) {
            for (KhachHang_DTO kh : list) {
                df.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
            }
        } else {
            try {
                for (KhachHang_DTO kh : list) {
                    if (kh.getTen().contains(check) || kh.getTen().toLowerCase().contains(check)) {
                        df.addRow(new Object[]{
                            kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checkten1KeyReleased

    private void checkDC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkDC1KeyReleased
        // Theo dõi từng kí tự khi người dùng nhập     
        String check = checkDC1.getText();
        DefaultTableModel df = (DefaultTableModel) tableHDKH1.getModel();
        df.setRowCount(0);
        ArrayList<KhachHang_DTO> list = new KhachHangDAO().getListKhachHang();
        if (check.equals("")) {
            for (KhachHang_DTO kh : list) {
                df.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
            }
        } else {
            try {
                for (KhachHang_DTO kh : list) {
                    if (kh.getDiaChi().contains(check) || kh.getDiaChi().toLowerCase().contains(check)) {
                        df.addRow(new Object[]{
                            kh.getMak(), kh.getTen(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_checkDC1KeyReleased

    private void tableHDKH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHDKH1MouseClicked
        String ma = tableHDKH1.getValueAt(tableHDKH1.getSelectedRow(), 0).toString();
        KhachHang_DTO kh = new HoaDon_BUS().getkh(ma);
        anhdialogKh1.setIcon(ResizeImage(String.valueOf(kh.getAnhkh())));
        madialogKH1.setText(kh.getMak() + "");
        TendialogKH1.setText(kh.getTen());
        diachidialogKH1.setText(kh.getDiaChi());
        sdtdialogKH1.setText(kh.getSDT());
        ngaysdialogKH1.setText(kh.getNgaySinh());
        dtldialogKH1.setText(kh.getDiemTichLuy() + "");

        jdialogKH1.setLocationRelativeTo(GiaoDienQL);
        jdialogKH1.setVisible(true);
    }//GEN-LAST:event_tableHDKH1MouseClicked

    private void btnExithd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExithd1ActionPerformed
        jdialogEditHD.setVisible(false);
    }//GEN-LAST:event_btnExithd1ActionPerformed

    private void btnSuahdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuahdActionPerformed
        HoaDon_DTO hd = new HoaDon_DTO();
        try {
            if (edittongtien.getText().equals("0")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng lựa chọn sản phẩm để thanh toán !!");
                return;
            }
            if (edittkhachttra.getText().equals("")) {
                //JOptionPane.showMessageDialog(rootPane, "Sửa mà chưa thanh toán !!");
                hd.setTrangthai("Chưa Thanh Toán");
            }
            if (Double.parseDouble(edittkhachttra.getText()) < new SanPham_BUS().Chuyendoi(edittongtien.getText())) {
                //JOptionPane.showMessageDialog(rootPane, "Thanh toán còn thiếu !!");
                hd.setTrangthai("Nợ");
            }
            if (Double.parseDouble(edittkhachttra.getText()) >= new SanPham_BUS().Chuyendoi(edittongtien.getText())) {
                //JOptionPane.showMessageDialog(rootPane, "Đã thanh toán");
                hd.setTrangthai("Đã Thanh Toán");
            }
        } catch (Exception e) {
        }
        try {
            hd.setMahoadon(Integer.parseInt(jlbsohoadon1.getText()));
            hd.setTenkhach(txttenkhach1.getText());
            hd.setNgaylap(jlbthoigianlap1.getText());
            hd.setTongsl(Integer.parseInt(jlbtongsl1.getText()));
            hd.setTongtien(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(edittongtien.getText())));
            if (!jlbmak.getText().equals("")) {
                hd.setMakhach(Integer.parseInt(jlbmak.getText()));
            }
            hd.setTienkhachtra(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(edittkhachttra.getText())));
            hd.setTientralai(BigDecimal.valueOf(new SanPham_BUS().Chuyendoi(editttralai.getText())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String kt = new HoaDon_BUS().addhd(hd) + "";
        try {
            if (kt.equals("true")) {
                JOptionPane.showMessageDialog(rootPane, "Sửa Hóa đơn thành công.");
                ArrayList<ChiTietHD_DTO> listmoi = new ChiTietHDDAO().getlistCTHD(hd.getMahoadon());
                for (ChiTietHD_DTO ctmoi : listmoi) {
                    for (ChiTietHD_DTO ctcu : listcu) {
                        if (ctmoi.getMaSP() == ctcu.getMaSP()) {
                            if (ctmoi.getSoluong() > ctcu.getSoluong()) {
                                new HoaDon_BUS().decrease(ctmoi.getMaSP(), (ctmoi.getSoluong() - ctcu.getSoluong()));
                            }
                        } else {
                            new HoaDon_BUS().decrease(ctmoi.getMaSP(), ctmoi.getSoluong());
                        }
                    }
                }
            }
            showtablehd();
            showTableSP();
            showtableKhach();
        } catch (Exception e) {
            e.printStackTrace();
        }

        jdialogEditHD.setVisible(false);
        showtablehd();
        showTableSP();
        showtableKhach();
    }//GEN-LAST:event_btnSuahdActionPerformed

    private void exitdialogKH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitdialogKH1ActionPerformed
        jdialogKH1.setVisible(false);
    }//GEN-LAST:event_exitdialogKH1ActionPerformed

    private void okdialogKH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdialogKH1ActionPerformed
        String ma = madialogKH1.getText();
        KhachHang_DTO kh = new HoaDon_BUS().getkh(ma);
        jlbmak1.setText(kh.getMak() + "");
        txttenkhach1.setText(kh.getTen());
        jlbdiachi1.setText(kh.getDiaChi());
        jdialogKH1.setVisible(false);
    }//GEN-LAST:event_okdialogKH1ActionPerformed

    private void exitdialogSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitdialogSP1ActionPerformed
        jdialogSP1.setVisible(false);
    }//GEN-LAST:event_exitdialogSP1ActionPerformed

    private void okdialogSP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdialogSP1ActionPerformed
        int sl = (int) spinnerslmua1.getValue();
        newmaHD = Integer.parseInt(jlbsohoadon1.getText());
        if (sl > Integer.parseInt(jtextslcon1.getText())) {
            JOptionPane.showMessageDialog(this, "Số lượng không đủ");
            return;
        }
        if (sl <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ !!");
            return;
        }
        String ma = tableSPHD1.getValueAt(tableSPHD1.getSelectedRow(), 0).toString();

        SanPham_DTO sp = new HoaDon_BUS().getsp(ma);
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        try {
            km = new KhuyenMai_BUS().getkm(Integer.parseInt(sp.getMaKM()));
        } catch (Exception e) {
        }
        ChiTietHD_DTO chitiet = new ChiTietHD_DTO();
        try {

            chitiet.setMahoadon(newmaHD);
            chitiet.setMaSP(sp.getMaSP());
            chitiet.setTenSP(sp.getTenSP());
            chitiet.setSoluong(sl);
            chitiet.setGiaban(sp.getDonGia());
            chitiet.setMakhuyenmai(Integer.parseInt(sp.getMaKM()));
            chitiet.setTongkhuyenmai(new ChitietHD_BUS().tienkm(new ChitietHD_BUS().tamtinh(sp.getDonGia(), sl), km.getGiatrikm()));
            chitiet.setthanhtien(new ChitietHD_BUS().tongtien(new ChitietHD_BUS().tamtinh(sp.getDonGia(),
                    sl).doubleValue(), chitiet.getTongkhuyenmai().doubleValue()));
            new ChitietHD_BUS().addChiTietHD(chitiet);
            showtableCTHD1(newmaHD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jdialogSP1.setVisible(false);
    }//GEN-LAST:event_okdialogSP1ActionPerformed

    // Thêm hóa đơn
    private void jcbhdkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbhdkmActionPerformed
        int ma = 0;
        ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(newmaHD);
        BigDecimal sum = new BigDecimal("0");
        for (ChiTietHD_DTO ct : list) {
            sum = BigDecimal.valueOf(sum.doubleValue() + ct.getthanhtien().doubleValue());
        }
        jlbtongtien.setText(new SanPham_BUS().Chuyendoi(sum.doubleValue()));
        try {
            ma = Integer.valueOf(jcbhdkm.getSelectedItem().toString());
        } catch (Exception e) {
        }
        if (ma != 0) {
            KhuyenMai_DTO km = new KhuyenMai_BUS().getkm(ma);
            double gt = new SanPham_BUS().Chuyendoi(jlbtongtien.getText());
            double gt1 = new SanPham_BUS().Chuyendoi(jlbtongtien.getText()) * (km.getGiatrikm() / 100f);
            jlbtongtien.setText(new SanPham_BUS().Chuyendoi(gt - gt1));
        }
    }//GEN-LAST:event_jcbhdkmActionPerformed

    private void txttienkhachtraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttienkhachtraKeyReleased
        BigDecimal d = BigDecimal.valueOf(0);
        BigDecimal d1 = BigDecimal.valueOf(0);
        BigDecimal d2 = BigDecimal.valueOf(0);
        try {
            try {
                d = new BigDecimal(new SanPham_BUS().Chuyendoi(jlbtongtien.getText()));
                d1 = new BigDecimal(txttienkhachtra.getText());
                d2 = new BigDecimal(new SanPham_BUS().Chuyendoi(txttientralai.getText()));
                if (d2.doubleValue() > d1.doubleValue()) {
                    txttientralai.setText((d1.doubleValue() - d.doubleValue()) + "");
                }
            } catch (Exception e) {
            }
            if (d2.doubleValue() >= d1.doubleValue()) {
                txttientralai.setText("0");
            }
            if (d1.doubleValue() < d.doubleValue()) {
                return;
            }
            txttientralai.setText((d1.doubleValue() - d.doubleValue()) + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txttienkhachtraKeyReleased

    //Thanh toán hóa đơn
    private void btnViewexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewexit1ActionPerformed
        jdialogThanhtoan.setVisible(false);
    }//GEN-LAST:event_btnViewexit1ActionPerformed

    private void btnViewexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewexit2ActionPerformed
        try {
            if (viewtienkt1.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập số tiền khách trả !!");
            }
        } catch (Exception e) {
        }
        try {
            int mahd1 = Integer.parseInt(viewmahd1.getText());
            BigDecimal khachtra = BigDecimal.valueOf(Double.parseDouble(viewtienkt1.getText()));
            BigDecimal tralai = BigDecimal.valueOf(Double.parseDouble(viewtientl1.getText()));
            BigDecimal tong = BigDecimal.valueOf(Double.parseDouble(viewtongtien1.getText()));
            String tt = "Đã Thanh Toán";
            if (khachtra.doubleValue() >= tong.doubleValue()) {
                if (new HoaDonDAO().HDThanhtoan(mahd1, khachtra, tralai, tt)) {
                    System.out.println(khachtra + "\t" + tralai);
                    JOptionPane.showMessageDialog(rootPane, "Thanh toán thành công.");
                }
            } else {
                if (new HoaDonDAO().HDThanhtoan(mahd1, khachtra, tralai, "")) {
                    JOptionPane.showMessageDialog(rootPane, "Thanh toán thành công.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Tiền khách trả không hợp lệ !!");
        }
        showtablehd();
        jdialogThanhtoan.setVisible(false);
    }//GEN-LAST:event_btnViewexit2ActionPerformed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        anhQR.setIcon(ResizeImage1(String.valueOf("C:\\Users\\dangm\\OneDrive\\Tài liệu\\NetBeansProjects\\QLBanMP_Nhom5\\"
                + "src\\Pictures\\341948601_2118013031742733_1018466156803714911_n.jpg")));
        QR.setLocationRelativeTo(GiaoDienQL);
        QR.setVisible(true);
    }//GEN-LAST:event_btnQRActionPerformed

    private void viewtienkt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewtienkt1KeyReleased
        BigDecimal d = BigDecimal.valueOf(0);
        BigDecimal d1 = BigDecimal.valueOf(0);
        BigDecimal d2 = BigDecimal.valueOf(0);
        try {
            try {
                d = new BigDecimal(new SanPham_BUS().Chuyendoi(viewtongtien1.getText()));
                d1 = new BigDecimal(viewtienkt1.getText());
                d2 = new BigDecimal(new SanPham_BUS().Chuyendoi(viewtientl1.getText()));
                if (d2.doubleValue() > d1.doubleValue()) {
                    viewtientl1.setText((d1.doubleValue() - d.doubleValue()) + "");
                }
            } catch (Exception e) {
            }
            if (d2.doubleValue() >= d1.doubleValue()) {
                viewtientl1.setText("0");
            }
            if (d1.doubleValue() < d.doubleValue()) {
                return;
            }
            viewtientl1.setText((d1.doubleValue() - d.doubleValue()) + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewtienkt1KeyReleased
    // edit hd
    private void edittkhachttraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edittkhachttraKeyReleased
        BigDecimal d = BigDecimal.valueOf(0);
        BigDecimal d1 = BigDecimal.valueOf(0);
        BigDecimal d2 = BigDecimal.valueOf(0);
        try {
            try {
                d = new BigDecimal(new SanPham_BUS().Chuyendoi(edittongtien.getText()));
                d1 = new BigDecimal(edittkhachttra.getText());
                d2 = new BigDecimal(new SanPham_BUS().Chuyendoi(editttralai.getText()));
                if (d2.doubleValue() > d1.doubleValue()) {
                    editttralai.setText((d1.doubleValue() - d.doubleValue()) + "");
                }
            } catch (Exception e) {
            }
            if (d2.doubleValue() >= d1.doubleValue()) {
                editttralai.setText("0");
            }
            if (d1.doubleValue() < d.doubleValue()) {
                return;
            }
            editttralai.setText((d1.doubleValue() - d.doubleValue()) + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edittkhachttraKeyReleased

    private void jcbeditHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbeditHDActionPerformed
        int ma = 0;
        ArrayList<ChiTietHD_DTO> list = new ChiTietHDDAO().getlistCTHD(newmaHD);
        BigDecimal sum = new BigDecimal("0");
        for (ChiTietHD_DTO ct : list) {
            sum = BigDecimal.valueOf(sum.doubleValue() + ct.getthanhtien().doubleValue());
        }
        edittongtien.setText(new SanPham_BUS().Chuyendoi(sum.doubleValue()));
        try {
            ma = Integer.valueOf(jcbeditHD.getSelectedItem().toString());
        } catch (Exception e) {
        }
        if (ma != 0) {
            KhuyenMai_DTO km = new KhuyenMai_BUS().getkm(ma);
            double gt = new SanPham_BUS().Chuyendoi(edittongtien.getText());
            double gt1 = new SanPham_BUS().Chuyendoi(edittongtien.getText()) * (km.getGiatrikm() / 100f);
            edittongtien.setText(new SanPham_BUS().Chuyendoi(gt - gt1));
        }
    }//GEN-LAST:event_jcbeditHDActionPerformed

    // Báo cáo thống kê
    public void showtableThongKe() {
        ArrayList<SanPham_DTO> listsp = new SanPhamDAO().getListSanpham();
        ArrayList<KhachHang_DTO> listkh = new KhachHangDAO().getListKhachHang();
        ArrayList<HoaDon_DTO> listhd = new HoaDonDAO().getListHoaDon();
        int slsp = 0, slhd = 0;
        BigDecimal tt = new BigDecimal(0);

        DefaultTableModel dfsp = (DefaultTableModel) tk_tableSP.getModel();
        dfsp.setRowCount(0);
        for (SanPham_DTO sp : listsp) {
            dfsp.addRow(new Object[]{
                sp.getMaSP(), sp.getTenSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()),
                sp.getSoLuong()});
        }

        DefaultTableModel dfkh = (DefaultTableModel) tk_tableKH.getModel();
        dfkh.setRowCount(0);
        for (KhachHang_DTO kh : listkh) {
            dfkh.addRow(new Object[]{
                kh.getMak(), kh.getTen(), kh.getNgaySinh(), kh.getDiaChi()});
        }

        DefaultTableModel dfhd = (DefaultTableModel) tk_tableHD.getModel();
        dfhd.setRowCount(0);
        for (HoaDon_DTO hd : listhd) {
            dfhd.addRow(new Object[]{
                hd.getMahoadon(), hd.getMakhach(), hd.getTenkhach(), hd.getNgaylap(),
                hd.getTongsl(), new SanPham_BUS().Chuyendoi(hd.getTongtien().doubleValue()), hd.getTrangthai()
            });
        }

    }

    private void tk_dtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tk_dtExitActionPerformed
        tk_dialogDoanhthu.setVisible(false);
    }//GEN-LAST:event_tk_dtExitActionPerformed

    private void btsetdathanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsetdathanhtoanActionPerformed
        String ma = qrma.getText();
        HoaDon_DTO hd = new HoaDon_BUS().gethd(ma);
        hd.setTrangthai("Đã Thanh Toán");
        if(hd.getMakhach()==0){
         new HoaDonDAO().suaHoaDonNullmk(hd);
         QR.setVisible(false);
        jdialogThanhtoan.setVisible(false);
         showtablehd();
         return;
        }
        new HoaDonDAO().suaHoaDon(hd);

        showtablehd();
    }//GEN-LAST:event_btsetdathanhtoanActionPerformed

    private void tk_tatcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tk_tatcaActionPerformed
        showtableThongKe();
    }//GEN-LAST:event_tk_tatcaActionPerformed

    private void tk_thongkedoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tk_thongkedoanhthuActionPerformed
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
        String d = df.format(date);
        ArrayList<HoaDon_DTO> listhd = new HoaDonDAO().getListHoaDon();
        int slsp = 0, slhd = 0;
        BigDecimal tt = new BigDecimal(0);

        for (HoaDon_DTO hd : listhd) {
            if (d.compareTo(hd.getNgaylap()) == 0) {
                slsp += hd.getTongsl();
                slhd += 1;
                tt = BigDecimal.valueOf(tt.doubleValue() + hd.getTongtien().doubleValue());
            }
        }
        dt_slsp.setText(slsp + "");
        dt_slhd.setText(slhd + "");
        dt_tongtien.setText(new SanPham_BUS().Chuyendoi(tt.doubleValue()) + "");
        tk_dialogDoanhthu.setLocationRelativeTo(GiaoDienQL);
        tk_dialogDoanhthu.setVisible(true);
    }//GEN-LAST:event_tk_thongkedoanhthuActionPerformed

    private void tk_tkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tk_tkeActionPerformed
        int index = tk_comboxtieuchi.getSelectedIndex();
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
        String d = df.format(date);

        ArrayList<HoaDon_DTO> listhd = new HoaDonDAO().getListHoaDon();
        ArrayList<HoaDon_DTO> listhd1 = new ArrayList<>();
        ArrayList<KhachHang_DTO> listkh = new ArrayList<>();
        ArrayList<SanPham_DTO> listsp = new ArrayList<>();
        ArrayList<ChiTietHD_DTO> listct = new ArrayList<>();

        if (index == 0) {
            for (HoaDon_DTO hd : listhd) {
                if (d.compareTo(hd.getNgaylap()) == 0) {
                    listhd1.add(hd);
                }
            }
            for (HoaDon_DTO hd1 : listhd1) {
                for (ChiTietHD_DTO ct : new ChiTietHDDAO().getlistCTHD(hd1.getMahoadon())) {
                    listct.add(ct);
                    SanPham_DTO sp = new SanPham_DTO();
                    sp.setMaSP(ct.getMaSP());
                    sp.setDonGia(ct.getGiaban());
                    sp.setTenSP(ct.getTenSP());
                    sp.setSoLuong(ct.getSoluong());
                    listsp.add(sp);
                }
            }
            DefaultTableModel dfsp = (DefaultTableModel) tk_tableSP.getModel();
            dfsp.setRowCount(0);
            for (SanPham_DTO sp : listsp) {
                dfsp.addRow(new Object[]{
                    sp.getMaSP(), sp.getTenSP(), new SanPham_BUS().Chuyendoi(sp.getDonGia()),
                    sp.getSoLuong()});
        }
        }

        if (index == 1) {
            for (HoaDon_DTO hd : listhd) {
                if (d.compareTo(hd.getNgaylap()) == 0 && hd.getMakhach() != 0) {
                    KhachHang_DTO khn = new HoaDon_BUS().getkh(hd.getMakhach() + "");
                    listkh.add(khn);
                }
            }
            DefaultTableModel dfkh = (DefaultTableModel) tk_tableKH.getModel();
            dfkh.setRowCount(0);
            for (KhachHang_DTO kh : listkh) {
                dfkh.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getNgaySinh(), kh.getDiaChi()});
        }
        }
        if (index == 2) {
            for (HoaDon_DTO hd : listhd) {
                if (d.compareTo(hd.getNgaylap()) == 0) {
                    listhd1.add(hd);
                }
            }
            DefaultTableModel dfhd = (DefaultTableModel) tk_tableHD.getModel();
            dfhd.setRowCount(0);
            for (HoaDon_DTO hd : listhd1) {
                dfhd.addRow(new Object[]{
                    hd.getMahoadon(), hd.getMakhach(), hd.getTenkhach(), hd.getNgaylap(),
                    hd.getTongsl(), new SanPham_BUS().Chuyendoi(hd.getTongtien().doubleValue()), hd.getTrangthai()
                });
            }
        }
        if (index == 3) {
            for (HoaDon_DTO hd : listhd) {
                Date d1 = new Date();
                try {
                    d1 = df.parse(hd.getNgaylap());
                } catch (Exception e) {
                }
                if (date.getMonth() == d1.getMonth()) {
                    listhd1.add(hd);
                }
            }
            DefaultTableModel dfhd = (DefaultTableModel) tk_tableHD.getModel();
            dfhd.setRowCount(0);
            for (HoaDon_DTO hd : listhd1) {
                dfhd.addRow(new Object[]{
                    hd.getMahoadon(), hd.getMakhach(), hd.getTenkhach(), hd.getNgaylap(),
                    hd.getTongsl(), new SanPham_BUS().Chuyendoi(hd.getTongtien().doubleValue()), hd.getTrangthai()
                });
            }
        }
    }//GEN-LAST:event_tk_tkeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showtablehd();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Tìm kiếm hóa đơn
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = jcomboTrangthai.getSelectedIndex();
        int index1 = jcbngaylaphd.getSelectedIndex();
        if (index == 0 && index1 == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tiêu chí tìm kiếm !!");
            return;
        }
        SimpleDateFormat sdate = new SimpleDateFormat("dd/MM/yyyy");
        String trangthai = jcomboTrangthai.getSelectedItem().toString();
        Date ngay = null;
        String s = "";
        try {
            ngay = sdate.parse(jcbngaylaphd.getSelectedItem().toString());
            s = ngay.toString() + "";
        } catch (Exception e) {
        }
        ArrayList<HoaDon_DTO> listhoadon = new HoaDonDAO().getListHoaDon();
        ArrayList<HoaDon_DTO> listhoadon1 = new HoaDonDAO().getListTimkiem(trangthai);
        ArrayList<HoaDon_DTO> listhoadon2 = new ArrayList<>();

        if (trangthai.equals(" ") && !s.equals("")) {
            for (HoaDon_DTO hd : listhoadon) {
                try {
                    if (sdate.parse(hd.getNgaylap()).compareTo(ngay) >= 0) {
                        listhoadon2.add(hd);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (!trangthai.equals(" ") && !s.equals("")) {
            for (HoaDon_DTO hd : listhoadon1) {
                try {
                    if (sdate.parse(hd.getNgaylap()).compareTo(ngay) >= 0) {
                        listhoadon2.add(hd);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (!trangthai.equals("") && s.equals("")) {
            listhoadon2 = listhoadon1;
        }

        DefaultTableModel df = (DefaultTableModel) tableqlhd.getModel();
        df.setRowCount(0);
        for (HoaDon_DTO hd1 : listhoadon2) {
            if (hd1.getIsdelete() == 0) {
                df.addRow(new Object[]{
                    hd1.getMahoadon(), hd1.getMakhach(), hd1.getTenkhach(), hd1.getNgaylap(),
                    hd1.getTongsl(), new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()), hd1.getTrangthai()
                });
            }
        }
        TableActionEvents event = new TableActionEvents() {
            public void onEdit(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                HoaDon_DTO hd1 = new HoaDon_DTO();
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                    listcu = new ChiTietHDDAO().getlistCTHD(mahd);
                } catch (Exception e) {
                }
                ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(mahd);
                for (HoaDon_DTO hd : listhoadon) {
                    if (hd.getMahoadon() == mahd) {
                        hd1 = hd;
                    }
                }
                ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
                for (KhuyenMai_DTO km : list) {
                    jcbeditHD.addItem(km.getMakm() + "");
                }
                jlbsohoadon1.setText(mahd + "");
                jlbmak1.setText(hd1.getMakhach() + "");
                jlbthoigianlap1.setText(hd1.getNgaylap());
                txttenkhach1.setText(hd1.getTenkhach());
                jlbtongsl1.setText(hd1.getTongsl() + "");
                edittongtien.setText(new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()));
                KhachHang_DTO kh = new KhachHang_DTO();
                try {
                    kh = new HoaDon_BUS().getkh(hd1.getMakhach() + "");
                } catch (Exception e) {
                }
                jlbdiachi1.setText(kh.getDiaChi() + "");
                edittkhachttra.setText(new SanPham_BUS().Chuyendoi(hd1.getTienkhachtra().doubleValue()));
                editttralai.setText(new SanPham_BUS().Chuyendoi(hd1.getTientralai().doubleValue()));
                showtableHDSP1();
                showtableHDKH1();
                showtableCTHD1(mahd);
                jdialogEditHD.setLocationRelativeTo(GiaoDienQL);
                jdialogEditHD.setVisible(true);
            }

            @Override
            public void onDelete(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                } catch (Exception e) {
                }
                int tk = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa không ?");
                if (tk == JOptionPane.YES_OPTION) {
                    if (new HoaDonDAO().xoaHoaDon(mahd)) {
                        JOptionPane.showMessageDialog(rootPane, "Xóa Hóa Đơn thành công !", "Thông Báo !", 1);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Xóa không thành công!", "Thông Báo !", 0);
                    }
                } else {
                    return;
                }
                showtablehd();
            }

            @Override
            public void onView(int row) {
                if (tableqlhd.isEditing()) {
                    tableqlhd.getCellEditor().stopCellEditing();
                }
                int mahd = 0;
                HoaDon_DTO hd1 = new HoaDon_DTO();
                try {
                    mahd = Integer.parseInt(tableqlhd.getValueAt(row, 0) + "");
                } catch (Exception e) {
                }
                ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(mahd);
                for (HoaDon_DTO hd : listhoadon) {
                    if (hd.getMahoadon() == mahd) {
                        hd1 = hd;
                    }
                }
                DefaultTableModel df = (DefaultTableModel) viewtablechitietHD.getModel();
                df.setRowCount(0);
                for (ChiTietHD_DTO hd : listchitiet) {

                    df.addRow(new Object[]{
                        hd.getMahoadon(), hd.getMaSP(), hd.getSoluong(), hd.getMakhuyenmai(),
                        new SanPham_BUS().Chuyendoi(hd.getGiaban()),
                        new SanPham_BUS().Chuyendoi(hd.getTongkhuyenmai().doubleValue()),
                        new SanPham_BUS().Chuyendoi(hd.getthanhtien().doubleValue())});
            }
            viewmahd.setText(mahd + "");
            viewngaytao.setText(hd1.getNgaylap() + "");
            viewtongsl.setText(hd1.getTongsl() + "");
            viewmak.setText(hd1.getMakhach() + "");
            KhachHang_DTO kh = new KhachHang_DTO();
            try {
                kh = new HoaDon_BUS().getkh(hd1.getMakhach() + "");
            } catch (Exception e) {
            }
            viewtenk.setText(hd1.getTenkhach());
            viewdiachi.setText(kh.getDiaChi());
            viewtongtien.setText(new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()));
            viewtienkt.setText(new SanPham_BUS().Chuyendoi(hd1.getTienkhachtra().doubleValue()));
            viewtientl.setText(new SanPham_BUS().Chuyendoi(hd1.getTientralai().doubleValue()));
            jdialogView.setLocationRelativeTo(GiaoDienQL);
            jdialogView.setVisible(true);
        }
        };
        tableqlhd.getColumnModel().getColumn(7).setCellRenderer(new TableAction());
        tableqlhd.getColumnModel().getColumn(7).setCellEditor(new TableActionsCellEditer(event));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThanhToanActionPerformed
        int mahd = 0;
        HoaDon_DTO hd1 = new HoaDon_DTO();
        try {
            if (Double.parseDouble(tableqlhd.getSelectedRow() + "") < 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn hóa đơn để thanh toán !");
                return;
            }
        } catch (Exception e) {
        }

        try {
            String trangthai = tableqlhd.getValueAt(tableqlhd.getSelectedRow(), 6).toString();
            if (trangthai.equalsIgnoreCase("Đã Thanh Toán")) {
                JOptionPane.showMessageDialog(rootPane, "Hóa đơn đã thanh toán !");
                return;
            }

        } catch (Exception e) {
        }
        mahd = Integer.parseInt(tableqlhd.getValueAt(tableqlhd.getSelectedRow(), 0) + "");
        qrma.setText(mahd+"");
        try {
            ArrayList<ChiTietHD_DTO> listchitiet = new ChiTietHDDAO().getlistCTHD(mahd);
            for (HoaDon_DTO hd : listhoadon) {
                if (hd.getMahoadon() == mahd) {
                    hd1 = hd;
                }
            }
            DefaultTableModel df = (DefaultTableModel) viewtablechitietHD1.getModel();
            df.setRowCount(0);
            for (ChiTietHD_DTO hd : listchitiet) {
                df.addRow(new Object[]{
                    hd.getMahoadon(), hd.getMaSP(), hd.getSoluong(), hd.getMakhuyenmai(),
                    new SanPham_BUS().Chuyendoi(hd.getGiaban()),
                    new SanPham_BUS().Chuyendoi(hd.getTongkhuyenmai().doubleValue()),
                    new SanPham_BUS().Chuyendoi(hd.getthanhtien().doubleValue())});
        }
        } catch (Exception e) {
            e.printStackTrace();
        }

        viewmahd1.setText(mahd + "");
        viewngaytao1.setText(hd1.getNgaylap() + "");
        viewtongsl1.setText(hd1.getTongsl() + "");
        viewmak1.setText(hd1.getMakhach() + "");
        KhachHang_DTO kh = new KhachHang_DTO();
        try {
            kh = new HoaDon_BUS().getkh(hd1.getMakhach() + "");
        } catch (Exception e) {
        }
        viewtenk1.setText(hd1.getTenkhach());
        viewdiachi1.setText(kh.getDiaChi());
        try {
            viewtongtien1.setText(new SanPham_BUS().Chuyendoi(hd1.getTongtien().doubleValue()));
            viewtienkt1.setText(new SanPham_BUS().Chuyendoi(hd1.getTienkhachtra().doubleValue()));
            viewtientl1.setText(new SanPham_BUS().Chuyendoi(hd1.getTientralai().doubleValue()));
        } catch (Exception e) {
        }

        jdialogThanhtoan.setLocationRelativeTo(GiaoDienQL);
        jdialogThanhtoan.setVisible(true);
    }//GEN-LAST:event_ThanhToanActionPerformed

    private void ThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemHDActionPerformed
        lammoihd();
        jdialogThemHD.setLocationRelativeTo(GiaoDienQL);
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
        String d = df.format(date);
        ArrayList<HoaDon_DTO> listhd = new HoaDonDAO().getListHoaDon();
        for (HoaDon_DTO hd : listhd) {
            String s = "MuiYeuTram";
            try {
                s = hd.getTrangthai() + "rong";
            } catch (Exception e) {
            }

            if (s.equalsIgnoreCase("nullrong")) {
                newmaHD = hd.getMahoadon();
                showtableCTHD(newmaHD);
                ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
                for (KhuyenMai_DTO km : list) {
                    jcbhdkm.addItem(km.getMakm() + "");
                }
                jlbsohoadon.setText(newmaHD + "");
                jlbthoigianlap.setText(d);
                jdialogThemHD.setVisible(true);
                return;
            }
        }
        new HoaDonDAO().addHoaDonNULL(d);
        newmaHD = new HoaDon_BUS().newmahd();
        showtableCTHD(newmaHD);
        ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
        for (KhuyenMai_DTO km : list) {
            jcbhdkm.addItem(km.getMakm() + "");
        }
        jlbsohoadon.setText(newmaHD + "");
        jlbthoigianlap.setText(d);
        jdialogThemHD.setVisible(true);
    }//GEN-LAST:event_ThemHDActionPerformed

    private void txttieuchitenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttieuchitenKeyReleased
        // Theo dõi từng kí tự khi người dùng nhập
        String check = txttieuchiten.getText();
        tablekm.setRowCount(0);
        ArrayList<KhuyenMai_DTO> list = new KhuyenMaiDAO().getListKhuyenMai();
        if (check.equals("")) {
            for (KhuyenMai_DTO km : list) {
                tablekm.addRow(new Object[]{
                    km.getMakm(), km.getTenkm(), km.getNgaybd(), km.getNgaykt(), km.getGiatrikm()});
        }
        } else {
            try {
                for (KhuyenMai_DTO km : list) {
                    if (km.getTenkm().contains(check) || km.getTenkm().toLowerCase().contains(check)) {
                        tablekm.addRow(new Object[]{
                            km.getMakm(), km.getTenkm(), km.getNgaybd(), km.getNgaykt(), km.getGiatrikm()});
                }
            }
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_txttieuchitenKeyReleased

    private void cboxtieuchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxtieuchiActionPerformed
        int index = cboxtieuchi.getSelectedIndex();
        docheckboxkhuyenmai(index);
    }//GEN-LAST:event_cboxtieuchiActionPerformed

    private void btntimkiemkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemkmActionPerformed
        ArrayList<KhuyenMai_DTO> listkm = new ArrayList<>();
        int index = cboxtieuchi.getSelectedIndex();
        String str1 = txttieuchiten.getText();
        String str2 = cboxtcngay.getSelectedItem().toString();

        if (index == 0 && str1.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tiêu chí tìm kiếm !!");
            return;
        }
        if ((index == 1 || index == 2) && str2.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tiêu chí tím kiếm !!");
            return;
        }
        listkm = new KhuyenMai_BUS().getlisttimkiem(index, str1, str2);
        if (listkm.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có sản phẩm nào theo tiêu chí!!");
            return;
        }
        if (!listkm.isEmpty()) {
            tablekm.setRowCount(0);
            for (KhuyenMai_DTO km : listkm) {
                tablekm.addRow(new Object[]{
                    km.getMakm(), km.getTenkm(), km.getNgaybd(), km.getNgaykt(),
                    new KhuyenMai_BUS().ChuyendoiPercent(km.getGiatrikm())});
        }
        tablekhuyenmai.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tablekhuyenmai.getSelectedRow() >= 0) {
                    txtmakm.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 0) + "");
                    txttenkm.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 1) + "");
                    txtngaybd.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 2) + "");
                    txtngaykt.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 3) + "");
                    txtgiarti.setText(tablekhuyenmai.getValueAt(tablekhuyenmai.getSelectedRow(), 4) + "");
                }
            }
        });
        }
    }//GEN-LAST:event_btntimkiemkmActionPerformed

    private void jbtsuakmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsuakmActionPerformed
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        try {
            if (txtmakm.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn khuyến mại cần sửa !");
                return;
            }
            km.setMakm(Integer.parseInt(txtmakm.getText()));
        } catch (Exception e) {
        }
        try {
            if (txttenkm.getText().equals("") || txtngaybd.getText().equals("")
                || txtngaykt.getText().equals("") || txtgiarti.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin !!");
                return;
            }
            if (new KhuyenMai_BUS().ChuyendoiPercent(txtgiarti.getText()) <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Giá trị khuyến mại không hợp lệ!!");
                return;
            }
        } catch (Exception e) {
        }

        km.setTenkm(txttenkm.getText());
        km.setNgaybd(txtngaybd.getText());
        km.setNgaykt(txtngaykt.getText());
        km.setGiatrikm(new KhuyenMai_BUS().ChuyendoiPercent(txtgiarti.getText()));

        KhuyenMai_BUS kmb = new KhuyenMai_BUS();
        String str = kmb.checksuaKM(km);
        switch (str) {
            case "Nhập sai định dạng ngày bắt đầu hoặc kết thúc":
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng ngày bắt đầu hoặc kết thúc");
            return;
            case "Sai định dạng ngày bắt đầu và ngày kết thúc!":
            JOptionPane.showMessageDialog(rootPane, "Sai định dạng ngày bắt đầu và ngày kết thúc!");
            return;
            case "Sửa thành công!":
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công!");
            showtableKM();
            jbtlammoikmActionPerformed(evt);
            return;
            case "Sửa không thành công !":
            JOptionPane.showMessageDialog(rootPane, "Sửa không thành công!");
            return;
        }
    }//GEN-LAST:event_jbtsuakmActionPerformed

    private void jbtlammoikmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtlammoikmActionPerformed
        txtmakm.setText("");
        txttenkm.setText("");
        txtngaybd.setText("");
        txtngaykt.setText("");
        txtgiarti.setText("");
        showtableKM();
    }//GEN-LAST:event_jbtlammoikmActionPerformed

    private void jbtxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtxoaActionPerformed
        int index = tablekhuyenmai.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 Khuyến Mại trong bảng để xóa !", "Thông Báo !", 1);
            return;
        }
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        km.setMakm(Integer.parseInt(txtmakm.getText()));
        //form chọn
        int tk = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?");
        if (tk == JOptionPane.YES_OPTION) {
            if (new KhuyenMaiDAO().xoaKM(km)) {
                JOptionPane.showMessageDialog(this, "Xóa Khuyến Mại thành công !", "Thông Báo !", 1);
                showtableKM();
                jbtlammoikmActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi hệ thống !", "Thông Báo !", 0);
            }
        } else {
            return;
        }
    }//GEN-LAST:event_jbtxoaActionPerformed

    private void themkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themkmActionPerformed
        try {
            if (txttenkm.getText().equals("") || txtngaybd.getText().equals("")
                || txtngaykt.getText().equals("") || txtgiarti.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin !!");
                return;
            }
            try {
                if (!checkso(txtgiarti.getText()) || Integer.parseInt(txtgiarti.getText()) <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Giá trị khuyến mại không hợp lệ!!");
                    return;
                }
            } catch (Exception e) {
            }

        } catch (Exception e) {
        }

        KhuyenMai_DTO km = new KhuyenMai_DTO();
        try {
            km.setMakm(Integer.parseInt(txtmakm.getText()));
        } catch (Exception e) {
        }

        km.setTenkm(txttenkm.getText());
        km.setNgaybd(txtngaybd.getText());
        km.setNgaykt(txtngaykt.getText());
        km.setGiatrikm(new KhuyenMai_BUS().ChuyendoiPercent(txtgiarti.getText()));
        KhuyenMai_BUS kmb = new KhuyenMai_BUS();
        String str = kmb.checkKM(km);
        switch (str) {
            case "Khuyến mãi này đã tồn tại !!":
            JOptionPane.showMessageDialog(rootPane, "Khuyến mãi này đã tồn tại !!");
            return;
            case "Nhập sai định dạng ngày bắt đầu hoặc kết thúc":
            JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng ngày bắt đầu hoặc kết thúc");
            return;
            case "Sai định dạng ngày bắt đầu và ngày kết thúc!":
            JOptionPane.showMessageDialog(rootPane, "Ngày kết thúc phải sau này bắt đầu!");
            return;
            case "Giá trị khuyến mại không hợp lệ!":
            JOptionPane.showMessageDialog(rootPane, "Giá trị khuyến mại không hợp lệ!");
            return;
            case "Thêm thành công!":
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
            listkhuyenmai.add(km);
            showtableKM();
            jbtlammoikmActionPerformed(evt);
            return;
            case "Thêm không thành công !":
            JOptionPane.showMessageDialog(rootPane, "Thêm không thành công!");
            return;
        }
    }//GEN-LAST:event_themkmActionPerformed

   //Tìm kiếm khách hàng
    private void jbttimkiemkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttimkiemkhActionPerformed

        String str1 = cboxkhach.getSelectedItem().toString();
        String str2 = cboxdiachi.getSelectedItem().toString();

        if (str1.equals("") && str2.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng lựa chọn tiêu chí tìm kiếm !!");
            return;
        }

        ArrayList<KhachHang_DTO> list = new KhachHang_BUS().getlisttimkiem(str1, str2);
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có khách hàng nào theo tiêu chí");
            return;
        }
        if (!list.isEmpty()) {
            tablek.setRowCount(0);
            for (KhachHang_DTO kh : list) {
                tablek.addRow(new Object[]{
                    kh.getMak(), kh.getTen(), kh.getNgaySinh(), kh.getDiaChi(), kh.getSDT(), kh.getDiemTichLuy()});
        }
        //Đổ dữ liệu từ bảng vào textfield
        tableKhach.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tableKhach.getSelectedRow() >= 0) {
                    makhach.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 0) + "");
                    tenkhach.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 1) + "");
                    ngaysinh.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 2) + "");
                    diachi.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 3) + "");
                    sdt.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 4) + "");
                    diemtl.setText(tableKhach.getValueAt(tableKhach.getSelectedRow(), 5) + "");
                }
            }
        });
        }
    }//GEN-LAST:event_jbttimkiemkhActionPerformed

//GEN-FIRST:event_jbtlammoikhActionPerformed

//GEN-LAST:event_jbtlammoikhActionPerformed

//GEN-FIRST:event_jbtxoakhActionPerformed
 
//GEN-LAST:event_jbtxoakhActionPerformed

//GEN-FIRST:event_jbtsuakhActionPerformed
 
//GEN-LAST:event_jbtsuakhActionPerformed

//GEN-FIRST:event_jbtthemkhActionPerformed
 
//GEN-LAST:event_jbtthemkhActionPerformed

//Chọn Ảnh
    private void ChonanhKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChonanhKHActionPerformed
        try {
            JFileChooser file = new JFileChooser("C:\\Anh");
            file.setDialogTitle("Chọn Ảnh");
            file.showOpenDialog(null);
            File ftenanh = file.getSelectedFile();
            duongdananh = ftenanh.getAbsolutePath();
            if (duongdananh != null) {
                anhkh.setIcon(ResizeImage(String.valueOf(duongdananh)));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh");
        }
        return;
    }//GEN-LAST:event_ChonanhKHActionPerformed

//SẢN PHẨM
//Tìm kiếm sản phẩm
    private void timkiemspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemspActionPerformed
        ArrayList<SanPham_DTO> list = new ArrayList<>();

        String text = txttieuchi.getText();

        int check = combobox1.getSelectedIndex();
        if (text.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tiêu chí");
            return;
        }
        SanPham_BUS sanphambus = new SanPham_BUS();

        list = sanphambus.getlisttimkiem(check, text);

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không có sản phẩm theo tiêu chí tìm kiếm");
            return;
        }

        if (!list.isEmpty()) {
            table.setRowCount(0);
            for (SanPham_DTO sp : list) {
                table.addRow(new Object[]{
                    sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP(),
                    new SanPham_BUS().Chuyendoi(sp.getDonGia()), sp.getSoLuong(), sp.getMaKM()});
        }
        //Đổ dữ liệu từ bảng vào textfield
        tableSP.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tableSP.getSelectedRow() >= 0) {
                    masp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 0) + "");
                    tensp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 1) + "");
                    loaisp.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 2) + "");
                    giaban.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 3) + "");
                    soluong.setText(tableSP.getValueAt(tableSP.getSelectedRow(), 4) + "");
                    spcomboxkm.removeAllItems();
                    spcomboxkm.addItem(tableSP.getValueAt(tableSP.getSelectedRow(), 5) + "");
                }
            }
        });
        }
    }//GEN-LAST:event_timkiemspActionPerformed

//Làm mới ô thông tin sản phẩm
    private void lammoispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lammoispActionPerformed
        try {
            anhsp.setIcon(ResizeImage("C:\\Users\\dangm\\OneDrive\\Tài liệu\\NetBeansProjects\\QLBanMP_Nhom5\\src\\Pictures\\rsz_1addanh.jpg"));
        } catch (Exception e) {
        }
        masp.setText("");
        tensp.setText("");
        loaisp.setText("");
        giaban.setText("");
        soluong.setText("");
        spcomboxkm.removeAllItems();
        showTableSP();
    }//GEN-LAST:event_lammoispActionPerformed

//Sửa thông tin sản phẩm
    private void suaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaSPActionPerformed
        int index = tableSP.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 Sản Phẩm trong bảng để sửa !", "Thông Báo !", 1);
            return;
        }

        try {
            if (!checkso(soluong.getText()) || new SanPham_BUS().Chuyendoi(giaban.getText()) <= 0
                || new SanPham_BUS().Chuyendoi(soluong.getText()) <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Giá bán hoặc Số lượng không hợp lệ!!");
                return;
            }
        } catch (Exception e) {
        }
        if (tensp.getText().equals("") || loaisp.getText().equals("")
            || giaban.getText().equals("") || soluong.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin !!");
            return;
        } else {
            SanPham_DTO spmoi = new SanPham_DTO();
            spmoi.setMaSP(Integer.parseInt(masp.getText()));
            spmoi.setTenSP(tensp.getText());
            spmoi.setLoaiSP(loaisp.getText());
            spmoi.setDonGia((float) new SanPham_BUS().Chuyendoi(giaban.getText()));
            spmoi.setSoLuong(Integer.parseInt(soluong.getText()));
            spmoi.setMaKM(spcomboxkm.getSelectedItem() + "");
            spmoi.setAnhsp(duongdananh);
            if (spmoi.getMaKM().equals("")) {
                if (new SanPhamDAO().SuaSPNULL(spmoi)) {
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
                    duongdananh = "C:\\Users\\dangm\\OneDrive\\Tài liệu"
                    + "\\NetBeansProjects\\QLBanMP_Nhom5\\src\\Pictures\\rsz_1addanh.jpg";
                    showTableSP();
                    lammoispActionPerformed(evt);
                    return;
                }
            }
            if (new SanPhamDAO().SuaSP(spmoi)) {
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
                duongdananh = "C:\\Users\\dangm\\OneDrive\\Tài liệu"
                + "\\NetBeansProjects\\QLBanMP_Nhom5\\src\\Pictures\\rsz_1addanh.jpg";
                showTableSP();
                lammoispActionPerformed(evt);
                return;
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công vui lòng thử lại !");
            }
        }
    }//GEN-LAST:event_suaSPActionPerformed

// Xóa thông tin sản phẩm
    private void xoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaSPActionPerformed
        int index = tableSP.getSelectedRow();

        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 Sản Phẩm trong bảng để xóa !", "Thông Báo !", 1);
            return;
        }
        SanPham_DTO sp = new SanPham_DTO();
        sp.setMaSP(Integer.parseInt(masp.getText()));

        int tk = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không ?");
        if (tk == JOptionPane.YES_OPTION) {
            if (new SanPhamDAO().xoaSP(sp)) {

                JOptionPane.showMessageDialog(this, "Xóa Sản Phẩm thành công !", "Thông Báo !", 1);
                while (table.getRowCount() != 0) {
                    table.removeRow(0);
                }
                showTableSP();
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi hệ thống !", "Thông Báo !", 0);
            }

        } else {
            return;

        }
    }//GEN-LAST:event_xoaSPActionPerformed

//Them san pham
    private void themSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSPActionPerformed
        if (tensp.getText().equals("") || loaisp.getText().equals("")
            || giaban.getText().equals("") || soluong.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin !!");
            return;
        }
        try {
            if (!checkso(soluong.getText()) || new SanPham_BUS().Chuyendoi(soluong.getText()) <= 0
                || !checkso(giaban.getText()) || new SanPham_BUS().Chuyendoi(giaban.getText()) <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Giá bán hoặc Số lượng không hợp lệ!!");
                return;
            }
        } catch (Exception e) {
        }
        SanPham_DTO spm = new SanPham_DTO();
        try {
            spm.setMaSP(Integer.parseInt(masp.getText()));
        } catch (Exception e) {
        }
        spm.setTenSP(tensp.getText());
        spm.setLoaiSP(loaisp.getText());
        spm.setDonGia((float) new SanPham_BUS().Chuyendoi(giaban.getText()));
        spm.setSoLuong(Integer.parseInt(soluong.getText()));
        spm.setMaKM(spcomboxkm.getSelectedItem() + "");
        spm.setAnhsp(duongdananh);
        SanPham_BUS Bussiness = new SanPham_BUS();
        String str = Bussiness.checkSP(spm);
        switch (str) {

            case "Sản phẩm đã tồn tại !!":
            JOptionPane.showMessageDialog(rootPane, "Sản phẩm đã tồn tại");
            return;
            case "Thêm thành công!":
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            listsp.add(spm);
            showTableSP();
            lammoispActionPerformed(evt);
            duongdananh = "C:\\Users\\dangm\\OneDrive\\Tài liệu\\NetBeansProjects"
            + "\\QLBanMP_Nhom5\\src\\Pictures\\rsz_1addanh.jpg";
            return;
            case "Thêm không thành công !":
            JOptionPane.showMessageDialog(rootPane, "Thêm không thành thành công");
            return;
        }
    }//GEN-LAST:event_themSPActionPerformed

    private void ChonanhSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChonanhSPActionPerformed
        try {
            JFileChooser file = new JFileChooser("C:\\Anh");
            file.setDialogTitle("Chọn Ảnh");
            file.showOpenDialog(null);
            File ftenanh = file.getSelectedFile();
            duongdananh = ftenanh.getAbsolutePath();
            if (duongdananh != null) {
                anhsp.setIcon(ResizeImage(String.valueOf(duongdananh)));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn ảnh");
        }
        return;
    }//GEN-LAST:event_ChonanhSPActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChonanhKH;
    private javax.swing.JButton ChonanhSP;
    private javax.swing.JPanel Form;
    private javax.swing.JPanel FormKM;
    private javax.swing.JTabbedPane GiaoDienQL;
    private javax.swing.JPanel QLHoaDon;
    private javax.swing.JPanel QLKhachHang;
    private javax.swing.JPanel QLKhuyenMai;
    private javax.swing.JPanel QLSanPham;
    private javax.swing.JPanel QLThongKe;
    private javax.swing.JDialog QR;
    private javax.swing.JTextField TendialogKH;
    private javax.swing.JTextField TendialogKH1;
    private javax.swing.JButton ThanhToan;
    private javax.swing.JButton ThemHD;
    private javax.swing.JLabel anhQR;
    private javax.swing.JLabel anhdialogKh;
    private javax.swing.JLabel anhdialogKh1;
    private javax.swing.JLabel anhkh;
    private javax.swing.JLabel anhsp;
    private javax.swing.JButton btnExithd;
    private javax.swing.JButton btnExithd1;
    private javax.swing.JButton btnQR;
    private javax.swing.JButton btnSuahd;
    private javax.swing.JButton btnThemhd;
    private javax.swing.JButton btnViewexit;
    private javax.swing.JButton btnViewexit1;
    private javax.swing.JButton btnViewexit2;
    private javax.swing.JButton btntimkiemkm;
    private javax.swing.JButton btsetdathanhtoan;
    private javax.swing.JComboBox<String> cboxdiachi;
    private javax.swing.JComboBox<String> cboxhdloaisp;
    private javax.swing.JComboBox<String> cboxhdloaisp1;
    private javax.swing.JComboBox<String> cboxkhach;
    private javax.swing.JComboBox<String> cboxtcngay;
    private javax.swing.JComboBox<String> cboxtieuchi;
    private javax.swing.JTextField checkDC;
    private javax.swing.JTextField checkDC1;
    private javax.swing.JTextField checkdongia;
    private javax.swing.JTextField checkdongia1;
    private javax.swing.JTextField checkten;
    private javax.swing.JTextField checkten1;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JTextField diachi;
    private javax.swing.JTextField diachidialogKH;
    private javax.swing.JTextField diachidialogKH1;
    private javax.swing.JTextField diemtl;
    private javax.swing.JLabel dt_slhd;
    private javax.swing.JLabel dt_slsp;
    private javax.swing.JLabel dt_tongtien;
    private javax.swing.JTextField dtldialogKH;
    private javax.swing.JTextField dtldialogKH1;
    private javax.swing.JTextField edittkhachttra;
    private javax.swing.JLabel edittongtien;
    private javax.swing.JTextField editttralai;
    private javax.swing.JButton exitdialogKH;
    private javax.swing.JButton exitdialogKH1;
    private javax.swing.JButton exitdialogSP;
    private javax.swing.JButton exitdialogSP1;
    private javax.swing.JTextField giaban;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jbtlammoikh;
    private javax.swing.JButton jbtlammoikm;
    private javax.swing.JButton jbtsuakh;
    private javax.swing.JButton jbtsuakm;
    private javax.swing.JButton jbtthemkh;
    private javax.swing.JButton jbttimkiemkh;
    private javax.swing.JButton jbtxoa;
    private javax.swing.JButton jbtxoakh;
    private javax.swing.JComboBox<String> jcbeditHD;
    private javax.swing.JComboBox<String> jcbhdkm;
    private javax.swing.JComboBox<String> jcbngaylaphd;
    private javax.swing.JComboBox<String> jcomboTrangthai;
    private javax.swing.JDialog jdialogEditHD;
    private javax.swing.JDialog jdialogKH;
    private javax.swing.JDialog jdialogKH1;
    private javax.swing.JDialog jdialogSP;
    private javax.swing.JDialog jdialogSP1;
    private javax.swing.JDialog jdialogThanhtoan;
    private javax.swing.JDialog jdialogThemHD;
    private javax.swing.JDialog jdialogView;
    private javax.swing.JLabel jlbdiachi;
    private javax.swing.JLabel jlbdiachi1;
    private javax.swing.JLabel jlbmak;
    private javax.swing.JLabel jlbmak1;
    private javax.swing.JLabel jlbsohoadon;
    private javax.swing.JLabel jlbsohoadon1;
    private javax.swing.JLabel jlbthoigianlap;
    private javax.swing.JLabel jlbthoigianlap1;
    private javax.swing.JLabel jlbtongsl;
    private javax.swing.JLabel jlbtongsl1;
    private javax.swing.JLabel jlbtongtien;
    private javax.swing.JTextField jtextgia;
    private javax.swing.JTextField jtextgia1;
    private javax.swing.JTextField jtextslcon;
    private javax.swing.JTextField jtextslcon1;
    private javax.swing.JTextField jtexttensp;
    private javax.swing.JTextField jtexttensp1;
    private javax.swing.JButton lammoisp;
    private javax.swing.JTextField loaisp;
    private javax.swing.JTextField madialogKH;
    private javax.swing.JTextField madialogKH1;
    private javax.swing.JTextField makhach;
    private javax.swing.JTextField masp;
    private javax.swing.JTextField ngaysdialogKH;
    private javax.swing.JTextField ngaysdialogKH1;
    private javax.swing.JTextField ngaysinh;
    private javax.swing.JButton okdialogKH;
    private javax.swing.JButton okdialogKH1;
    private javax.swing.JButton okdialogSP;
    private javax.swing.JButton okdialogSP1;
    private javax.swing.JLabel qrma;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField sdtdialogKH;
    private javax.swing.JTextField sdtdialogKH1;
    private javax.swing.JTextField soluong;
    private javax.swing.JComboBox<String> spcomboxkm;
    private javax.swing.JSpinner spinnerslmua;
    private javax.swing.JSpinner spinnerslmua1;
    private javax.swing.JButton suaSP;
    private javax.swing.JTable tableChitietHD;
    private javax.swing.JTable tableChitietHD1;
    private javax.swing.JTable tableHDKH;
    private javax.swing.JTable tableHDKH1;
    private javax.swing.JTable tableKhach;
    private javax.swing.JTable tableSP;
    public javax.swing.JTable tableSPHD;
    public javax.swing.JTable tableSPHD1;
    private javax.swing.JTable tablekhuyenmai;
    private javax.swing.JTable tableqlhd;
    private javax.swing.JTextField tenkhach;
    private javax.swing.JTextField tensp;
    private javax.swing.JButton themSP;
    private javax.swing.JButton themkm;
    private javax.swing.JButton timkiemsp;
    private javax.swing.JComboBox<String> tk_comboxtieuchi;
    private javax.swing.JDialog tk_dialogDoanhthu;
    private javax.swing.JButton tk_dtExit;
    private javax.swing.JTable tk_tableHD;
    private javax.swing.JTable tk_tableKH;
    private javax.swing.JTable tk_tableSP;
    private javax.swing.JButton tk_tatca;
    private javax.swing.JButton tk_thongkedoanhthu;
    private javax.swing.JButton tk_tke;
    private javax.swing.JTextField txtgiarti;
    private javax.swing.JTextField txtmakm;
    private javax.swing.JTextField txtngaybd;
    private javax.swing.JTextField txtngaykt;
    private javax.swing.JTextField txttenkhach;
    private javax.swing.JTextField txttenkhach1;
    private javax.swing.JTextField txttenkm;
    private javax.swing.JTextField txttienkhachtra;
    private javax.swing.JTextField txttientralai;
    private javax.swing.JTextField txttieuchi;
    private javax.swing.JTextField txttieuchiten;
    private javax.swing.JLabel viewdiachi;
    private javax.swing.JLabel viewdiachi1;
    private javax.swing.JLabel viewmahd;
    private javax.swing.JLabel viewmahd1;
    private javax.swing.JLabel viewmak;
    private javax.swing.JLabel viewmak1;
    private javax.swing.JLabel viewngaytao;
    private javax.swing.JLabel viewngaytao1;
    private javax.swing.JTable viewtablechitietHD;
    private javax.swing.JTable viewtablechitietHD1;
    private javax.swing.JTextField viewtenk;
    private javax.swing.JTextField viewtenk1;
    private javax.swing.JTextField viewtienkt;
    private javax.swing.JTextField viewtienkt1;
    private javax.swing.JTextField viewtientl;
    private javax.swing.JTextField viewtientl1;
    private javax.swing.JLabel viewtongsl;
    private javax.swing.JLabel viewtongsl1;
    private javax.swing.JTextField viewtongtien;
    private javax.swing.JTextField viewtongtien1;
    private javax.swing.JButton xoaSP;
    // End of variables declaration//GEN-END:variables

    private Icon ResizeImage(String valueOf) {
        ImageIcon icon = new ImageIcon(valueOf);
        Image image = icon.getImage();
        Image newimage = image.getScaledInstance(anhkh.getWidth(), anhkh.getHeight(), image.SCALE_SMOOTH);
        ImageIcon iconn = new ImageIcon(newimage);
        return iconn;
    }

    private Icon ResizeImage1(String valueOf) {
        ImageIcon icon = new ImageIcon(valueOf );
        Image image = icon.getImage();
        Image newimage = image.getScaledInstance(800, 700, image.SCALE_SMOOTH);
        ImageIcon iconn = new ImageIcon(newimage);
        return iconn;
    }

}
