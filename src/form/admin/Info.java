/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package form.admin;

import database.KoneksiDB;
import form.DashboardAdmin;
import form.Utility;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author resar
 */
public class Info extends javax.swing.JInternalFrame {

    /**
     * Creates new form Info
     */
    KoneksiDB k = new KoneksiDB();
    Connection con = k.connection;
    String namaTabel = "info";
    int idPesan;
    int jmlPesan[] = new int [100];

    public Info() {
        initComponents();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        showInfo();
    }
    
    public void showInfo(){
        
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
        
        Statement st;
        ResultSet rs;

        String query = "SELECT * FROM info";
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Object[] row = new Object[2];
            int no = 0;
            while(rs.next()){
                jmlPesan[no] = rs.getInt("id_pesan");
                row[0] = ++no;
                row[1] = rs.getString("pesan");
                model.addRow(row);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void executeSQLQuery(String query, String pesan)
    {
        Statement st;
        ResultSet rs;        
        try{
            st = con.createStatement();
            if(st.executeUpdate(query)>0){
                RefreshPage();
                JOptionPane.showMessageDialog(null, "Data " + pesan+ " Succesfully");
            } else{
                JOptionPane.showMessageDialog(null, "Data Not " + pesan);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void RefreshPage(){
        DefaultTableModel model = (DefaultTableModel)tblInfo.getModel();
        model.setRowCount(0);
        showInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPesan = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        taPesan.setColumns(20);
        taPesan.setRows(5);
        jScrollPane1.setViewportView(taPesan);

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "PESAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblInfo.setShowHorizontalLines(false);
        tblInfo.setShowVerticalLines(false);
        tblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblInfo);
        if (tblInfo.getColumnModel().getColumnCount() > 0) {
            tblInfo.getColumnModel().getColumn(0).setResizable(false);
            tblInfo.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ISI PESAN:");

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reset.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add.png"))); // NOI18N
        btnAdd1.setText("ADD");
        btnAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-making_notes.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete_trash.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd1)
                        .addGap(17, 17, 17)
                        .addComponent(btnEdit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(17, 17, 17)
                        .addComponent(btnDelete)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
         if(!taPesan.getText().isEmpty()){
            String query = "INSERT INTO " + namaTabel +"(`pesan`) VALUES ('"+Utility.capitalizeWord(taPesan.getText())+"')";
            executeSQLQuery(query, "Inserted");
        } else{
            JOptionPane.showMessageDialog(this, "Isi Field Pesan!");
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void tblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblInfo.getModel();
        idPesan = jmlPesan[tblInfo.getSelectedRow()];
        Statement st;
        ResultSet rs;
        String query = "SELECT pesan FROM " + namaTabel + " WHERE id_pesan="+idPesan;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                taPesan.setText(rs.getString("pesan"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblInfoMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(idPesan > 0){
            if(taPesan.getText() != null){
                int conf;
                conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Mengedit Data Ini?",
                    "Warning",JOptionPane.WARNING_MESSAGE);
                if(conf == 0){
                    String query = "UPDATE " + namaTabel + " SET pesan = '"+ Utility.capitalizeWord(taPesan.getText()) +"' WHERE id_pesan="+idPesan;
                    executeSQLQuery(query, "Updated"); 
                }
            }
        } else{
            JOptionPane.showMessageDialog(this, "Pilih Data Yang Ingin Di Edit!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(idPesan > 0){
            int conf;
            conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini?",
                    "Warning",JOptionPane.WARNING_MESSAGE);
            if(conf == 0){
                if(taPesan.getText() != null){
                    String query = "DELETE FROM " + namaTabel + " WHERE id_pesan="+idPesan;
                    executeSQLQuery(query, "Deleted"); 
                }
            }
        } else{
            JOptionPane.showMessageDialog(this, "Pilih Data Yang Ingin Di Edit!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        taPesan.setText("");
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taPesan;
    private javax.swing.JTable tblInfo;
    // End of variables declaration//GEN-END:variables
}