/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class Connect {
    public static Connection dbConnection() throws SQLException{
        Connection con = null;
        try {
            // membuat koneksi database mysql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/penyewaan_lapangan", "root", ""); // Port 3306
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
