/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Vinnie
 */
public class Moria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        loginGui login = new loginGui();
        login.setVisible(true);
        Connection con;
        con = null;
        try
            {
                String username = "Moria_Log";
                String pass = "Cs330luc";
                String url = "jdbc:sqlserver://98.193.48.252: 36781;DatabaseName=Moria";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection(url, username, pass);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(login, "Connection to Database failed. Sever may be down!");
                System.out.println(e);
                System.exit(0);
                
             
            }

        login.acceptConnection(con);
       
    }
    
}