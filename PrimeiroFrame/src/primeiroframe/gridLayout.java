/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroframe;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author Jardriel Sousa
 */
public class gridLayout extends BaseFrame{
    
     private static final int NUM_BOTOES = 10;
    protected JButton botoes[];
    
    public gridLayout() {
        super();
        this.initialize();
    }
    private void initialize() {
        GridLayout layout = new GridLayout(2, 5, 10, 10);
        this.setLayout(layout);
        
        this.botoes = new JButton[NUM_BOTOES];
        for (int i = 0; i < this.botoes.length; i++) {
            this.botoes[i] = new JButton("Botão " + (i + 1));
            this.add(this.botoes[i]);
        }
    
}
}