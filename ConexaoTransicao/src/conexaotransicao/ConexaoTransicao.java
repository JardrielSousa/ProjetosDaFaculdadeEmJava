/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaotransicao;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jardriel Sousa
 */
public class ConexaoTransicao {

    /**
     * @param args the command line arguments
     */
        
        // TODO code application logic here
    public static void main(String[] args) throws SQLException{
        conecta a = new conecta();
        a.init();
        
        
    
    }
    

}