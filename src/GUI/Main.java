/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Entity.SanPham;
import Entity.KhachHang;
import Entity.NhanVien;
import Entity.HoaDon;
import Entity.ChiTietHoaDon;
import Entity.LoaiKhachHang;
import Entity.LoaiSanPham;
import Entity.ThongKe;

import DLL.AccountDLL;
import DLL.ChiTietHoaDonDLL;
import DLL.HoaDonDLL;
import DLL.KhachHangDLL;
import DLL.LoaiKhachHangDLL;
import DLL.NhanVienDLL;
import DLL.SanPhamDLL;
import DLL.LoaiSanPhamDLL;
import DLL.ThongKeDLL;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hieun
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private boolean iClose = false;

    public NhanVien sv;

    public void setNhanvien1(NhanVien SV) {
        this.sv = SV;
    }

    public Main() {
        initComponents();
    }

    public Main(NhanVien sv) {
        initComponents();
        setNhanvien1(sv);
    }

    //close window
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    //DLL
    AccountDLL accdll = new AccountDLL();
    SanPhamDLL spdll = new SanPhamDLL();
    ChiTietHoaDonDLL cthddll = new ChiTietHoaDonDLL();
    HoaDonDLL hddll = new HoaDonDLL();
    NhanVienDLL nvdll = new NhanVienDLL();
    KhachHangDLL khdll = new KhachHangDLL();
    LoaiKhachHangDLL lkhdll = new LoaiKhachHangDLL();
    LoaiSanPhamDLL lspdll = new LoaiSanPhamDLL();
    ThongKeDLL tkdll = new ThongKeDLL();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_TrangChu = new javax.swing.JButton();
        btn_SanPham = new javax.swing.JButton();
        btn_KhachHang = new javax.swing.JButton();
        btn_NhanVien = new javax.swing.JButton();
        Btn_HoaDon = new javax.swing.JButton();
        btn_ChiTietHoaDon = new javax.swing.JButton();
        btn_ThongKe = new javax.swing.JButton();
        btn_Thoat1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtn_SuaSP = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSanPham = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableKhachHang = new javax.swing.JTable();
        jTextField28 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txt_NV_TNV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_NV_DC = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_NV_MK = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_NV_MNV = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_NV_TDN = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        txt_NV_SDT = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableHD = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel24 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableCTHoaDon = new javax.swing.JTable();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        btn_print = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton24 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_TrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_TrangChu.setText("Trang chủ");
        btn_TrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TrangChuActionPerformed(evt);
            }
        });

        btn_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_SanPham.setText("Sản phẩm");
        btn_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SanPhamActionPerformed(evt);
            }
        });

        btn_KhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_KhachHang.setText("Khách hàng");
        btn_KhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KhachHangActionPerformed(evt);
            }
        });

        btn_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_NhanVien.setText("Nhân viên");
        btn_NhanVien.setEnabled(false);
        btn_NhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVienActionPerformed(evt);
            }
        });

        Btn_HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_HoaDon.setText("Hóa đơn");
        Btn_HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HoaDonActionPerformed(evt);
            }
        });

        btn_ChiTietHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ChiTietHoaDon.setText("Chi tiết hóa đơn");
        btn_ChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietHoaDonActionPerformed(evt);
            }
        });

        btn_ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ThongKe.setText("Thống kê");
        btn_ThongKe.setEnabled(false);
        btn_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongKeActionPerformed(evt);
            }
        });

        btn_Thoat1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Thoat1.setText("Thoát");
        btn_Thoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Thoat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Btn_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ChiTietHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Thoat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Thoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Trang Chủ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("CHÀO MỪNG BẠN ĐẾN VỚI CỬA HÀNG QUẦN ÁO ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Homebackground.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel6);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Sản phẩm");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Mã sản phẩm");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Tên sản phẩm");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("mã loại sản phẩm");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("Size");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Ngày sản xuất");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText("Số lượng");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Hủy");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Thêm");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtn_SuaSP.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jbtn_SuaSP.setText("Sửa");
        jbtn_SuaSP.setEnabled(false);
        jbtn_SuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_SuaSPActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton4.setText("Xóa");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("mô tả sản phẩm");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel52.setText("Giá Nhập");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel53.setText("Giá bán");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_SuaSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 25, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(jbtn_SuaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jTableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên sản phẩm", "Mã Loại Sản Phẩm", "Giá Nhập", "Giá Bán", "Mô tả sản phẩm", "Size", "Ngày Sản Xuất", "Số Lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSanPham);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton21.setText("Tìm");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(137, 137, 137))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", jPanel7);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Khách hàng");

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setText("Mã khách hàng");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("Giới tính");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setText("SĐT");

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("Tên khách hàng");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("Địa chỉ");

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("Hủy");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton6.setText("Thêm");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("Sửa");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("Xóa");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel51.setText("Loại Khách Hàng");

        jComboBox8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField9)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jTableKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Địa Chỉ", "Giới Tính", "SĐT", "LoaiKhachHang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKhachHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableKhachHang);

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField28KeyReleased(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton22.setText("Tìm");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton22)
                .addGap(144, 144, 144))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab3", jPanel8);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Nhân viên");

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setText("Tên nhân viên");

        txt_NV_TNV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("Địa chỉ");

        txt_NV_DC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setText("Mật khẩu");

        txt_NV_MK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel31.setText("Mã nhân viên");

        txt_NV_MNV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel32.setText("Tên đăng nhập");

        txt_NV_TDN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel33.setText("SDT");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel34.setText("Giới tính");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel35.setText("Chức vụ");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHỦ SHOP", "QUẢN LÝ", "NHÂN VIÊN" }));

        txt_NV_SDT.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel36.setText("Ngày sinh");

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("Hủy");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setText("Thêm");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton11.setText("Sửa");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("Xóa");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jDateChooser6.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_NV_MNV, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txt_NV_TDN, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_NV_MK)
                    .addComponent(txt_NV_DC)
                    .addComponent(txt_NV_TNV, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txt_NV_SDT)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(16, 16, 16))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txt_NV_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txt_NV_TDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NV_TNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txt_NV_DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(txt_NV_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NV_MK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Giới tính", "Ngày Sinh", "Địa chỉ", "SĐT", "Tên Đăng Nhập", "Mật Khẩu", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableNhanVien);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel9);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Hóa đơn");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel37.setText("Số hóa đơn");

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel38.setText("Mã nhân viên");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel39.setText("Nhân viên lập hóa đơn");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel40.setText("Mã khách hàng");

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Ngày lập hóa đơn");

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText("Hủy");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton14.setText("Thêm");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton15.setText("Sửa");
        jButton15.setEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton16.setText("Xóa");
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jComboBox6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jDateChooser2.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(47, 47, 47)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41)
                        .addComponent(jLabel37))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16))
                .addGap(0, 0, 0))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jTableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số Hóa Đơn", "Mã Nhân Viên", "Nhân Viên Lập", "Ngày Lập", "Mã Khách Hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHDMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableHD);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel10);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Chi tiết hóa đơn");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setText("            SHOP BÁN QUẦN ÁO THỜI TRANG");

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("mã sản phẩm");

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel43.setText("Đơn giá");

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel44.setText("Số lượng");

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel45.setText("Số hóa đơn");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel46.setText("Tên sản phẩm");

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton17.setText("Hủy");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton18.setText("Thêm");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton19.setText("Sửa");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton20.setText("Xóa");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox7MouseClicked(evt);
            }
        });
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel45))
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45)
                                .addComponent(jLabel46)))
                        .addComponent(jComboBox7))
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(0, 0, 0)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách các mặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel47.setText("Mã nhân viên");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel48.setText("Nhân viên lập HD");

        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField25.setEnabled(false);

        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField26.setEnabled(false);

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel49.setText("Mã khách hàng");

        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextField27.setEnabled(false);

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel50.setText("Ngày lập HĐơn");

        jTableCTHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Đơn Giá", "Số Lượng", "Tổng Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCTHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCTHoaDonMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableCTHoaDon);

        jDateChooser3.setDateFormatString("dd-MM-yyyy");
        jDateChooser3.setEnabled(false);
        jDateChooser3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        btn_print.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addGap(30, 30, 30)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_print)
                .addGap(14, 14, 14))
            .addComponent(jScrollPane5)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab6", jPanel11);

        jDateChooser5.setDateFormatString("dd-MM-yyyy");

        jDateChooser4.setDateFormatString("dd-MM-yyyy");

        jButton3.setText("Thống Kê");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Từ ngày");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Đến ngày");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Lập", "Tổng Số Sản Phẩm", "Tổng tiền", "Mã Nhân Viên", "Nhân Viên Lập Hóa Đơn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane7.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel57.setText("Tổng Doanh Thu");

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel55)
                        .addGap(20, 20, 20)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jTabbedPane2.addTab("Doanh Thu", jPanel26);

        jButton24.setText("Tìm Kiếm");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Lập", "Số Hóa đơn", "Tổng Số Hóa Đơn", "Tổng tiền", "Mã Nhân Viên", "Nhân Viên Lập Hóa Đơn", "Sản Phẩm", "Đơn Giá", "Số Lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable2);

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel58.setText("Tổng Tiền");

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton24))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jComboBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nhân Viên", jPanel27);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setText("Thống Kê");

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton23.setText("Thông Kê Doanh Thu");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton25.setText("Thông Kê Nhân Viên");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab7", jPanel25);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 890, 760));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //LOAD DATABASE FULL

    private void btn_TrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TrangChuActionPerformed
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_btn_TrangChuActionPerformed

    private void btn_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SanPhamActionPerformed
        resetForm();
        LoadDatabaseSanPham();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btn_SanPhamActionPerformed
    //load database SanPham
    private void LoadDatabaseSanPham() {

        jButton1.setMnemonic(KeyEvent.VK_Z);
        jButton2.setMnemonic(KeyEvent.VK_A);
        jbtn_SuaSP.setMnemonic(KeyEvent.VK_S);
        jButton4.setMnemonic(KeyEvent.VK_D);

        List<SanPham> listSP = spdll.getALLSanPham();
        DefaultTableModel model = (DefaultTableModel) jTableSanPham.getModel();
        model.setRowCount(0);
        for (SanPham o : listSP) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(), o.getMaLoaiSanPham(), o.getGiaNhap(),
                o.getGiaBan(), o.getMoTaSanPham(), o.getSize(), o.getNgaySanXuat(), o.getSoLuong()});
        }

        List<LoaiSanPham> listlsp = lspdll.getALLLoaiSanPham();
        jComboBox9.removeAllItems();

        for (LoaiSanPham o : listlsp) {
            jComboBox9.addItem(o.getTenLoaiSanPham());
        }
    }


    private void btn_KhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KhachHangActionPerformed
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        LoadDatabaseKhachHang();
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btn_KhachHangActionPerformed

    //load database KHÁCH HÀNG
    private void LoadDatabaseKhachHang() {

        jButton5.setMnemonic(KeyEvent.VK_Z);
        jButton6.setMnemonic(KeyEvent.VK_A);
        jButton7.setMnemonic(KeyEvent.VK_S);
        jButton8.setMnemonic(KeyEvent.VK_D);

        DefaultTableModel model = (DefaultTableModel) jTableKhachHang.getModel();
        model.setRowCount(0);

        List<KhachHang> listKH = khdll.getALLKhachHang();

        for (KhachHang o : listKH) {
            model.addRow(new Object[]{o.getMaKH(), o.getTenKhach(), o.getDiaChi(), o.getGioiTinh(), o.getSdt(), o.getMaloaikhachhang()});
        }
        jComboBox8.removeAllItems();
        List<LoaiKhachHang> listlkh = lkhdll.getALLLoaiKhachHang();
        for (LoaiKhachHang o : listlkh) {
            jComboBox8.addItem(o.getTenloaikhachhang());
        }
    }

    private void btn_NhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVienActionPerformed
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        LoadDatabaseNhanVien();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btn_NhanVienActionPerformed

    //load database Nhân Viên
    private void LoadDatabaseNhanVien() {

        jButton9.setMnemonic(KeyEvent.VK_Z);
        jButton10.setMnemonic(KeyEvent.VK_A);
        jButton11.setMnemonic(KeyEvent.VK_S);
        jButton12.setMnemonic(KeyEvent.VK_D);

        List<NhanVien> listNV = nvdll.getALLNhanvien();

        DefaultTableModel model = (DefaultTableModel) jTableNhanVien.getModel();

        model.setRowCount(0);
        for (NhanVien o : listNV) {
            model.addRow(new Object[]{o.getMaNhanVien(), o.getTenNhanVien(), o.getGioiTinh(), o.getNgaySinh(),
                o.getDiaChi(), o.getSdt(), o.getTenDangNhap(), o.getMatKhau(), o.getChucVu()});
        }

    }

    private void Btn_HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HoaDonActionPerformed
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        LoadDatabaseHoaDon();
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_Btn_HoaDonActionPerformed

    //load database Hóa Đơn
    private void LoadDatabaseHoaDon() {

        jButton13.setMnemonic(KeyEvent.VK_Z);
        jButton14.setMnemonic(KeyEvent.VK_A);
        jButton15.setMnemonic(KeyEvent.VK_S);
        jButton16.setMnemonic(KeyEvent.VK_D);

        List<HoaDon> listHD = hddll.getALLHoaDon();
        DefaultTableModel model = (DefaultTableModel) jTableHD.getModel();
        model.setRowCount(0);
        for (HoaDon o : listHD) {
            model.addRow(new Object[]{o.getSoHD(), o.getMaNhanVien(), o.getNhanVienLap(), o.getNgayLap(), o.getMaKH()});
        }

        System.out.println();
        jComboBox5.removeAllItems();
        jComboBox6.removeAllItems();
        List<NhanVien> listNV = nvdll.getALLNhanvien();
        for (NhanVien o : listNV) {
            jComboBox5.addItem(o.getMaNhanVien());
        }
        for (NhanVien o : listNV) {
            jComboBox6.addItem(o.getTenNhanVien());
        }
    }
    boolean check = true;
    private void btn_ChiTietHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietHoaDonActionPerformed

        check = true;
        if (check) {
            LoadDatabaseChiTietHoaDon();
            check = false;
        }

        jTabbedPane1.setSelectedIndex(5);

    }//GEN-LAST:event_btn_ChiTietHoaDonActionPerformed
   
    private void LoadDatabaseChiTietHoaDon() {

        jComboBox7.removeAllItems();

        jButton17.setMnemonic(KeyEvent.VK_Z);
        jButton18.setMnemonic(KeyEvent.VK_A);
        jButton19.setMnemonic(KeyEvent.VK_S);
        jButton20.setMnemonic(KeyEvent.VK_D);

        List<ChiTietHoaDon> listCTHD = cthddll.getALLChiTietHoaDon();
        DefaultTableModel model = (DefaultTableModel) jTableCTHoaDon.getModel();
        model.setRowCount(0);
        for (ChiTietHoaDon o : listCTHD) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getSanPham(),
                o.getDonGia(), o.getSoLuong(), o.getTongTien()});
        }
        List<HoaDon> listHD = hddll.getALLHoaDon();
        for (HoaDon o : listHD) {
            jComboBox7.addItem(o.getSoHD());
        }

        List<SanPham> listSP = spdll.getALLSanPham();
        for (SanPham o : listSP) {
            jComboBox4.addItem(o.getMoTaSanPham());
        }
    }

    private void LoadDatabaseChiTietHoaDon(String s) {

        jButton17.setMnemonic(KeyEvent.VK_Z);
        jButton18.setMnemonic(KeyEvent.VK_A);
        jButton19.setMnemonic(KeyEvent.VK_S);
        jButton20.setMnemonic(KeyEvent.VK_D);

        List<ChiTietHoaDon> listCTHD = cthddll.GetALLChiTietHoaDon(s);
        DefaultTableModel model = (DefaultTableModel) jTableCTHoaDon.getModel();
        model.setRowCount(0);
        for (ChiTietHoaDon o : listCTHD) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getSanPham(),
                o.getDonGia(), o.getSoLuong(), o.getTongTien()});
        }

        List<HoaDon> listHD = hddll.getALLHoaDon();
        for (HoaDon o : listHD) {
            jComboBox7.addItem(o.getSoHD());
        }
        List<SanPham> listSP = spdll.getALLSanPham();
        for (SanPham o : listSP) {
            jComboBox4.addItem(o.getMoTaSanPham());
        }
    }

    private void btn_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongKeActionPerformed
        LoadDatabaseThongKe();
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_btn_ThongKeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (iClose == false) {
            close();
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jTableCTHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCTHoaDonMouseClicked
        int row = jTableCTHoaDon.getSelectedRow();
        String s0 = jTableCTHoaDon.getValueAt(row, 0).toString();
        String s1 = jTableCTHoaDon.getValueAt(row, 1).toString();
        String s2 = jTableCTHoaDon.getValueAt(row, 2).toString();
        String s3 = jTableCTHoaDon.getValueAt(row, 3).toString();
        //String s4 = jTableCTHoaDon.getValueAt(row, 4).toString();

        jTextField22.setText(s0);
        int i = 0;
        while (true) {
            String nameFromeCbbox = jComboBox4.getItemAt(i).toString();
            if (nameFromeCbbox.equalsIgnoreCase(s1)) {
                jComboBox4.setSelectedIndex(i);
                break;
            }
            i++;
        }

        jTextField24.setText(s3);
        jTextField23.setText(s2);
    }//GEN-LAST:event_jTableCTHoaDonMouseClicked

    private void jTableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSanPhamMouseClicked
        int row = jTableSanPham.getSelectedRow();
        String s1 = jTableSanPham.getValueAt(row, 0).toString();
        String s2 = jTableSanPham.getValueAt(row, 1).toString();
        String s3 = jTableSanPham.getValueAt(row, 2).toString();
        String s4 = jTableSanPham.getValueAt(row, 3).toString();
        String s5 = jTableSanPham.getValueAt(row, 4).toString();
        String s6 = jTableSanPham.getValueAt(row, 5).toString();
        String s7 = jTableSanPham.getValueAt(row, 6).toString();
        String s8 = jTableSanPham.getValueAt(row, 7).toString();
        String s9 = jTableSanPham.getValueAt(row, 8).toString();

        jTextField1.setText(s1);
        jTextField2.setText(s2);
        int j = 0;
        while (true) {
            String nameFromeCbbox = jComboBox9.getItemAt(j);
            if (nameFromeCbbox.equalsIgnoreCase(lspdll.getTenLoaiKhachHang(s3))) {
                jComboBox9.setSelectedIndex(j);
                break;
            }
            j++;
        }
        jTextArea1.setText(s6);
        jTextField3.setText(s4);
        jTextField5.setText(s5);
        jTextField4.setText(s7);
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(s8);
        jTextField6.setText(s9);

    }//GEN-LAST:event_jTableSanPhamMouseClicked

    private void jTableKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKhachHangMouseClicked
        int row = jTableKhachHang.getSelectedRow();
        String s1 = jTableKhachHang.getValueAt(row, 0).toString();
        String s2 = jTableKhachHang.getValueAt(row, 1).toString();
        String s3 = jTableKhachHang.getValueAt(row, 2).toString();
        String s4 = jTableKhachHang.getValueAt(row, 3).toString();
        String s5 = jTableKhachHang.getValueAt(row, 4).toString();
        String s6 = jTableKhachHang.getValueAt(row, 5).toString();

        jTextField8.setText(s1);
        jTextField9.setText(s2);
        jTextField10.setText(s3);
        jTextField11.setText(s5);
        int i = 0, j = 0;
        while (true) {
            String nameFromeCbbox = jComboBox1.getItemAt(i);
            if (nameFromeCbbox.equalsIgnoreCase(s4)) {
                jComboBox1.setSelectedIndex(i);
                break;
            }
            i++;
        }

        jComboBox8.setSelectedItem(lkhdll.getTenLoaiKhachHang(s6));
        while (true) {
            String nameFromeCbbox = jComboBox8.getItemAt(j);
            if (nameFromeCbbox.equalsIgnoreCase(lkhdll.getTenLoaiKhachHang(s6))) {
                jComboBox8.setSelectedIndex(j);
                break;
            }
            j++;
        }

    }//GEN-LAST:event_jTableKhachHangMouseClicked

    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienMouseClicked
        int row = jTableNhanVien.getSelectedRow();
        String s0 = jTableNhanVien.getValueAt(row, 0).toString();
        String s1 = jTableNhanVien.getValueAt(row, 1).toString();
        String s2 = jTableNhanVien.getValueAt(row, 2).toString();
        String s3 = jTableNhanVien.getValueAt(row, 3).toString();
        String s4 = jTableNhanVien.getValueAt(row, 4).toString();
        String s5 = jTableNhanVien.getValueAt(row, 5).toString();
        String s6 = jTableNhanVien.getValueAt(row, 6).toString();
        String s7 = jTableNhanVien.getValueAt(row, 7).toString();
        String s8 = jTableNhanVien.getValueAt(row, 8).toString();

        txt_NV_MNV.setText(s0);
        txt_NV_TNV.setText(s1);
        int i = 0, j = 0;

        while (true) {
            String nameFromeCbbox = jComboBox2.getItemAt(i);
            if (nameFromeCbbox.equalsIgnoreCase(s2)) {
                jComboBox2.setSelectedIndex(i);
                break;
            }
            i++;
        }
        ((JTextField) jDateChooser6.getDateEditor().getUiComponent()).setText(s3);
        txt_NV_DC.setText(s4);
        txt_NV_SDT.setText(s5);
        txt_NV_TDN.setText(s6);
        txt_NV_MK.setText(s7);
        while (true) {
            String nameFromeCbbox2 = jComboBox3.getItemAt(j);
            if (nameFromeCbbox2.equalsIgnoreCase(s8)) {
                jComboBox3.setSelectedIndex(j);
                break;
            }
            j++;
        }
    }//GEN-LAST:event_jTableNhanVienMouseClicked

    private void jTableHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHDMouseClicked
        int row = jTableHD.getSelectedRow();
        String s0 = jTableHD.getValueAt(row, 0).toString();
        String s1 = jTableHD.getValueAt(row, 1).toString();
        String s2 = jTableHD.getValueAt(row, 2).toString();
        String s3 = jTableHD.getValueAt(row, 3).toString();
        String s4 = jTableHD.getValueAt(row, 4).toString();

        jTextField18.setText(s0);

        jComboBox6.setSelectedItem(s2);
        jComboBox5.setSelectedItem(s1);
        //System.out.println(s2);

