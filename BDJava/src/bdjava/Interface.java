/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdjava;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jardriel Sousa
 */
public class Interface extends Base {
    JButton BtnEnviar;
    JTextField CampoNome , CampoEmail ;
    JPasswordField CampoSenha;
    JLabel JlNome , JlEmail , JLSenha;
    
    public Interface(){
        init();
    }
    public void init(){
        JlNome = new JLabel("Nome:");
        CampoNome = new JTextField(20);
        JlEmail = new JLabel("Email:");
        CampoEmail = new JTextField(20);
        JLSenha = new JLabel("Senha:");
        CampoSenha = new JPasswordField(20);
        BtnEnviar = new JButton("Enviar");
        
           this.BtnEnviar.setActionCommand("");
        this.BtnEnviar.addActionListener(new Cadastra());
        this.add(JlNome);
        this.add(CampoNome);
        this.add(JlEmail);
        this.add(CampoEmail);
        this.add(JLSenha);
        this.add(CampoSenha);
        this.add(BtnEnviar);
        
    }
   
    class Cadastra implements ActionListener{
        Connection cx = null ;
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
            JOptionPane.showMessageDialog(null,"Cadastrado!!");
            Conecta a = new Conecta();
            
            
                a.ConectFactory(cx);
                System.out.println("Voce clicou");
            } catch (ClassNotFoundException ex) {
                System.out.println("Erro entre interface e banco!");
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        /*if(e. == BtnEnviar){
            JOptionPane.showMessageDialog(this,"Cadastrado:");
            System.out.println("Seu nome é:" + CampoNome);
            System.out.println("Seu email é:" + CampoEmail);
            
        }*/
        
    }
    
}
