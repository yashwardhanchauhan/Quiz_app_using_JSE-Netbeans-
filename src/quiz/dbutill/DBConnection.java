/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.dbutill;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DBConnection {
     private static Connection conn;
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","onlineexam","student");
            JOptionPane.showMessageDialog(null,"Connection Succesfully");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot connect to database ");
            
        }
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
             JOptionPane.showMessageDialog(null,"DisConnected Succesfully");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot close connection ");
            
         }
    }
  
    
}
