/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form.guru;

import database.KoneksiDB;
import form.admin.*;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author resar
 */
public class Profile extends javax.swing.JInternalFrame {

    /**
     * Creates new form Profile
     */
    KoneksiDB k = new KoneksiDB();
    Connection con = k.connection;
    String nipGuru, gambar, filename;
    public Profile(String nipGuru) {
        this.nipGuru = nipGuru;
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        DataGuru();
        showGambar();
    }
    
    public void showGambar(){
        if(!gambar.isEmpty()){
            filename = System.getProperty("user.dir") + "/src/img/upload/" + gambar;
            File directory = new File(filename);
            if(!directory.exists()){
                filename = System.getProperty("user.dir")  + "/src/img/profile2x.png";
            }
            System.out.println(directory.getAbsolutePath());
        } else{
            filename = System.getProperty("user.dir")  + "/src/img/profile2x.png";
        }
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(270, 165, Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(image);
        lblImg.setIcon(ic);
    
    }
    
    public void DataGuru(){
            Statement st;
            ResultSet rs;

            String query = "SELECT * FROM dataguru AS d INNER JOIN user AS u ON d.nip = u.username WHERE nip ="+nipGuru;
            try {
                st = con.createStatement();
                rs = st.executeQuery(query);
                while(rs.next()){
                    gambar = rs.getString("gambar");
                    tfNIP.setText(rs.getString("nip"));
                    tfNama.setText(rs.getString("nama"));
                    tfTanggalLahir.setText(rs.getString("tanggal_lahir"));
                    if(rs.getInt("status") == 1){
                    tfStatus.setText("Pegawai Tetap");
                    } else if(rs.getInt("status") == 2){
                    tfStatus.setText("Pegawai Tidak Tetap");
                    }

                }            
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfTanggalLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(560, 460));

        tfNIP.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("NIP:");

        tfNama.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAMA:");

        tfStatus.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("STATUS:");

        tfTanggalLahir.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("TANGGAL-LAHIR:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 162, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(tfNIP, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(tfNama)
                    .addComponent(tfStatus)
                    .addComponent(tfTanggalLahir)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField tfNIP;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
