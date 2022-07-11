/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
 Connection con = null;
 
 public Conexion(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         String sURL="jdbc:mysql://localhost:3306/prueba";
         con = DriverManager.getConnection(sURL,"admincli1","1234");
     }
     catch(Exception e){
         e.printStackTrace();
     }
 }
 public Connection getConection(){
     return con;
 }
 
}
