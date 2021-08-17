/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author jorge
 */
public class Conexion {
        String strConexion="jdbc:sqlite:C:/Users/jorge/Desktop/reto/ProyectosConstruccion.db";
    Connection conn = null;
    
    public Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexion);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
    public  ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet resultado= pstm.executeQuery();
            return resultado;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
