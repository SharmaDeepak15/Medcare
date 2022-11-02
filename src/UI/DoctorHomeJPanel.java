/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import model.MedcareDataRecord;
import model.PatientDataRecord;

/**
 *
 * @author deepaksharma
 */
public class DoctorHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorHomeJPanel
     */
    PatientDataRecord patient_history;
    public DoctorHomeJPanel(PatientDataRecord patient_history) {
        initComponents();
        this.patient_history = patient_history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        DoctorLabeljPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SplitPane1 = new javax.swing.JPanel();

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOCTOR");

        jButton2.setText("Register New Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Patient Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DoctorLabeljPanelLayout = new javax.swing.GroupLayout(DoctorLabeljPanel);
        DoctorLabeljPanel.setLayout(DoctorLabeljPanelLayout);
        DoctorLabeljPanelLayout.setHorizontalGroup(
            DoctorLabeljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addGroup(DoctorLabeljPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(71, 71, 71))
        );
        DoctorLabeljPanelLayout.setVerticalGroup(
            DoctorLabeljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoctorLabeljPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(DoctorLabeljPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        SplitPane.setTopComponent(DoctorLabeljPanel);

        javax.swing.GroupLayout SplitPane1Layout = new javax.swing.GroupLayout(SplitPane1);
        SplitPane1.setLayout(SplitPane1Layout);
        SplitPane1Layout.setHorizontalGroup(
            SplitPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        SplitPane1Layout.setVerticalGroup(
            SplitPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(SplitPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AddNewPatientDetails AddNewPatient = new AddNewPatientDetails(patient_history);
        SplitPane.setBottomComponent(AddNewPatient);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ViewPatientDetails ViewPatient = new ViewPatientDetails(patient_history);
        SplitPane.setBottomComponent(ViewPatient);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorLabeljPanel;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel SplitPane1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