//        while (true) {
//            String nameFromeCbbox = jComboBox5.getItemAt(i).toString();
//            if (nameFromeCbbox.equalsIgnoreCase(s1)) {
//                jComboBox5.setSelectedIndex(i);
//                break;
//            }
//            i++;
//        }
//        while (true) {
//            String nameFromeCbbox = jComboBox6.getItemAt(j).toString();
//            if (nameFromeCbbox.equalsIgnoreCase(s2)) {
//                jComboBox6.setSelectedIndex(j);
//                break;
//            }
//            j++;
//        }
        ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText(s3);
        jTextField21.setText(s4);
    }//GEN-LAST:event_jTableHDMouseClicked

    private void jbtn_SuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_SuaSPActionPerformed

        if (jbtn_SuaSP.getText().equals("Sửa")) {
            jButton4.setEnabled(false);
            jButton1.setEnabled(true);
            jButton2.setEnabled(false);
            jbtn_SuaSP.setText("LƯU");
        } else if (jbtn_SuaSP.getText().equals("LƯU")) {
            String masp = jTextField1.getText();
            String tensp = jTextField2.getText();
            String loaisanpham = jComboBox9.getSelectedItem().toString();
            float gianhap = Float.parseFloat(jTextField3.getText());
            float giaban = Float.parseFloat(jTextField5.getText());
            String motasp = jTextArea1.getText();
            String size = jTextField4.getText();
            String ngaysx = doiDate(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
            int soluong = Integer.parseInt(jTextField6.getText());
            int lkh = 0;
            if (masp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã sản phẩm'");
            } else if (tensp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên sản phẩm'");
            } else if (gianhap <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'giá nhập'");
            } else if (giaban <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'giá bán'");
            } else if (motasp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mô tả sản phẩm'");
            } else if (size.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'size sản phẩm'");
            } else if (ngaysx.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày sản xuất sản phẩm'");
            } else if (soluong <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số lượng sản phẩm'");
            } else {
                if (loaisanpham.equals("Áo Thun")) {
                    lkh = 1;
                } else if (loaisanpham.equals("Áo Sơ Mi")) {
                    lkh = 2;
                } else if (loaisanpham.equals("Quần Sort")) {
                    lkh = 3;
                } else if (loaisanpham.equals("Quần Tây")) {
                    lkh = 4;
                } else if (loaisanpham.equals("Quần Jean")) {
                    lkh = 5;
                } else if (loaisanpham.equals("Quần Jogger")) {
                    lkh = 6;
                }
                spdll.UpdateSP(masp, tensp, lkh, gianhap, giaban, motasp, size, ngaysx, soluong);
                LoadDatabaseSanPham();
                jbtn_SuaSP.setText("Sửa");
                jButton4.setEnabled(true);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
            }
        }

    }//GEN-LAST:event_jbtn_SuaSPActionPerformed

    //đổi định dàng date 
    private String doiDate(String nsx) {
        Date s1;
        try {
            SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            s1 = sdf1.parse(nsx);
            return df.format(s1);
        } catch (Exception e) {
        }
        return "";

    }

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        List<SanPham> listSP1 = spdll.GetALLTenSanPham(jComboBox9.getSelectedItem().toString());

        DefaultTableModel model = (DefaultTableModel) jTableSanPham.getModel();
        model.setRowCount(0);

        if (jTextField7.getText().equals("")) {
            for (SanPham o : listSP1) {
                model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(),
                    o.getMaLoaiSanPham(), o.getGiaNhap(), o.getGiaBan(), o.getMoTaSanPham(), o.getSize(), o.getNgaySanXuat(), o.getSoLuong()});
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã Sản Phẩm");
                jTextField1.requestFocus();
            } else if (spdll.deleteSP(jTextField1.getText()) > 0) {
                spdll.deleteSP(jTextField1.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseSanPham();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void resetForm() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        jTextArea1.setText("");
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");

    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jButton2.getText().equals("Thêm")) {
            resetForm();
            jbtn_SuaSP.setEnabled(false);
            jButton4.setEnabled(false);
            jButton1.setEnabled(true);
            jButton2.setText("LƯU");
        } else if (jButton2.getText().equals("LƯU")) {
            String masp = jTextField1.getText();
            String tensp = jTextField2.getText();
            String loaisanpham = jComboBox9.getSelectedItem().toString();
            float gianhap = Float.parseFloat(jTextField3.getText());
            float giaban = Float.parseFloat(jTextField5.getText());
            String motasp = jTextArea1.getText();
            String size = jTextField4.getText();
            String ngaysx = doiDate(((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText());
            int soluong = Integer.parseInt(jTextField6.getText());
            int lkh = 0;
            if (masp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã sản phẩm'");
            } else if (tensp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên sản phẩm'");
            } else if (gianhap <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'giá nhập'");
            } else if (giaban <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'giá bán'");
            } else if (motasp.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mô tả sản phẩm'");
            } else if (size.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'size sản phẩm'");
            } else if (ngaysx.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày sản xuất sản phẩm'");
            } else if (soluong <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số lượng sản phẩm'");
            } else {
                if (loaisanpham.equals("Áo Thun")) {
                    lkh = 1;
                } else if (loaisanpham.equals("Áo Sơ Mi")) {
                    lkh = 2;
                } else if (loaisanpham.equals("Quần Sort")) {
                    lkh = 3;
                } else if (loaisanpham.equals("Quần Tây")) {
                    lkh = 4;
                } else if (loaisanpham.equals("Quần Jean")) {
                    lkh = 5;
                } else if (loaisanpham.equals("Quần Jogger")) {
                    lkh = 6;
                }

                spdll.AddSP(masp, tensp, lkh, gianhap, giaban, motasp, size, ngaysx, soluong);
                LoadDatabaseSanPham();
                jButton2.setText("Thêm");
                jbtn_SuaSP.setEnabled(true);
                jButton4.setEnabled(true);
                jButton1.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jbtn_SuaSP.setEnabled(true);
        jButton4.setEnabled(true);
        jButton2.setEnabled(true);
        jButton2.setText("Thêm");
        jbtn_SuaSP.setText("Sửa");
        jButton4.setText("Xóa");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jButton7.getText().equals("Sửa")) {
            jButton8.setEnabled(false);
            jButton5.setEnabled(true);
            jButton6.setEnabled(false);
            jButton7.setText("LƯU");
        } else if (jButton7.getText().equals("LƯU")) {

            int makh = Integer.parseInt(jTextField8.getText());
            String tenkh = jTextField9.getText();
            String diachi = jTextField10.getText();
            String sdt = jTextField11.getText();
            String gioitinh = jComboBox1.getSelectedItem().toString();
            String loaikhachhang = jComboBox8.getSelectedItem().toString();

            int lkh = 0;
            if (makh < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã Khách Hàng'");
            } else if (tenkh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên Khách hàng'");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền'Địa chỉ");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'SĐT'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng Chọn'Giới tính'");
            } else {
                if (loaikhachhang.equals("vip")) {
                    lkh = 1;
                } else if (loaikhachhang.equals("thường")) {
                    lkh = 2;
                } else if (loaikhachhang.equals("sinh viên")) {
                    lkh = 3;
                }
                khdll.UpdateKH(makh, tenkh, diachi, gioitinh, sdt, lkh);

                LoadDatabaseKhachHang();
                jButton7.setText("Sửa");
                jButton8.setEnabled(true);
                jButton5.setEnabled(false);
                jButton6.setEnabled(true);
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton8.setEnabled(true);
        jButton7.setEnabled(true);
        jButton6.setEnabled(true);
        jButton6.setText("Thêm");
        jButton7.setText("Sửa");
        jButton8.setText("Xóa");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            int makh = Integer.parseInt(jTextField8.getText());
            if (jTextField8.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã Khách Hàng");
                jTextField8.requestFocus();
            } else if (khdll.deleteKH(makh) > 0) {
                khdll.deleteKH(makh);
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseKhachHang();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void xoatextKhachHang() {
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jButton6.getText().equals("Thêm")) {
            xoatextKhachHang();
            jButton8.setEnabled(false);
            jButton5.setEnabled(true);
            jButton7.setEnabled(false);
            jButton6.setText("LƯU");
        } else if (jButton6.getText().equals("LƯU")) {
            String tenkh = jTextField9.getText();
            String diachi = jTextField10.getText();
            String sdt = jTextField11.getText();
            String gioitinh = jComboBox1.getSelectedItem().toString();
            String loaikhachhang = jComboBox8.getSelectedItem().toString();

            int lkh = 0;

            if (tenkh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên Khách hàng'");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền'Địa chỉ");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'SĐT'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng Chọn'Giới tính'");
            } else {

                if (loaikhachhang.equals("vip")) {
                    lkh = 1;
                } else if (loaikhachhang.equals("thường")) {
                    lkh = 2;
                } else if (loaikhachhang.equals("sinh viên")) {
                    lkh = 3;
                }
                khdll.AddKH(tenkh, diachi, gioitinh, sdt, lkh);

                LoadDatabaseKhachHang();
                jButton6.setText("Thêm");
                jButton8.setEnabled(true);
                jButton5.setEnabled(false);
                jButton7.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (jButton11.getText().equals("Sửa")) {
            jButton12.setEnabled(false);
            jButton9.setEnabled(true);
            jButton10.setEnabled(false);
            jButton11.setText("LƯU");
        } else if (jButton11.getText().equals("LƯU")) {

            String manv = txt_NV_MNV.getText();
            String tennv = txt_NV_TNV.getText();
            String gioitinh = jComboBox2.getSelectedItem().toString();
            String ngaysinh = doiDate(((JTextField) jDateChooser6.getDateEditor().getUiComponent()).getText());
            String diachi = txt_NV_DC.getText();
            String sdt = txt_NV_SDT.getText();
            String tendn = txt_NV_TDN.getText();
            String matkhau = txt_NV_MK.getText();
            String chucvu = jComboBox3.getSelectedItem().toString();

            if (manv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã Nhân viên'");
            } else if (tennv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên Nhân viên'");
            } else if (ngaysinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Ngày Sinh");
            } else if (tendn.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền tên đăng nhập");
            } else if (matkhau.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền mật khẩu");
            } else if (chucvu.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Chức Vụ");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền'Địa chỉ");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'SĐT'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng Chọn'Giới tính'");
            } else {
                nvdll.UpdateNV(manv, tennv, gioitinh, ngaysinh, diachi, sdt, tendn, matkhau, chucvu);
                LoadDatabaseNhanVien();
                jButton12.setEnabled(true);
                jButton9.setEnabled(false);
                jButton10.setEnabled(true);
                jButton11.setText("Sửa");
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            if (txt_NV_MNV.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã Nhân viên");
                txt_NV_MNV.requestFocus();
            } else if (nvdll.deleteNV(txt_NV_MNV.getText()) > 0) {
                nvdll.deleteNV(txt_NV_MNV.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseNhanVien();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void xoatextnhanvien() {
        txt_NV_MNV.setText("");
        txt_NV_TNV.setText("");
        ((JTextField) jDateChooser6.getDateEditor().getUiComponent()).setText("");
        txt_NV_DC.setText("");
        txt_NV_SDT.setText("");
        txt_NV_TDN.setText("");
        txt_NV_MK.setText("");
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jButton10.getText().equals("Thêm")) {
            xoatextnhanvien();
            jButton12.setEnabled(false);
            jButton9.setEnabled(true);
            jButton11.setEnabled(false);
            jButton10.setText("LƯU");
        } else if (jButton10.getText().equals("LƯU")) {

            String manv = txt_NV_MNV.getText();
            String tennv = txt_NV_TNV.getText();
            String gioitinh = jComboBox2.getSelectedItem().toString();
            String ngaysinh = doiDate(((JTextField) jDateChooser6.getDateEditor().getUiComponent()).getText());
            String diachi = txt_NV_DC.getText();
            String sdt = txt_NV_SDT.getText();
            String tendn = txt_NV_TDN.getText();
            String matkhau = txt_NV_MK.getText();
            String chucvu = jComboBox3.getSelectedItem().toString();

            if (manv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã Nhân viên'");
            } else if (tennv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên Nhân viên'");
            } else if (ngaysinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Ngày Sinh");
            } else if (tendn.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền tên đăng nhập");
            } else if (matkhau.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền mật khẩu");
            } else if (chucvu.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn Chức Vụ");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền'Địa chỉ");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'SĐT'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng Chọn'Giới tính'");
            } else {
                nvdll.Them(manv, tennv, gioitinh, ngaysinh, diachi, sdt, tendn, matkhau, chucvu);
                LoadDatabaseNhanVien();
                jButton12.setEnabled(true);
                jButton9.setEnabled(false);
                jButton11.setEnabled(true);
                jButton10.setText("Thêm");
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton10.setText("Thêm");
        jButton11.setText("Sửa");
        jButton12.setText("Xóa");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (jButton15.getText().equals("Sửa")) {
            jButton14.setEnabled(false);
            jButton13.setEnabled(true);
            jButton16.setEnabled(false);
            jButton15.setText("LƯU");
        } else if (jButton15.getText().equals("LƯU")) {
            String sohd = jTextField18.getText();
            String ngaylap = doiDate(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());
            String manv = jComboBox5.getSelectedItem().toString();
            String nhanvien = jComboBox6.getSelectedItem().toString();
            String makhach = jTextField21.getText();

            if (sohd.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số hóa đơn'");
            } else if (ngaylap.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày lập'");
            } else if (manv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã nhân viên'");
            } else if (nhanvien.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'nhân viên'");
            } else if (makhach.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã khách hàng'");
            } else {
                hddll.UpdateHD(sohd, ngaylap, nhanvien, makhach, manv);
                LoadDatabaseHoaDon();
                jButton14.setEnabled(true);
                jButton13.setEnabled(false);
                jButton16.setEnabled(true);
                jButton15.setText("Sửa");
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            if (jTextField18.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã hóa đơn");
                jTextField18.requestFocus();
            } else if (hddll.deleteHD(jTextField18.getText()) > 0) {
                hddll.deleteHD(jTextField18.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseHoaDon();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void xoatextthemhoadon() {
        jTextField18.setText("");
        ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).setText("");
        jTextField21.setText("");
    }
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (jButton14.getText().equals("Thêm")) {
            xoatextthemhoadon();
            List<NhanVien> listNV1 = nvdll.getMnsTnv(sv.getTenDangNhap());
            for (NhanVien o : listNV1) {
                jComboBox5.setSelectedItem(o.getMaNhanVien());
            }
            for (NhanVien o : listNV1) {
                jComboBox6.setSelectedItem(o.getTenNhanVien());
            }
            jButton15.setEnabled(false);
            jButton13.setEnabled(true);
            jButton16.setEnabled(false);
            jButton14.setText("LƯU");
        } else if (jButton14.getText().equals("LƯU")) {
            String sohd = jTextField18.getText();
            String ngaylap = doiDate(((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText());

            String manv = jComboBox5.getSelectedItem().toString();
            String nhanvien = jComboBox6.getSelectedItem().toString();
            String makhach = jTextField21.getText();

            if (sohd.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số hóa đơn'");
            } else if (ngaylap.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày lập'");
            } else if (manv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã nhân viên'");
            } else if (nhanvien.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'nhân viên'");
            } else if (makhach.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã khách hàng'");
            } else {
                hddll.AddHD(sohd, ngaylap, nhanvien, makhach, manv);
                LoadDatabaseHoaDon();
                jButton15.setEnabled(true);
                jButton13.setEnabled(false);
                jButton16.setEnabled(true);
                jButton14.setText("Thêm");
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton14.setText("Thêm");
        jButton15.setText("Sửa");
        jButton16.setText("Xóa");
    }//GEN-LAST:event_jButton13ActionPerformed

    private String doiDate1(String nsx) {
        Date s1;
        try {
            SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-dd-MM");
            s1 = sdf1.parse(nsx);
            return df.format(s1);
        } catch (Exception e) {
        }
        return "";

    }

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        if (!check && jComboBox7.getItemCount() > 0) {
            String s = jComboBox7.getSelectedItem().toString();
            ((JTextField) jDateChooser3.getDateEditor().getUiComponent()).setText(doiDate1(hddll.getNgayLap(jComboBox7.getSelectedItem().toString())));
            jTextField25.setText(hddll.getNhanVienLap(jComboBox7.getSelectedItem().toString()));
            jTextField26.setText(hddll.getMaNhanVien(jComboBox7.getSelectedItem().toString()));
            jTextField27.setText(hddll.getMaKhachHang(jComboBox7.getSelectedItem().toString()));
            jComboBox7.removeAllItems();
            LoadDatabaseChiTietHoaDon(s);
            jComboBox7.setSelectedItem(s);
            check = false;
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if (jButton19.getText().equals("Sửa")) {
            jButton18.setEnabled(false);
            jButton17.setEnabled(true);
            jButton20.setEnabled(false);
            jButton19.setText("LƯU");
        } else if (jButton19.getText().equals("LƯU")) {

            String sohd = jComboBox7.getSelectedItem().toString();
            String masanpham = jTextField22.getText();
            String tensanpham = jComboBox4.getSelectedItem().toString();
            float dongia = Float.parseFloat(jTextField23.getText());
            int soluong = Integer.parseInt(jTextField24.getText());
            float tongtien = dongia * (float) soluong;

            if (sohd.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số hóa đơn'");
            } else if (masanpham.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày lập'");
            } else if (tensanpham.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã nhân viên'");
            } else if (dongia < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'nhân viên'");
            } else if (soluong < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã khách hàng'");
            } else {
                cthddll.UpdateCTHD(sohd, masanpham, tensanpham, dongia, soluong, tongtien);
                SetComboBox(sohd);
                jButton18.setEnabled(true);
                jButton17.setEnabled(false);
                jButton20.setEnabled(true);
                jButton19.setText("Sửa");
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            if (jTextField22.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã sản phẩm");
                jTextField22.requestFocus();
            } else if (cthddll.deleteCTHD(jComboBox7.getSelectedItem().toString(), jTextField22.getText()) > 0) {
                cthddll.deleteCTHD(jComboBox7.getSelectedItem().toString(), jTextField22.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }
            String sohd = jComboBox7.getSelectedItem().toString();
            SetComboBox(sohd);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (jButton18.getText().equals("Thêm")) {
            jButton19.setEnabled(false);
            jButton17.setEnabled(true);
            jButton20.setEnabled(false);
            jButton18.setText("LƯU");
        } else if (jButton18.getText().equals("LƯU")) {

            String sohd = jComboBox7.getSelectedItem().toString();
            String masanpham = jTextField22.getText();
            String tensanpham = jComboBox4.getSelectedItem().toString();
            float dongia = Float.parseFloat(jTextField23.getText());
            int soluong = Integer.parseInt(jTextField24.getText());
            float tongtien = dongia * (float) soluong;

            if (sohd.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số hóa đơn'");
            } else if (masanpham.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày lập'");
            } else if (tensanpham.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã nhân viên'");
            } else if (dongia < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'đơn giá'");
            } else if (soluong < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số lượng'");
            } else {
                cthddll.AddCTHD(sohd, masanpham, tensanpham, dongia, soluong, tongtien);
                SetComboBox(sohd);
                jButton19.setEnabled(false);
                jButton17.setEnabled(true);
                jButton20.setEnabled(false);
                jButton18.setText("Thêm");
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void SetComboBox(String sohd) {
        jComboBox7.removeAllItems();
        LoadDatabaseChiTietHoaDon(sohd);
        jComboBox7.setSelectedItem(sohd);
    }

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        jTextField22.setText(spdll.getMaSanPham(jComboBox4.getSelectedItem().toString()));
        jTextField23.setText(spdll.getGiaSP(jComboBox4.getSelectedItem().toString()));

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton18.setText("Thêm");
        jButton19.setText("Sửa");
        jButton20.setText("Xóa");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void btn_Thoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Thoat1ActionPerformed
        close();
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        iClose = true;
    }//GEN-LAST:event_btn_Thoat1ActionPerformed

    private void jComboBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox7MouseClicked

    }//GEN-LAST:event_jComboBox7MouseClicked

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased

        List<SanPham> listSP = spdll.GetALLTenSanPham(jTextField7.getText());
        List<SanPham> listMSP = spdll.GetALLMaSanPham(jTextField7.getText());

        DefaultTableModel model = (DefaultTableModel) jTableSanPham.getModel();
        model.setRowCount(0);

        for (SanPham o : listSP) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(),
                o.getMaLoaiSanPham(), o.getGiaNhap(), o.getGiaBan(), o.getMoTaSanPham(), o.getSize(), o.getNgaySanXuat(), o.getSoLuong()});
        }

        for (SanPham o : listMSP) {
            model.addRow(new Object[]{o.getMaSanPham(), o.getTenSanPham(),
                o.getMaLoaiSanPham(), o.getGiaNhap(), o.getGiaBan(), o.getMoTaSanPham(), o.getSize(), o.getNgaySanXuat(), o.getSoLuong()});
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyReleased
        if (jTextField28.getText().equals("")) {
            LoadDatabaseKhachHang();
        } else {
            List<KhachHang> listKH = khdll.GetALLTenKhachHang(jTextField28.getText());
            List<KhachHang> listSDT = khdll.GetALLSDT(jTextField28.getText());
            DefaultTableModel model = (DefaultTableModel) jTableKhachHang.getModel();
            model.setRowCount(0);
            for (KhachHang o : listKH) {
                model.addRow(new Object[]{o.getMaKH(), o.getTenKhach(),
                    o.getDiaChi(), o.getGioiTinh(), o.getSdt()});
            }
            for (KhachHang o : listSDT) {
                model.addRow(new Object[]{o.getMaKH(), o.getTenKhach(),
                    o.getDiaChi(), o.getGioiTinh(), o.getSdt()});
            }
        }
    }//GEN-LAST:event_jTextField28KeyReleased

    private void LoadDatabaseThongKe() {
        List<ThongKe> listtk = tkdll.getALLThongke();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        float tong = 0;
        for (ThongKe o : listtk) {
            tong += o.getTongTien();
            model.addRow(new Object[]{o.getNgayLap(), o.getTongSoSanPham(), o.getTongTien(),
                o.getMaNhanVien(), o.getNhanvienLapHoaDon()});
        }

        List<NhanVien> listNV = nvdll.getALLNhanvien();
        for (NhanVien o : listNV) {
            jComboBox10.addItem(o.getTenNhanVien());
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        jTextField12.setText(decimalFormat.format(tong));
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Date1 = ((JTextField) jDateChooser4.getDateEditor().getUiComponent()).getText();
        String Date2 = ((JTextField) jDateChooser5.getDateEditor().getUiComponent()).getText();
        Date date1, date2;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date1 = dateFormat.parse(Date1);
            date2 = dateFormat.parse(Date2);
            long diff = date2.getTime() - date1.getTime();

            if (diff >= 0) {

                List<ThongKe> listtk = tkdll.getALLThongkeByDate(doiDate(Date1), doiDate(Date2));
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                float tong = 0;
                for (ThongKe o : listtk) {
                    tong += o.getTongTien();
                    model.addRow(new Object[]{o.getNgayLap(), o.getTongSoSanPham(), o.getTongTien(),
                        o.getMaNhanVien(), o.getNhanvienLapHoaDon()});
                }
                DecimalFormat decimalFormat = new DecimalFormat("#,###");
                jTextField12.setText(decimalFormat.format(tong));
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn số từ ngày nhỏ hơn đến ngày");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        List<ThongKe> listtk = tkdll.getALLThongkeByName(jComboBox10.getSelectedItem().toString());
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        float tong = 0;
        for (ThongKe o : listtk) {
            tong += o.getTongTien();
            model.addRow(new Object[]{o.getNgayLap(), o.getSoHD(), o.getTongSoHD(), o.getTongTien(), o.getMaNhanVien(),
                o.getNhanvienLapHoaDon(), o.getSanPham(), o.getDongia(), o.getSoluong()});
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        jTextField13.setText(decimalFormat.format(tong));
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        List<ChiTietHoaDon> arr = cthddll.GetALLChiTietHoaDon(jComboBox7.getSelectedItem().toString());
        
        
        
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("ChiTietHoaDon");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(1);
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("CHI TIẾT HÓA ĐƠN");
            
            row = sheet.createRow(3);
                     
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(jTextField26.getText());
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(jTextField25.getText());
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(khdll.getTenKhachHang(jTextField27.getText()));
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(((JTextField) jDateChooser3.getDateEditor().getUiComponent()).getText());
            
            row = sheet.createRow(5);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã Sản Phẩm");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Tên Sản Phẩm");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Đơn Giá");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Số Lượng");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Tổng Tiền");
            
            float tong = 0;
            
            for(int i = 0; i < arr.size(); i++){
                row = sheet.createRow(6 + i);
                tong += arr.get(i).getTongTien();
                
                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(arr.get(i).getMaSanPham());
                
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(arr.get(i).getSanPham());
                
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(arr.get(i).getDonGia());
                
                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(String.valueOf(arr.get(i).getSoLuong()));
                
                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(String.valueOf(arr.get(i).getTongTien()));
              
            }
            
            row = sheet.createRow( 7 + arr.size());
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Thành Tiền ");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(String.valueOf(tong));
            
            
            
            File f = new File(".//File//dsChiTietHoaDon.xlsx");
            
            try {
                FileOutputStream fis = new FileOutputStream(f);
                wordkbook.write(fis);
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
           
            JOptionPane.showMessageDialog(this, "in thành công");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "loi file");
        }
        
    }//GEN-LAST:event_btn_printActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_HoaDon;
    private javax.swing.JButton btn_ChiTietHoaDon;
    private javax.swing.JButton btn_KhachHang;
    public javax.swing.JButton btn_NhanVien;
    private javax.swing.JButton btn_SanPham;
    private javax.swing.JButton btn_Thoat1;
    public javax.swing.JButton btn_ThongKe;
    private javax.swing.JButton btn_TrangChu;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<Object> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<Object> jComboBox4;
    private javax.swing.JComboBox<Object> jComboBox5;
    private javax.swing.JComboBox<Object> jComboBox6;
    private javax.swing.JComboBox<Object> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCTHoaDon;
    private javax.swing.JTable jTableHD;
    private javax.swing.JTable jTableKhachHang;
    private javax.swing.JTable jTableNhanVien;
    private javax.swing.JTable jTableSanPham;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JButton jbtn_SuaSP;
    private javax.swing.JTextField txt_NV_DC;
    private javax.swing.JTextField txt_NV_MK;
    private javax.swing.JTextField txt_NV_MNV;
    private javax.swing.JTextField txt_NV_SDT;
    private javax.swing.JTextField txt_NV_TDN;
    private javax.swing.JTextField txt_NV_TNV;
    // End of variables declaration//GEN-END:variables
}
