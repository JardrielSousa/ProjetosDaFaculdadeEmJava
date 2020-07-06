/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grid;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Jardriel Sousa
 */
public class GridCalc extends BaseGrid{
    private static final int NUM_BOTOES = 10;
    private JPanel painelSuperior, painelEsquerda, painelDireita;
    protected JButton botoes[];
    protected JButton comandos[];
    private JTextField textResultado;
    
    public GridCalc(){
        super();
        this.inicialize();
        this.PainelSuperior();
    }
    public void inicialize(){
        GridLayout layout = new GridLayout(4,4);
        this.setLayout(layout);
        this.botoes = new JButton[NUM_BOTOES];
        for (int i = 0; i < this.botoes.length; i++) {
            this.botoes[i] = new JButton(""+i);
            this.add(this.botoes[i]);
        }
    
    }
    public void PainelSuperior(){
        this.painelSuperior = new JPanel();
        this.painelSuperior.setLayout(new FlowLayout());
        
        this.textResultado = new JTextField(30);
        this.painelSuperior.add(this.textResultado);
        this.add("North",this.painelSuperior);
    }
}
