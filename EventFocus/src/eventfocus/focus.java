/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventfocus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jardriel Sousa
 */
public class focus extends base{
    JButton boot;
    JTextField Campo , campo2;
    JPanel fundo;
    public focus(){
        init();
    }
    
    void init(){
        fundo = new JPanel();
        Campo = new JTextField(20);
        
        campo2 = new JTextField(20);
        boot = new JButton("Aqui!!");
        boot.addActionListener( new Acao());
        this.fundo.add(Campo);
        this.fundo.add(campo2);
        this.fundo.add(boot);
        
        this.add(fundo);
    }
    
    
    
}
class Acao implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	   JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
}
