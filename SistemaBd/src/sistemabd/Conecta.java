/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabd;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;

/**
 *
 * @author Jardriel Sousa
 */
public class Conecta extends Interface {
     public Connection ConectFactory(Connection cx) throws ClassNotFoundException,SQLException{
         Connection con = null ;
         PreparedStatement st = null;
         Interface c = new Interface();
         
         System.out.println("Conectando...");                
         
         try{
             
             
                Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/Cadastrodeusuarios","root","");
                con.setAutoCommit(false);
                String sql = "insert into usuario(nome,email,senha)"
                        + "values('gordao','hype@123','comida');";
                
                st = con.prepareStatement(sql);
                
                st.execute();
                System.out.println("Dados inseridos com sucesso");
                con.commit();
                System.out.println("essa merda deu Certo!!!");
                st.close();
                exit(0);
             return con;		
		}catch (SQLException e){
                        System.out.println("Deu erro aqui");
                        con.rollback();
			throw new RuntimeException(e);
		}finally {
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
             
     }

  
}
