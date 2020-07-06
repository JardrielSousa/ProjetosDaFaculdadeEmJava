/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 
 */
public class conexao{
    public static Connection getconnection() throws SQLException, ClassNotFoundException{
        Connection cx = null ;
        
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/estacio";
            
            String user = "root";
            String pass = "";
        
        
        cx = DriverManager.getConnection( url,user,pass);
           System.out.println("Conectado ao Banco!");
        return cx;
       }catch(SQLException e){
           System.out.println("erro ao conectar ao banco - ");
           throw e;
           
           
       }
    }
}
