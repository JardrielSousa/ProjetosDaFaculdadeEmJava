/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodamemória;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jardriel Sousa
 */
public class Base extends JFrame{

    JLabel Imagens[];
    int tamanho=0;
    
    public Base(){
        super("Jogo da Memória");
        
         //configurando janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//faz o x funcionar
        this.setSize(600,400);//tamanho da janela
        //alinhamento
       this.setLayout(new GridLayout(2,3));
       inicializar();
    }
    public void inicializar(){
        InicializarImg();
    
    }
    public void InicializarImg(){
        this.Imagens = new JLabel[6];
                
        //this.Imagens[0] = new JLabel("src/img/java.png");
        
        for(int i = 0 ;i<Imagens.length;i++){
        ImageIcon iconlogo = new ImageIcon("src/img/img01.png");
        
        JLabel lab = new JLabel();
        lab.setIcon(iconlogo);
        this.add(lab);
        }
    }
   
    
}
