/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

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
public class Principal extends base{
    
    JPanel JpComandos , Jptabuleiros;
    JButton btNovoJogo;
    JButton[] btComandos;
    JLabel jogador;
    public Principal(){
       super();
       inicializar();
    }
    
    public void inicializar(){
       
        superior();
        inferior();
        this.pack();
    }
    public void superior(){
        JpComandos = new JPanel();
        JpComandos.setLayout(new FlowLayout());
        
        jogador = new JLabel("X");
        btNovoJogo = new JButton("New Game");
        this.JpComandos.add(jogador);
        this.JpComandos.add(btNovoJogo);
        this.add("North",JpComandos);
        
    }
   public void inferior(){
        Jptabuleiros = new JPanel();
        Jptabuleiros.setLayout(new GridLayout(3,3));
        btComandos = new JButton[9];
        handle escultar = new handle();
        
        btNovoJogo.setActionCommand("Novo Jogo");
        btNovoJogo.addActionListener(escultar);
        
        
        
        for(int i = 0;i<btComandos.length;i++){
            this.btComandos[i] = new JButton("livre");
            btComandos[i].setActionCommand("Botao "+ (i+1));
            btComandos[i].addActionListener(escultar);
            this.Jptabuleiros.add(btComandos[i]);
        }
        this.add("South",Jptabuleiros);
   }
}
class handle implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton)ae.getSource();
        String cmd = btn.getActionCommand();
        
        if(cmd == "X"){
            btn.setText("X");
        }else{
            btn.setText("0");
        }
       
}    
    public void NovoJogo(ActionEvent a){
        
    }
}