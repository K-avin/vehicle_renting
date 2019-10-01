/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_renting;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class dbconnection {
    static Connection con;
    static Connection getConnection()
    {
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_rent","root","root");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
}

    

