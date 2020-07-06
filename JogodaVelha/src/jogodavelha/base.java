/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class base extends JFrame{
    public base(){
     inicializar();
    }

    private void inicializar() {
       this.setLayout(new BorderLayout());
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(300,300);
       this.setLocationRelativeTo(null);
        setTitle("Jogo da Velha");
    }
    
}
