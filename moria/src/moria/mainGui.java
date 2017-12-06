/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinnie
 */
public class mainGui extends javax.swing.JFrame {

    /**
     * Creates new form mainGui
     */
    public mainGui() {
        initComponents();
    }
    
    public String userName;
    public String group;
    public Connection con;
    public boolean connect;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        classesButton = new javax.swing.JButton();
        groupsButton = new javax.swing.JButton();
        membersButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        groupTable = new javax.swing.JTable();
        groupLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        addClassButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        createAccount = new javax.swing.JMenuItem();
        addClassMenu = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        docButton = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classesButton.setText("Refresh My Classes");
        classesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classesButtonActionPerformed(evt);
            }
        });

        groupsButton.setText("Refresh My Group");
        groupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsButtonActionPerformed(evt);
            }
        });

        membersButton.setText("Refresh Members");
        membersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersButtonActionPerformed(evt);
            }
        });

        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Professor", "Course", "Meeting Days", "Meeting Times"
            }
        ));
        classTable.setFocusable(false);
        jScrollPane1.setViewportView(classTable);

        groupTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Professor", "Course", "Meeting Days", "Meeting Times", "User"
            }
        ));
        groupTable.setFocusable(false);
        jScrollPane2.setViewportView(groupTable);

        groupLabel.setText("Information For You Group {group}");

        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "User Name"
            }
        ));
        jScrollPane3.setViewportView(membersTable);

        addClassButton.setText("Add Class");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        createAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        createAccount.setText("create account prompt");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        jMenu1.add(createAccount);

        addClassMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        addClassMenu.setText("add classes");
        addClassMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassMenuActionPerformed(evt);
            }
        });
        jMenu1.add(addClassMenu);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        helpMenu.setText("Help");

        docButton.setText("Helpful Docs!");
        docButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docButtonActionPerformed(evt);
            }
        });
        helpMenu.add(docButton);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(classesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addClassButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(membersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classesButton)
                    .addComponent(membersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupsButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void acceptUser(String userID, Connection c)
    {
      this.userName = userID;  
      this.con = c;
      showGroupInfo();
      showClassInfo();
      showMemberInfo();
    }
    public void acceptGroup(String groupID)
    {
        this.group=groupID;
        this.groupLabel.setText("Information for your group " + this.group);
    }
    public void isConnected(boolean connect)
    {
        this.connect = connect;
    }
    //TESTING 
    public ArrayList<ClassInfo> classList()
    {
            ArrayList<ClassInfo> classList = new ArrayList<>();
            if (connect == true)
            {
                try
                {

                String sql = "Select [Professor], [Course ID], [Meeting Days], [Meeting Time] from [dbo].[Classes] where UserID=?";
                PreparedStatement ps = this.con.prepareStatement(sql);
                ps.setString(1,userName);
                ResultSet result = ps.executeQuery();
                ClassInfo classes;
            
                while (result.next())
                {
                    classes = new ClassInfo(result.getString(1), result.getString(2), result.getString(3), result.getString(4));
                    classList.add(classes);
                }
           
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else
            {
                ClassInfo classes;
                classes = new ClassInfo("Hungerford","BIOL 101","MWF","10:30AM-12:00PM");
                classList.add(classes);
            }
            return classList;
    }
    public void showClassInfo()
    {
        ArrayList<ClassInfo> info = classList();
        DefaultTableModel model = (DefaultTableModel)this.classTable.getModel();
        Object [] rows = new Object[4];
        for (int i = 0; i < info.size(); i++)
        {
            
            rows[0] = info.get(i).getProfessor();
            rows[1] = info.get(i).getCourse();
            rows[2] = info.get(i).getMeeting_days();
            rows[3] = info.get(i).getMeeting_time();
            model.insertRow(i, rows);
        }
    }
    public ArrayList<GroupInfo> groupInfo()
    {
        ArrayList<GroupInfo> groupInfo = new ArrayList<>();
        try
        {
            
            String sql = "Select [Professor], [Course ID], [Meeting Days], [Meeting Time], [UserID] from [dbo].[Classes] where [Group]=? and [UserID] !=?";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ps.setString(1,group); //TODO: Get dynamic group instead of static group.
            ps.setString(2, userName);
            ResultSet result = ps.executeQuery();
            GroupInfo groups;
            while(result.next())
            {
                groups = new GroupInfo(result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
                groupInfo.add(groups);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return groupInfo;
    }
    public void showGroupInfo()
    {
        ArrayList<GroupInfo> groups = groupInfo();
        DefaultTableModel model = (DefaultTableModel)this.groupTable.getModel();
        
        Object [] rows = new Object[5];
        
        for (int i = 0; i < groups.size(); i++)
        {
            rows[0] = groups.get(i).getProfessor();
            rows[1] = groups.get(i).getCourse();
            rows[2] = groups.get(i).getMeeting_days();
            rows[3] = groups.get(i).getMeeting_time();
            rows[4] = groups.get(i).getUserID();
            model.insertRow(i, rows);
        }
    }
    
     public ArrayList<MemberInfo> memberInfo()
    {
        ArrayList<MemberInfo> memberInfo = new ArrayList<>();
        try
        {
            
            String sql = "SELECT [First Name],[Last Name],[Username] FROM [dbo].[Login] where [Group] = '" + this.group + "'  order by [First Name] asc";
            PreparedStatement ps = this.con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            MemberInfo members;
            while(result.next())
            {
                members = new MemberInfo(result.getString(1), result.getString(2), result.getString(3));
                memberInfo.add(members);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return memberInfo;
    }

    

    public void showMemberInfo()
    {
        ArrayList<MemberInfo> members = memberInfo();
        DefaultTableModel model = (DefaultTableModel)this.membersTable.getModel();
        
        Object [] rows = new Object[3];
        
        for (int i = 0; i < members.size(); i++)
        {
            rows[0] = members.get(i).getFristName();
            rows[1] = members.get(i).getLastName();
            rows[2] = members.get(i).getUsername();
            model.insertRow(i, rows);

        }
        
    }
    
    public void clearRowsClass() //  change this to be all one clear function.
    {
        DefaultTableModel model = (DefaultTableModel)this.classTable.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
    }
    public void clearRowsGroup()
    {
        DefaultTableModel model = (DefaultTableModel)this.groupTable.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
    }
    
    public void clearRowsMember()
    {
        DefaultTableModel model = (DefaultTableModel)this.membersTable.getModel(); 
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
    }   

    
    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
       System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        addClassMenuActionPerformed(evt);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void docButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docButtonActionPerformed
        System.out.println("this is our help doc!");
    }//GEN-LAST:event_docButtonActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        newAccountGui newAcc = new newAccountGui();
        newAcc.acceptConnection(this.con);
        newAcc.setVisible(true);
    }//GEN-LAST:event_createAccountActionPerformed

    private void classesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classesButtonActionPerformed
        clearRowsClass();
        showClassInfo();
    }//GEN-LAST:event_classesButtonActionPerformed

    private void addClassMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassMenuActionPerformed
        enterInfoGui infoGui = new enterInfoGui();
        infoGui.acceptUser(userName, con);
        infoGui.acceptGroup(this.group);
        infoGui.setVisible(true);
    }//GEN-LAST:event_addClassMenuActionPerformed

    private void groupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupsButtonActionPerformed
        clearRowsGroup();
        showGroupInfo();
    }//GEN-LAST:event_groupsButtonActionPerformed

    private void membersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersButtonActionPerformed
        clearRowsMember();
        showMemberInfo();
    }//GEN-LAST:event_membersButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        addClassMenuActionPerformed(evt);
    }//GEN-LAST:event_addClassButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JMenuItem addClassMenu;
    private javax.swing.JTable classTable;
    private javax.swing.JButton classesButton;
    private javax.swing.JMenuItem createAccount;
    private javax.swing.JMenuItem docButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JTable groupTable;
    private javax.swing.JButton groupsButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton membersButton;
    private javax.swing.JTable membersTable;
    private javax.swing.JMenuItem quitMenuItem;
    // End of variables declaration//GEN-END:variables
}
