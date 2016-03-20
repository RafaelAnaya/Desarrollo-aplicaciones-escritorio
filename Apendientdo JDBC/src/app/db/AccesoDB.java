/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class AccesoDB {
    private AccesoDB(){
    }
        public static Connection getConnection() throws SQLException{
        Connection cn=null;
        try{
        
        String driver = "oracle.jdbc.OracleDriver";
        String urlDB= "jdbc:oracle:thin:@localhost:1521/xe.uni.org";
        String user= "eureka";
        String pass= "admin";
        //cargar driver
        Class.forName(driver).newInstance();
        cn = DriverManager.getConnection(urlDB, user,pass);
        
        }catch(SQLException e){
        throw e;
        }catch (ClassNotFoundException e){
        throw new SQLException("No se ha encontrado el driver");
        }catch (Exception e){
        String msg = "Error, no se puede establecer la conexion";
        if(e.getMessage() !=null && !e.getMessage().isEmpty()){
        msg += " "+ e.getMessage();
        }throw new SQLException(msg);
        }
        return cn;
        }
    
    
}
