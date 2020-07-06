/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayoutLogin;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jardriel Sousa
 */
public class FramePrincipal extends Base{
    //Váriaveis
    JLabel lbLogin , Lbsenha;
    JTextField txLogin;
    JPasswordField txSenha;
    JButton txbtn;
    //inicia classe principal
    public FramePrincipal(){
    init();
    }
     //Conteudo da tela
    public void init(){
        ImageIcon imagem = new ImageIcon("src/img/pwd.png");//imagem
        JLabel img = new JLabel();//cria um Jlabel
        img.setIcon(imagem);//insere a Imagem ao JLabel
        lbLogin = new JLabel("Informe o email");//Cria o label
        txLogin = new JTextField(20);//Cria o Campo de Login
        
        Lbsenha = new JLabel("Informe uma senha forte");//Cria o label Senha
        txSenha = new JPasswordField(20);//Cria o Campo de Senha
        
        //cria o botao enviar
        txbtn = new JButton("Enviar");
        
        //Insere os compenentes a tela
        this.add(img);
        this.add(lbLogin);
        this.add(txLogin);
        this.add(Lbsenha);
        this.add(txSenha);
        this.add(txbtn);
        
        
    }

    
}
