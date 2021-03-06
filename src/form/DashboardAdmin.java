/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import database.KoneksiDB;
import static form.Loading.i;
import form.admin.Dashboard;
import form.admin.Guru;
import form.admin.Info;
import form.admin.Jadwal;
import form.admin.Kelas;
import form.admin.Mapel;
import form.admin.Siswa;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author resar
 */
public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    Color DefaultColor, ClickedColor, LogoutColor;
    Utility Utility = new Utility();
    public DashboardAdmin() throws InterruptedException {
        setLocationRelativeTo(null);
        initComponents();
        DefaultColor = new Color(128,208,255);
        ClickedColor=new Color(255,223,93);
        LogoutColor = new Color(244,67,54);
//        Default Color
        jpProfile.setBackground(ClickedColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        
        Dashboard Dashboard = new Dashboard();
        DesktopPanel.removeAll();
        DesktopPanel.add(Dashboard).setVisible(true);
        ShowPesan();
    }
    
    public void ShowPesan() throws InterruptedException{
        String[] pesan = Utility.ShowInfo();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(i=0; i<pesan.length; i++){
                    try{
                        lblPesanInfo.setText(pesan[i]);
                        Thread.sleep(5000);
                    } 
                    catch(InterruptedException ex){
                        
                    }
                }
                try {
                    ShowPesan();
                } catch (InterruptedException ex) {
                    Logger.getLogger(DashboardAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jpInfo = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jpJadwal = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jpMapel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jpKelas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpSiswa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpGuru = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpProfile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpLogout = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jpJudul = new javax.swing.JPanel();
        NamaMenu = new javax.swing.JLabel();
        Breadcrumb = new javax.swing.JLabel();
        DesktopPanel = new javax.swing.JPanel();
        jpInfoPesan = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblPesanInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(null);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(2, 162, 255));
        sidePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInfo.setBackground(new java.awt.Color(128, 208, 255));
        jpInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpInfoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpInfoMousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("INFORMASI");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N

        javax.swing.GroupLayout jpInfoLayout = new javax.swing.GroupLayout(jpInfo);
        jpInfo.setLayout(jpInfoLayout);
        jpInfoLayout.setHorizontalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpInfoLayout.setVerticalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 431, 270, -1));

        jpJadwal.setBackground(new java.awt.Color(128, 208, 255));
        jpJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpJadwalMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpJadwalMousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("JADWAL");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jadwal.png"))); // NOI18N

        javax.swing.GroupLayout jpJadwalLayout = new javax.swing.GroupLayout(jpJadwal);
        jpJadwal.setLayout(jpJadwalLayout);
        jpJadwalLayout.setHorizontalGroup(
            jpJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpJadwalLayout.setVerticalGroup(
            jpJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpJadwalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 389, 270, -1));

        jpMapel.setBackground(new java.awt.Color(128, 208, 255));
        jpMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpMapelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMapelMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MAPEL");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mapel.png"))); // NOI18N

        javax.swing.GroupLayout jpMapelLayout = new javax.swing.GroupLayout(jpMapel);
        jpMapel.setLayout(jpMapelLayout);
        jpMapelLayout.setHorizontalGroup(
            jpMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMapelLayout.setVerticalGroup(
            jpMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMapelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpMapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 50));

        jpKelas.setBackground(new java.awt.Color(128, 208, 255));
        jpKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpKelasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpKelasMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("KELAS");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kelas.png"))); // NOI18N

        javax.swing.GroupLayout jpKelasLayout = new javax.swing.GroupLayout(jpKelas);
        jpKelas.setLayout(jpKelasLayout);
        jpKelasLayout.setHorizontalGroup(
            jpKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpKelasLayout.setVerticalGroup(
            jpKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpKelasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpKelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 50));

        jpSiswa.setBackground(new java.awt.Color(128, 208, 255));
        jpSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpSiswaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpSiswaMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISWA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/siswa.png"))); // NOI18N

        javax.swing.GroupLayout jpSiswaLayout = new javax.swing.GroupLayout(jpSiswa);
        jpSiswa.setLayout(jpSiswaLayout);
        jpSiswaLayout.setHorizontalGroup(
            jpSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpSiswaLayout.setVerticalGroup(
            jpSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSiswaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        sidePanel.add(jpSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 50));

        jpGuru.setBackground(new java.awt.Color(128, 208, 255));
        jpGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpGuruMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpGuruMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GURU");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guru.png"))); // NOI18N

        javax.swing.GroupLayout jpGuruLayout = new javax.swing.GroupLayout(jpGuru);
        jpGuru.setLayout(jpGuruLayout);
        jpGuruLayout.setHorizontalGroup(
            jpGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGuruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpGuruLayout.setVerticalGroup(
            jpGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGuruLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpGuruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 50));

        jpProfile.setBackground(new java.awt.Color(128, 208, 255));
        jpProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpProfileMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DASHBOARD");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N

        javax.swing.GroupLayout jpProfileLayout = new javax.swing.GroupLayout(jpProfile);
        jpProfile.setLayout(jpProfileLayout);
        jpProfileLayout.setHorizontalGroup(
            jpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpProfileLayout.setVerticalGroup(
            jpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 50));

        jpLogout.setBackground(new java.awt.Color(128, 208, 255));
        jpLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpLogoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpLogoutMousePressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("LOGOUT");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N

        javax.swing.GroupLayout jpLogoutLayout = new javax.swing.GroupLayout(jpLogout);
        jpLogout.setLayout(jpLogoutLayout);
        jpLogoutLayout.setHorizontalGroup(
            jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpLogoutLayout.setVerticalGroup(
            jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePanel.add(jpLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 270, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-80.png"))); // NOI18N
        jLabel9.setLabelFor(jpKelas);
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 90));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADMINISTRATOR");
        sidePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        bg.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        jpJudul.setBackground(new java.awt.Color(31, 185, 242));

        NamaMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NamaMenu.setForeground(new java.awt.Color(255, 255, 255));
        NamaMenu.setText("HALAMAN DASHBOARD______________________________________");

        Breadcrumb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Breadcrumb.setForeground(new java.awt.Color(255, 255, 255));
        Breadcrumb.setText("ADMINISTRATOR/PROFLE");

        javax.swing.GroupLayout jpJudulLayout = new javax.swing.GroupLayout(jpJudul);
        jpJudul.setLayout(jpJudulLayout);
        jpJudulLayout.setHorizontalGroup(
            jpJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpJudulLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NamaMenu)
                    .addComponent(Breadcrumb))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpJudulLayout.setVerticalGroup(
            jpJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpJudulLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Breadcrumb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(NamaMenu)
                .addContainerGap())
        );

        bg.add(jpJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 60, 741, -1));

        DesktopPanel.setLayout(new javax.swing.BoxLayout(DesktopPanel, javax.swing.BoxLayout.LINE_AXIS));
        bg.add(DesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 740, 420));

        jpInfoPesan.setBackground(new java.awt.Color(41, 166, 75));
        jpInfoPesan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("INFO:");
        jpInfoPesan.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 22, -1, -1));

        lblPesanInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPesanInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblPesanInfo.setAlignmentY(2.0F);
        jpInfoPesan.add(lblPesanInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 25, 661, -1));

        bg.add(jpInfoPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 0, 740, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProfileMousePressed
        jpProfile.setBackground(ClickedColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN DASHBOARD______________________________________");
        Breadcrumb.setText("ADMINISTRATOR/DASHBOARD");
    }//GEN-LAST:event_jpProfileMousePressed

    private void jpGuruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuruMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(ClickedColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN GURU___________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/GURU");
    }//GEN-LAST:event_jpGuruMousePressed

    private void jpSiswaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSiswaMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(ClickedColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN SISWA__________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/SISWA");
    }//GEN-LAST:event_jpSiswaMousePressed

    private void jpKelasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpKelasMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(ClickedColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN KELAS__________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/KELAS");
    }//GEN-LAST:event_jpKelasMousePressed

    private void jpMapelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMapelMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(ClickedColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN MAPEL__________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/MAPEL");
    }//GEN-LAST:event_jpMapelMousePressed

    private void jpJadwalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpJadwalMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(ClickedColor);
        jpInfo.setBackground(DefaultColor);
        NamaMenu.setText("HALAMAN JADWAL_________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/JADWAL");
    }//GEN-LAST:event_jpJadwalMousePressed

    private void jpLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLogoutMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(DefaultColor);
        jpLogout.setBackground(LogoutColor);
    }//GEN-LAST:event_jpLogoutMousePressed

    private void jpProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProfileMouseClicked
        Dashboard Dashboard = new Dashboard();
        DesktopPanel.removeAll();
        DesktopPanel.add(Dashboard).setVisible(true);
    }//GEN-LAST:event_jpProfileMouseClicked

    private void jpGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpGuruMouseClicked
        Guru Guru = new Guru();
        DesktopPanel.removeAll();
        DesktopPanel.add(Guru).setVisible(true);
    }//GEN-LAST:event_jpGuruMouseClicked

    private void jpSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSiswaMouseClicked
        Siswa Siswa = new Siswa();
        DesktopPanel.removeAll();
        DesktopPanel.add(Siswa).setVisible(true);
    }//GEN-LAST:event_jpSiswaMouseClicked

    private void jpKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpKelasMouseClicked
        Kelas Kelas = new Kelas();
        DesktopPanel.removeAll();
        DesktopPanel.add(Kelas).setVisible(true);
    }//GEN-LAST:event_jpKelasMouseClicked

    private void jpMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMapelMouseClicked
        Mapel Mapel = new Mapel();
        DesktopPanel.removeAll();
        DesktopPanel.add(Mapel).setVisible(true);
    }//GEN-LAST:event_jpMapelMouseClicked

    private void jpJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpJadwalMouseClicked
        Jadwal Jadwal = new Jadwal();
        DesktopPanel.removeAll();
        DesktopPanel.add(Jadwal).setVisible(true);
    }//GEN-LAST:event_jpJadwalMouseClicked

    private void jpLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLogoutMouseClicked
        // TODO add your handling code here:
            int conf;
            conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?",
                    "Warning",JOptionPane.WARNING_MESSAGE);
            if(conf == 0){
                this.dispose();
                Login Login = new Login();
                Login.setVisible(true);
            } else{
                jpLogout.setBackground(DefaultColor);
            }
    }//GEN-LAST:event_jpLogoutMouseClicked

    private void jpInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInfoMouseClicked
        Info Info = new Info();
        DesktopPanel.removeAll();
        DesktopPanel.add(Info).setVisible(true);
    }//GEN-LAST:event_jpInfoMouseClicked

    private void jpInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpInfoMousePressed
        jpProfile.setBackground(DefaultColor);
        jpGuru.setBackground(DefaultColor);
        jpSiswa.setBackground(DefaultColor);
        jpKelas.setBackground(DefaultColor);
        jpMapel.setBackground(DefaultColor);
        jpLogout.setBackground(DefaultColor);
        jpJadwal.setBackground(DefaultColor);
        jpInfo.setBackground(ClickedColor);
        NamaMenu.setText("HALAMAN INFO___________________________________________");
        Breadcrumb.setText("ADMINISTRATOR/INFO");
    }//GEN-LAST:event_jpInfoMousePressed

    /**
     * @param args the command line arguments
     */                                                                                                                                                                                                         
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Breadcrumb;
    private javax.swing.JPanel DesktopPanel;
    private javax.swing.JLabel NamaMenu;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpGuru;
    private javax.swing.JPanel jpInfo;
    private javax.swing.JPanel jpInfoPesan;
    private javax.swing.JPanel jpJadwal;
    private javax.swing.JPanel jpJudul;
    private javax.swing.JPanel jpKelas;
    private javax.swing.JPanel jpLogout;
    private javax.swing.JPanel jpMapel;
    private javax.swing.JPanel jpProfile;
    private javax.swing.JPanel jpSiswa;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPesanInfo;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
