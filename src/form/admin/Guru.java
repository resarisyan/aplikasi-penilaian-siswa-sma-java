/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form.admin;

import database.KoneksiDB;
import form.Utility;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author resar
 */

public class Guru extends javax.swing.JInternalFrame {

    /**
     * Creates new form Profile
     */
    KoneksiDB k = new KoneksiDB();
    Connection con = k.connection;
    String nipGuru = "";
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Guru() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        showGuru(); 
        tblGuru.setAutoCreateRowSorter(true);
    }
    
    public void showGuru(){
        DefaultTableModel model = (DefaultTableModel) tblGuru.getModel();
        
        Statement st;
        ResultSet rs;
        
        String query = "SELECT * FROM dataguru";
        String status = null;
        
//        String s2[] = { "male", "female", "others" };
//        cbJk = new JComboBox(s2);
//        
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            Object[] row = new Object[4];
            int no = 0;
            while(rs.next()){
                if(rs.getInt("status") == 1){
                    status="Tetap";
                } else if(rs.getInt("status") == 2){
                    status="Tidak Tetap";
                }
                //row[0] = ++no;
                row[0] = rs.getInt("nip");
                row[1] = rs.getString("nama");
                row[2] = status;
                model.addRow(row);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void executeSQLQuery(String query, String pesan, int check)
    {
        Statement st;
        ResultSet rs;
        String queryCheck = "call checkNIP('"+ tfNIP.getText() +"')";
        boolean checkNIP = (check == 1) ? false:tfNIP.getText().equals(nipGuru);
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(queryCheck);
            if(check == 1 || check == 2){
                if(!rs.next() || checkNIP){
                    if(st.executeUpdate(query)>0){
                        RefreshPage();
                        JOptionPane.showMessageDialog(null, "Data " + pesan+ " Succesfully");
                    }
                    else{
                        JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "NIP Sudah Tedaftar");
                }
            } else{
                if(st.executeUpdate(query)>0){
                    RefreshPage();
                    JOptionPane.showMessageDialog(null, "Data " + pesan+ " Succesfully");
                } 
                else{
                    JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void RefreshPage(){
        DefaultTableModel model = (DefaultTableModel)tblGuru.getModel();
        model.setRowCount(0);
        showGuru();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGuru = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblNIP = new javax.swing.JLabel();
        tfNIP = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        lblAgama = new javax.swing.JLabel();
        tfAgama = new javax.swing.JTextField();
        tfNoTlp = new javax.swing.JTextField();
        cbJk = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        lblTl = new javax.swing.JLabel();
        lblJl = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblNoTelp = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jdTl = new com.toedter.calendar.JDateChooser();

        setFocusCycleRoot(false);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(730, 480));
        setRequestFocusEnabled(false);

        tblGuru.setAutoCreateRowSorter(true);
        tblGuru.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tblGuru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIP", "NAMA GURU", "STATUS"
            }
        ));
        tblGuru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGuruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGuru);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-making_notes.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete_trash.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblNIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNIP.setText("NIP:");

        lblNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNama.setText("NAMA:");

        lblAgama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAgama.setText("AGAMA:");

        tfNoTlp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNoTlpKeyTyped(evt);
            }
        });

        cbJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tetap", "Tidak Tepat" }));

        lblTl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTl.setText("TANGGAL LAHIR:");

        lblJl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJl.setText("JENIS KELAMIN:");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStatus.setText("STATUS:");

        lblNoTelp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNoTelp.setText("NO TELP:");

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reset.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jdTl.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNIP)
                                .addGap(52, 52, 52)
                                .addComponent(tfNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgama)
                                    .addComponent(lblNama))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJl)
                                    .addComponent(lblStatus))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbJk, 0, 124, Short.MAX_VALUE)
                                    .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdTl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNoTelp)
                                .addGap(18, 18, 18)
                                .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNIP)
                    .addComponent(tfNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTl)
                    .addComponent(jdTl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNoTelp)
                        .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNama)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblJl)
                        .addComponent(cbJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAgama)
                        .addComponent(lblStatus)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)
                        .addComponent(btnReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGuruMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblGuru.getModel();
        int i = tblGuru.getSelectedRow();
        nipGuru = (model.getValueAt(i, 0).toString());
        Statement st;
        ResultSet rs;
        
        String query = "SELECT * FROM dataguru AS d INNER JOIN user AS u ON d.nip = u.username WHERE nip ="+nipGuru;
        String status = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                tfNIP.setText(rs.getString("nip"));
                tfNama.setText(rs.getString("nama"));
                jdTl.setDate((java.util.Date) rs.getObject("tanggal_lahir"));
                if(rs.getInt("jenis_kelamin") == 1){
                    cbJk.setSelectedIndex(0);
                } else if(rs.getInt("jenis_kelamin") == 2){
                    cbJk.setSelectedIndex(1);
                }
                tfAgama.setText(rs.getString("agama"));
                tfNoTlp.setText(rs.getString("no_telp"));

                if(rs.getInt("status") == 1){
                    cbStatus.setSelectedIndex(0);
                } else if(rs.getInt("status") == 2){
                    cbStatus.setSelectedIndex(1);
                }
//                jpPassword.setText(rs.getString("password"));
            }
            
