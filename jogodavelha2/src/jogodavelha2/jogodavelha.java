/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jardriel Sousa
 */
public class jogodavelha extends Base{
    
    JPanel pnComandos , pnTabuleiros;
    public JLabel lbjogador;
    JButton botoes[];
    JButton novo;
    
    public jogodavelha(){
        iniciar();
        setResizable(false);
    }
    public void iniciar(){
        pnComandos = new JPanel( new FlowLayout());
        pnTabuleiros = new JPanel(new GridLayout(3,3));
        
        lbjogador = new JLabel("X");
        novo = new JButton("Novo jogo");
        
        Handle e = new Handle();
        novo.setActionCommand("newgame");
        novo.addActionListener(e);
        pnComandos.add(lbjogador);
        pnComandos.add(novo);
        botoes = new JButton[9];
        
        for(int i = 0 ; i < botoes.length;i++){
            botoes[i] = new JButton();
            botoes[i].setText("livre");
            botoes[i].addActionListener(e);
            botoes[i].setActionCommand("op"+i);
            pnTabuleiros.add(botoes[i]);
        }
        
        this.add("North",pnComandos);
        this.add("center",pnTabuleiros);
        
    }
    
}

class Handle implements ActionListener{


 
          
 
    
      public void altera(){
          System.out.println("Alterou");
          
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}