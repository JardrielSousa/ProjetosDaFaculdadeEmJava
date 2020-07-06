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
public class BDJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException  {
        // TODO code application logic here
        /*Connection cx = null ;
         Conecta a = new Conecta();
         a.ConectFactory(cx);
      /* Base a = new Base();
       a.setVisible(true);*/
      
      Interface a = new Interface();
      a.setVisible(true);
        
        
        
        
        
    }
    
}
