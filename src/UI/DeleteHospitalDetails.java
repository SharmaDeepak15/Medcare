/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HospitalDataRecord;
import model.HospitalDetails;

/**
 *
 * @author deepaksharma
 */
public class DeleteHospitalDetails extends javax.swing.JPanel {

    /**
     * Creates new form DeleteHospitalDetails
     */
    HospitalDataRecord hospital_history ;
    public DeleteHospitalDetails(HospitalDataRecord hospital_history) {
        initComponents();
        this.hospital_history = hospital_history;
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HospitalNameTxt = new javax.swing.JTextField();
        HospitalCountryTxt = new javax.swing.JTextField();
        HospitalContactLabel = new javax.swing.JLabel();
        HospitalPostalCodeLabel = new javax.swing.JLabel();
        HospitalContactTxt = new javax.swing.JTextField();
        HospitalPostalCodeTxt = new javax.swing.JTextField();
        HospitalEmailLabel = new javax.swing.JLabel();
        HospitalEmailTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        HospitalStreetNameLabel = new javax.swing.JLabel();
        HospitalStreetNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HospitalCityLabel = new javax.swing.JLabel();
        HospitalIDTxt = new javax.swing.JTextField();
        HospitalCityTxt = new javax.swing.JTextField();
        HospitalNameLabel = new javax.swing.JLabel();
        HospitalCountryLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Contact", "City", "Country"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Hospital Details");

        HospitalContactLabel.setText("Contact:");

        HospitalPostalCodeLabel.setText("Postal Code:");

        HospitalContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalContactTxtActionPerformed(evt);
            }
        });

        HospitalEmailLabel.setText("Email:");

        HospitalEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalEmailTxtActionPerformed(evt);
            }
        });

        jLabel10.setText("Address:");

        HospitalStreetNameLabel.setText("Street Name:");

        HospitalStreetNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalStreetNameTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("ID*:");

        HospitalCityLabel.setText("City*:");

        HospitalIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalIDTxtActionPerformed(evt);
            }
        });

        HospitalNameLabel.setText("Name*:");

        HospitalCountryLabel.setText("Country:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HospitalPostalCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalStreetNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HospitalStreetNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalCountryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HospitalPostalCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(HospitalNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HospitalContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HospitalContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HospitalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HospitalEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HospitalStreetNameLabel)
                            .addComponent(HospitalStreetNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HospitalCityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalCountryLabel)
                            .addComponent(HospitalCountryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalPostalCodeLabel)
                            .addComponent(HospitalPostalCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(HospitalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalNameLabel)
                            .addComponent(HospitalNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalContactLabel)
                            .addComponent(HospitalContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HospitalEmailLabel)
                            .addComponent(HospitalEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(176, 176, 176))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         int SelectedRowIndex = jTable1.getSelectedRow();

        if (SelectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a record to view details");
            return;
        }

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        HospitalDetails SelectedHospRecord = (HospitalDetails) model.getValueAt(SelectedRowIndex, 0);

        HospitalNameTxt.setText(SelectedHospRecord.getHospital_name());
        HospitalIDTxt.setText(String.valueOf(SelectedHospRecord.getHospital_id()));
        HospitalCityTxt.setText(SelectedHospRecord.getHospital_city());
        HospitalContactTxt.setText(String.valueOf(SelectedHospRecord.getHospital_contact()));
        HospitalCountryTxt.setText(SelectedHospRecord.getHospital_country());
        HospitalEmailTxt.setText(SelectedHospRecord.getHospital_email());
        HospitalPostalCodeTxt.setText(SelectedHospRecord.getHospital_postal_code());
        HospitalStreetNameTxt.setText(SelectedHospRecord.getHospital_street_name());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int SelectedRowIndex = jTable1.getSelectedRow();
        
        if (SelectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a record to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        HospitalDetails SelectedHospRecord = (HospitalDetails) model.getValueAt(SelectedRowIndex, 0);
        
        hospital_history.DeleteHospitalDetails(SelectedHospRecord);
        
        JOptionPane.showMessageDialog(this,"Selected record has been deleted");
        
        PopulateHospitalTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void HospitalContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalContactTxtActionPerformed

    private void HospitalEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalEmailTxtActionPerformed

    private void HospitalStreetNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalStreetNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalStreetNameTxtActionPerformed

    private void HospitalIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitalIDTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HospitalCityLabel;
    private javax.swing.JTextField HospitalCityTxt;
    private javax.swing.JLabel HospitalContactLabel;
    private javax.swing.JTextField HospitalContactTxt;
    private javax.swing.JLabel HospitalCountryLabel;
    private javax.swing.JTextField HospitalCountryTxt;
    private javax.swing.JLabel HospitalEmailLabel;
    private javax.swing.JTextField HospitalEmailTxt;
    private javax.swing.JTextField HospitalIDTxt;
    private javax.swing.JLabel HospitalNameLabel;
    private javax.swing.JTextField HospitalNameTxt;
    private javax.swing.JLabel HospitalPostalCodeLabel;
    private javax.swing.JTextField HospitalPostalCodeTxt;
    private javax.swing.JLabel HospitalStreetNameLabel;
    private javax.swing.JTextField HospitalStreetNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void PopulateHospitalTable() {
        
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for (HospitalDetails ed : hospital_history.getHistory()){
            Object[] row = new Object[5];
            row[0] = ed;
            row[1] = ed.getHospital_id();
            row[2] = ed.getHospital_contact();
            row[3] = ed.getHospital_city();
            row[4] = ed.getHospital_country();
            
            model.addRow(row);
    }
        
        
    }
}
