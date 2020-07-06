/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaotransicao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jardriel Sousa
 */
public class conecta {
    //VARIAVEIS 
    Connection conexao= null ;
    Statement st = null;
    String inserir = null;
    int total = 0 ;
    String apaga = null , mostrar = null ;
    ResultSet rs = null ;
    
    //METODO INICIALIZADOR
    public void init() throws SQLException{
        conectaAOBD();
        verifica();
        apagarTudo();
        //inserir();
        exibir();
    }
    
    //METODO QUE FAZ CONEXÃO COM O B.D
    public void conectaAOBD(){
        
        System.out.println("Conectando...");      
        try{
            Class.forName("com.mysql.jdbc.Driver");           
            conexao = DriverManager.getConnection( "jdbc:mysql://localhost/cadastro","root","");
            System.out.println("Conectado ao banco !!");
                       
        }catch(Exception e){
        throw new RuntimeException(e);
        
    }
    }
    //FAZ A VERIFICAÇÃO DA CONEXAO
    public void verifica() throws SQLException{
        if(conexao.isClosed()){
            System.out.println("Conexão Fechada !!!");
        }else{
            System.out.println("Conexão Aberta !!!");
        }
    }
    //METODO QUE INSERE OS DADOS NO B.D
    public void inserir() throws SQLException{
        try{
            conexao.setAutoCommit(false);
            inserir = "insert into usuario(nome,email,senha)values('testeinsert','ts@123','12345')";
            st = conexao.prepareStatement(inserir);
            st.execute(inserir);
            System.out.println("Dados inseridos");
            conexao.commit();
            total = st.executeUpdate(inserir);
            System.out.println(total +  " registros atualizados");
            
        }catch(Exception e){
            System.out.println("Erro ao inserir dados");
            conexao.rollback();
        }
        
    }
    //METODO QUE MOSTRA OS DADOS DA TABELA
    public void exibir() throws SQLException{
        
        mostrar = "select * from usuario";
        rs = st.executeQuery(mostrar);
             
        
        while(rs.next()){
            System.out.println("Nome:" + rs.getString("nome")+", email:"+rs.getString("email"));
        }
        
        conexao.close();
        verifica();
    }
    //METODO QUE APAGA TUDO
    public void apagarTudo() throws SQLException{
        apaga = "truncate table usuario";
        st = conexao.prepareStatement(apaga);
        st.execute(apaga);
        System.out.println(total +  " registros atualizados");
        
    }

    
           
}
