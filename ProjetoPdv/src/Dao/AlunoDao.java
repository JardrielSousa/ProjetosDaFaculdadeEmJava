/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import beans.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 
 */
public class AlunoDao {
    public void Insere(Aluno obj) throws SQLException, ClassNotFoundException{
        
      /*  String sql = "insert into aluno(nome,email,telefone,matricula)"+"values('"+obj.getNome()+"','"+
                obj.getEmail()+"','"+obj.getTelefone()+"','"+obj.getMatricula()+"')";
        
      
      
        Connection cx = null;
        
        Statement st = null;
        cx = conexao.getconnection();
        st = cx.prepareStatement(sql);
        st.execute(sql);
        cx.close();
*/
      Connection cx = null;
      cx = conexao.getconnection();
      String sql = "INSERT INTO aluno(nome,email,telefone,matricula) VALUES (?,?,?,?)";
      PreparedStatement stmt = cx.prepareStatement(sql);  
         
                stmt.setString(1, obj.getNome());  
                stmt.setString(2, obj.getEmail());  
                stmt.setString(3, obj.getTelefone());  
                stmt.setString(4, obj.getMatricula());  
                stmt.execute();  
                stmt.close();  
      
      
    }
}
