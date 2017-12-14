/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinnie
 */
public class ReportGUI extends javax.swing.JFrame {

    /**
     * Creates new form ReportGUI
     */
    public ReportGUI() {
        initComponents();
    }
    
    Connection con;
    int report;
    int reportee;
    String UserID;
    
    public void acceptConnection(Connection c)
    {
        this.con = c;
    }
    public void acceptUserID(String ID)
    {
        this.UserID = ID;
    }
    //Need to store Login String to reference here for queries.
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        problemTextField = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameField.setBackground(null);
        userNameField.setBorder(null);
        userNameField.setOpaque(false);
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 124, 210, 20));

        jScrollPane1.setBackground(null);
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        problemTextField.setColumns(20);
        problemTextField.setRows(5);
        problemTextField.setBorder(null);
        problemTextField.setOpaque(false);
        jScrollPane1.setViewportView(problemTextField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 170));

        okButton.setBorder(null);
        okButton.setBorderPainted(false);
        okButton.setContentAreaFilled(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 60, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportImage.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        String explaination = this.problemTextField.getText();
        String userName = this.userNameField.getText();
        
        String getReport = "Select [Report Number] from [dbo].[Report] where [UserID] = ?";
        String verifyReport = "Select [Reported] from [dbo].[Report] where [UserID] = ?";
        String updateReport = "UPDATE [dbo].[Report] SET [Report Number] = ? , [Reason] = ? WHERE UserID = ?";
        String updateReportee = "update [dbo].[Report] set [Reported] = ? where [UserID] = ?";
        try {
            PreparedStatement reporteePS = this.con.prepareStatement(verifyReport);
            reporteePS.setString(1, UserID);
            ResultSet reporteeR = reporteePS.executeQuery();
            if (reporteeR.next())
            {
                reportee = reporteeR.getInt(1);
                reportee++;
            }
            
            if (reportee > 5)
            {
                JOptionPane.showMessageDialog(this, "You've been reporting a lot of users. We do not accept spam reports. If you continue, you will be blocked from making reports.");
                PreparedStatement reportPS = this.con.prepareStatement(getReport);
                reportPS.setString(1, userName);
                ResultSet resultR = reportPS.executeQuery();
                if (resultR.next())
                {
                    report = resultR.getInt(1);
                    report++;
                }
                PreparedStatement update = this.con.prepareStatement(updateReport);
                update.setInt(1, report);
                update.setString(2, explaination);
                update.setString(3, userName);
            
                update.executeUpdate();
                
                PreparedStatement updateReporter = this.con.prepareStatement(updateReportee);
                updateReporter.setInt(1,reportee);
                updateReporter.setString(2, UserID);
                updateReporter.executeUpdate();
            }
            else if (reportee > 10)
            {
                JOptionPane.showMessageDialog(this, "You've sent too many reports. You have been denied access to the reporting feature until further notice. If you're responsible for the potential suspension of another user, your account will be terminated");
            }
            else
            {
                PreparedStatement reportPS = this.con.prepareStatement(getReport);
                reportPS.setString(1, userName);
                ResultSet resultR = reportPS.executeQuery();
                if (resultR.next())
                {
                    report = resultR.getInt(1);
                    report++;
                }
                PreparedStatement update = this.con.prepareStatement(updateReport);
                update.setInt(1, report);
                update.setString(2, explaination);
                update.setString(3, userName);
            
                update.executeUpdate();
                PreparedStatement updateReporter = this.con.prepareStatement(updateReportee);
                updateReporter.setInt(1,reportee);
                updateReporter.setString(2, UserID);
                updateReporter.executeUpdate();
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ReportGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(this, "Report Submitted");
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JTextArea problemTextField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
