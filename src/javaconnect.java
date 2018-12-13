/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prateek jain
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect 
{
    Connection conn;
    
    public static Connection dbconnector()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/LMS","prateek","12345");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
