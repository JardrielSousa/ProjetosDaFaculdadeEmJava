/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionbotao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class botao extends base implements ActionListener{
    
     private JButton botao1;
       public botao() 
       {  
       
        inicializar();
        
       }
       void inicializar(){
           botao1 = new JButton("botao");
           botao1.addActionListener( this );
           this.add(botao1);
       }
       public void actionPerformed(ActionEvent e) {
              if( e.getSource() == botao1 ) {
                  System.out.println("Botao clicado!!!");
        
               } 
         }
  
    
}
