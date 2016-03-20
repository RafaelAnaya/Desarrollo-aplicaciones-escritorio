/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.prueba;

import app.db.AccesoDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Prueba3 {
    public static void main(String[] args) {
        Connection cn= null;
        try{
         String usuario;
         usuario = JOptionPane.showInputDialog("Insgrse Usuario");
        cn = AccesoDB.getConnection();
        String sql= "select * from empleado "
                    +"where vch_emplusuario ='"+ usuario + "'";
            System.err.println("SQL: "+ sql);
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()){
            String texto = rs.getString("CHR_EMPLCODIGO") +
                    " | " + rs.getString("VCH_EMPLPATERNO")+
                    " | " + rs.getString("VCH_EMPLUSUARIO");
                    System.out.println(texto);
            }
            rs.close();
            stm.close(); 
        }catch (Exception e){
        e.printStackTrace();
        }finally{
            try{
            cn.close();
        }catch (Exception e){
        }
        }
        
    }
}

