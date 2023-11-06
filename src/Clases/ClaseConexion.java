
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.logging.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author josue
 */
public class ClaseConexion {
    Connection con;
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/proyectoprestamos?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Josuela30";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            //logger.log(Logger.Level.ALL, e);
            java.util.logging.Logger.getLogger(ClaseConexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
        try{
            con =DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null, "Error de conexion " + sqlex);
        }
        return con; 
    }
    
}
