/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.prueba;

import app.db.AccesoDB;
import java.sql.Connection;

/**
 *
 * @author Alumno
 */
public class Pueba1 {
    public static void main(String[] args) {
        try{
        Connection cn = AccesoDB.getConnection();
        System.out.println("Conexion ok");
        cn.close();
        
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