//            rs = st.executeQuery(query2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

//        tfNPM.setText(model.getValueAt(i, 0).toString());
//        tfNama.setText(model.getValueAt(i, 1).toString());
//        cbAngkatan.getModel().setSelectedItem(model.getValueAt(i, 2).toString());

    }//GEN-LAST:event_tblGuruMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(checkField() == 1){
            int jenisKelamin, status;
            Date date = new Date(jdTl.getDate().getTime());
            if(cbJk.getSelectedItem().toString().toLowerCase().equals("pria")){
                jenisKelamin = 1;
            } else{
                jenisKelamin = 2;
            }
            if(cbStatus.getSelectedItem().toString().toLowerCase().equals("tetap")){
                status = 1;
            } else{
                status = 2;
            }
            String queryGuru = "call createGuru('"+tfNIP.getText()+"', '"+Utility.capitalizeWord(tfNama.getText())+"', '"+date+"', '"+jenisKelamin+"', '"+Utility.capitalizeWord(tfAgama.getText())+"', '"+tfNoTlp.getText()+"', '"+status+"', '"+Utility.getMd5(tfNIP.getText())+"')";
            executeSQLQuery(queryGuru, "Inserted", 1);
        } else{
            JOptionPane.showMessageDialog(this, "Isi Semua Field!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(nipGuru.isEmpty()){
            JOptionPane.showMessageDialog(this, "Pilih Data Yang Ingin Di Edit!");
        } else{
            int conf;
                conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Mengedit Data Ini?",
                    "Warning",JOptionPane.WARNING_MESSAGE);
            if(conf == 0){
                int jenisKelamin, status;
                Date date = new Date(jdTl.getDate().getTime());
                if(cbJk.getSelectedItem().toString().toLowerCase().equals("pria")){
                    jenisKelamin = 1;
                } else{
                    jenisKelamin = 2;
                }
                if(cbStatus.getSelectedItem().toString().toLowerCase().equals("tetap")){
                    status = 1;
                } else{
                    status = 2;
                }
                String query = "call editGuru('"+tfNIP.getText()+"','" +Utility.capitalizeWord(tfNama.getText())+"','"+date+"','" +jenisKelamin+"','" +Utility.capitalizeWord(tfAgama.getText())+"','" +tfNoTlp.getText()+"','" +status+"','" +tfNIP.getText()+"','" +nipGuru+"')";
                executeSQLQuery(query, "Updated", 2);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(nipGuru.isEmpty())
         {
             JOptionPane.showMessageDialog(this, "Pilih Data Yang Ingin Di Hapus!");          
         }
         else{
            int conf;
            conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini?",
                    "Warning",JOptionPane.WARNING_MESSAGE);
            if(conf == 0){
                String query = "call deleteGuru('"+ nipGuru +"')";
                executeSQLQuery(query, "Deleted", 3);
            }
         }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tfNIP.setText("");
        tfNama.setText("");
        tfAgama.setText("");
        tfNoTlp.setText("");
        
        jdTl.setDate(null);
        cbStatus.setSelectedIndex(0);
        cbJk.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void tfNoTlpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNoTlpKeyTyped
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                  evt.consume();
        }
    }//GEN-LAST:event_tfNoTlpKeyTyped

    
    public int checkField(){
        if(
                tfNIP.getText().trim().isEmpty() ||
                tfNama.getText().trim().isEmpty() ||
                jdTl.getDateFormatString().trim().isEmpty() ||
                cbJk.getSelectedItem().toString().trim().isEmpty() ||
                cbStatus.getSelectedItem().toString().trim().isEmpty() ||
                tfAgama.getText().trim().isEmpty() ||
                tfNoTlp.getText().trim().isEmpty() 
                ) {
            return 0;
        } else{
            return 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbJk;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdTl;
    private javax.swing.JLabel lblAgama;
    private javax.swing.JLabel lblJl;
    private javax.swing.JLabel lblNIP;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoTelp;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTl;
    private javax.swing.JTable tblGuru;
    private javax.swing.JTextField tfAgama;
    private javax.swing.JTextField tfNIP;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoTlp;
    // End of variables declaration//GEN-END:variables
}
