/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutLogin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jardriel Sousa
 */
public class Base extends JFrame{
   
    public Base(){
        super();
        FrameLayout();

    }
    //Tela ( Layout )
    public void FrameLayout(){
        this.setSize(300,400);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
   

   
}
