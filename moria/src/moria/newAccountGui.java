/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author Vinnie
 */
public class newAccountGui extends javax.swing.JFrame {

    public String firstName;
    public String lastName;
    public String userName;
    public String group;
    public String password;
    public Connection con;
    /**
     * Creates new form newAccountGui
     */
    public newAccountGui() {
        initComponents();
    }
    
    public void acceptConnection(Connection c)
    {
      this.con = c;  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        groupField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameField.setBorder(null);
        firstNameField.setOpaque(false);
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, 120, 20));

        lastNameField.setBorder(null);
        lastNameField.setOpaque(false);
        getContentPane().add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 182, 120, 20));

        userNameField.setBorder(null);
        userNameField.setOpaque(false);
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 20));

        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 277, 120, 20));

        groupField.setBorder(null);
        groupField.setOpaque(false);
        getContentPane().add(groupField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, 120, 20));

        confirmButton.setBorder(null);
        confirmButton.setContentAreaFilled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 70, 70));

        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newAccountImage.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        if(this.userNameField.getText().equals("") || this.passwordField.getText().equals("")
                || this.groupField.getText().equals("") || this.firstNameField.getText().equals("")
                || this.lastNameField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "All Fields Must Be Filled");
        }
        else
        {
            firstName = this.firstNameField.getText();
            lastName = this.lastNameField.getText();
            group = this.groupField.getText();
            userName = this.userNameField.getText();
            password = this.passwordField.getText();
            try
            {
                String checkSql = "Select * from [dbo].[Login] where [Username] = ?";
                PreparedStatement checkPS = this.con.prepareStatement(checkSql);
                checkPS.setString(1, userName);
                ResultSet checkResult = checkPS.executeQuery();
                if (checkResult.next())
                {
                    JOptionPane.showMessageDialog(this, "Username already taken");
                }
                else
                {
                    String sql = "INSERT INTO [dbo].[Login]([First Name],[Last Name],[Username],[Password],[Group])"
                    + "values(?,?,?,?,?)";
                    String insertReport = "Insert into [dbo].[Report] ([UserID], [Report Number], [Reason], [Reported]) values (?,?,?,?)";
                    PreparedStatement reportPS = this.con.prepareStatement(insertReport);
                    PreparedStatement ps = this.con.prepareStatement(sql);
                    ps.setString(1, firstName);
                    ps.setString(2, lastName);
                    ps.setString(3, userName);
                    ps.setString(4, password);
                    ps.setString(5, group);
                    reportPS.setString(1, userName);
                    reportPS.setInt(2, 0);
                    reportPS.setString(3, null);
                    reportPS.setInt(4,0);
                    reportPS.executeUpdate();
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Account Created");
                    this.setVisible(false);
                }
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }            
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(newAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAccountGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAccountGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField groupField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
