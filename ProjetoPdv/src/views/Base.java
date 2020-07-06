/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 
 */
public class Base extends JFrame {
    public Base(){
        this.setTitle("Sistema de Cadastro");
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }
}
