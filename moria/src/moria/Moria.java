/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moria;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Vinnie
 */
public class Moria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con;
        con = null;
        try
            {
                String username = "sa";
                String pass = "Left4dead!";
                String url = "jdbc:sqlserver://98.193.48.252:36781;DatabaseName=Miora";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection(url, username, pass);
            }
            catch(Exception e)
            {
                System.out.println("connection to database failed");
                System.exit(0);
            }

 
        loginGui login = new loginGui();
        login.setVisible(true);
        login.acceptConnection(con);
       
    }
    
}
