/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jardriel Sousa
 */
public class Conecta extends Interface {
     public Connection ConectFactory(Connection cx) throws ClassNotFoundException,SQLException{
         Connection con = null ;
         System.out.println("Conectando...");
         
         
         try{
                Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/projetobasico","root","");
                System.out.println("essa merda deu Certo!!!");
                
             return con;		
		}catch (SQLException e){
                        System.out.println("Deu erro aqui");
			throw new RuntimeException(e);
		}/*finally {
                        verifica(cx);
                        cx.isClosed();
                        verifica(cx);
             
        }	
         
         
        
    }
     private static void verifica(Connection cx) throws SQLException{
         if(cx.isClosed()){
             System.out.println("Conexão Fechada");
         }else{
             System.out.println("Conexão Aberta");
         }
             
    */ }

  
}
