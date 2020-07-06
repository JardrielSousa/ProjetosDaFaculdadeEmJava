/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class Base extends JFrame {
    public Base(){
        this.setTitle("Cadastro");
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }
}
