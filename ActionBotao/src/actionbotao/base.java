/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actionbotao;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class base extends JFrame{
    public base(){
        this.setTitle("Ação Botão");
        this.setSize(600,400);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
