/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import database.KoneksiDB;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author resar
 */
public class UbahGambar extends javax.swing.JFrame {

    /**
     * Creates new form UbahGambar
     */
    String filename, namatabel, id;
    int role;
    KoneksiDB k = new KoneksiDB();
    Connection con = k.connection;
    String nameFile, tampilan, tanggal, extension;
    File destinationFile=null, sourceFile=null;
    public UbahGambar(String id, int role) {
        this.id = id;
        this.role = role;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-upload.png"))); // NOI18N
        jButton1.setText("UPLOAD GAMBAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 162, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("UBAH GAMBAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Extension Ynag Dizinkan
        String[] extensions = {"jpg", "jpeg", "png"};
        List<String> list = Arrays.asList(extensions);
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if(f != null){
            filename = f.getAbsolutePath();
            extension = filename.substring(filename.lastIndexOf('.') + 1);
            if(list.contains(extension)){
                ImageIcon icon = new ImageIcon(filename);
                Image image = icon.getImage().getScaledInstance(320, 200, Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(image);
                lblImg.setIcon(ic);
                        String newpath = "src/img/upload/";
                File directory = new File(newpath);
                if(!directory.exists()){
                    directory.mkdirs();
                }
                sourceFile = null;
                destinationFile = null;
                sourceFile = new File(filename);
                nameFile = filename.substring(filename.lastIndexOf('\\') + 1);
                Date tanggal_update = new Date();
                tampilan = "yyyyMMddhhmmss";
                SimpleDateFormat fm = new SimpleDateFormat(tampilan);
                tanggal = String.valueOf(fm.format(tanggal_update));
                destinationFile = new File(newpath+nameFile+"-"+ tanggal + "." + extension);
            } else{
                JOptionPane.showMessageDialog(null, "Extension Gambar Tidak Sesuai!",  "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(!lblImg.getIcon().equals("")){
            String query="";
            String fileNameUpload = nameFile+"-"+ tanggal + "." + extension;
            if(role == 1) {
                query = "UPDATE dataguru SET gambar = '"+fileNameUpload+"' WHERE nip='"+id+"'";
            } else{
                query = "UPDATE datasiswa SET gambar = '"+fileNameUpload+"' WHERE nis='"+id+"'";
            }
            Statement st;
            ResultSet rs;
            try{
                st = con.createStatement();
                if(st.executeUpdate(query)>0){
                    Files.copy(sourceFile.toPath(), destinationFile.toPath());
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Gambar Berhasil Dirubah");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Gambar Gagal Dirubah");
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Gambar Gagal Dirubah",  "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Gambar Belum Diupload",  "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    // End of variables declaration//GEN-END:variables
}
