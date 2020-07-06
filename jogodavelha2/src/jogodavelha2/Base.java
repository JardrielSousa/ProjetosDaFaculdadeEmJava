/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha2;

import static java.awt.Component.RIGHT_ALIGNMENT;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class Base extends JFrame{
    public Base(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("jogo da velha");
        this.setSize(300,400);
    }
}
