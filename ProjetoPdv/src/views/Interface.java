/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Dao.AlunoDao;
import Dao.conexao;
import beans.Aluno;
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
       telaInicial();
        
    }
   public void telaInicial(){
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
            JOptionPane.showMessageDialog(null,"Cadastrado!!");
            
            AlunoDao a  = new AlunoDao();
            Aluno obj = null;
            try {
                a.Insere(obj);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Voce clicou");
            
        }
       
        
    }
    
}
