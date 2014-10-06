/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unifiedview;

/**
 *
 * @author LCM
 */
public class SettingsView extends javax.swing.JFrame {

    /**
     * Creates new form SettingsView
     */
    public SettingsView() {
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

        jbAddFileExclusions = new javax.swing.JButton();
        jbAccountManagement = new javax.swing.JButton();
        jbViewShareAllocation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jbAddFileExclusions.setText("Add File Type Exclusions");
        jbAddFileExclusions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAddFileExclusionsMouseClicked(evt);
            }
        });
        jbAddFileExclusions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddFileExclusionsActionPerformed(evt);
            }
        });

        jbAccountManagement.setText("Account Management");
        jbAccountManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAccountManagementMouseClicked(evt);
            }
        });
        jbAccountManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccountManagementActionPerformed(evt);
            }
        });

        jbViewShareAllocation.setText("View Share Allocation");
        jbViewShareAllocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbViewShareAllocationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbViewShareAllocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAccountManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAddFileExclusions, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jbAddFileExclusions)
                .addGap(47, 47, 47)
                .addComponent(jbAccountManagement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jbViewShareAllocation)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddFileExclusionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddFileExclusionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddFileExclusionsActionPerformed

    private void jbAccountManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccountManagementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAccountManagementActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jbAddFileExclusionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAddFileExclusionsMouseClicked
        // TODO add your handling code here:
        AddFileExclusionsView afev = new AddFileExclusionsView();
        afev.setVisible(true);
    }//GEN-LAST:event_jbAddFileExclusionsMouseClicked

    private void jbAccountManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAccountManagementMouseClicked
        // TODO add your handling code here:
        AccountManagementView amv = new AccountManagementView();
        amv.setVisible(true);
    }//GEN-LAST:event_jbAccountManagementMouseClicked

    private void jbViewShareAllocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbViewShareAllocationMouseClicked
        // TODO add your handling code here:
        ShareAllocationView sav = new ShareAllocationView();
        sav.setVisible(true);
    }//GEN-LAST:event_jbViewShareAllocationMouseClicked

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
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAccountManagement;
    private javax.swing.JButton jbAddFileExclusions;
    private javax.swing.JButton jbViewShareAllocation;
    // End of variables declaration//GEN-END:variables
}
