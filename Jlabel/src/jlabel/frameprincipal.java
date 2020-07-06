/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabel;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jardriel Sousa
 */
public class frameprincipal extends JFrame{
    JLabel[] imagem;
    public frameprincipal(){
        super();
        //configurando janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//faz o x funcionar
        this.setSize(600,400);//tamanho da janela
        //alinhamento
       this.setLayout(new GridLayout(2,3));       
       this.inicializar();
       
    }
    public void inicializar(){
        this.imagem = new JLabel[6];
        JLabel labImg;
        ImageIcon img ;
        for(int i = 0 ; i < 6 ; i++){
            img = new ImageIcon("img /img0"+((i%3)+1)+".png");
            labImg = new JLabel(img);
            this.add(this.imagem[i]);
        }
    }
}
