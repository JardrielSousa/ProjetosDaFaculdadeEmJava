/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaproduto;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jardriel Sousa
 */
public class BaseProduto extends JFrame{
    public BaseProduto(){
        super("Produto");
        Layout();
        Tela();
    }
    public void Layout(){
        this.setSize(250,470);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout((int) RIGHT_ALIGNMENT));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    public void Tela(){
        //variaveis
        JLabel lbCod , lbnome , lbDescricao , lbpreco , txcod , img;
        JTextField txnome , txdescricao , txpreco;
        JButton btnGravar , btnCarregar , btnExcluir;
        ImageIcon a ;
        
        a = new ImageIcon("src/img/venda.png");
        img = new JLabel();
        img.setIcon(a);
        lbCod = new JLabel();
        lbCod.setText("Codigo");
        txcod = new JLabel("xxx                                                       ");
        
        lbnome = new JLabel("Nome:");
        txnome = new JTextField(20);
        
        lbDescricao = new JLabel("Descrição:");
        txdescricao = new JTextField(20);
        
        lbpreco = new JLabel("Preço:");
        txpreco = new JTextField(10);
        
        btnGravar = new JButton("Gravar");
        btnCarregar = new JButton("Calcular");
        btnExcluir = new JButton("Excluir");
        
        
        //inserção na tela
        this.add(img);
        this.add(lbCod);
        this.add(txcod);
        
        this.add(lbnome);
        this.add(txnome);
        
        this.add(lbDescricao);
        this.add(txdescricao);
        
        this.add(lbpreco);
        this.add(txpreco);
        
        this.add(btnCarregar);
        this.add(btnGravar);
        this.add(btnExcluir);
    }
}
