/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroframe;

import javax.swing.JButton;

/**
 *
 * @author Jardriel Sousa
 */
public class FlowLayout extends BaseFrame{
     private static final int NUM_BOTOES = 3;
    protected JButton botoes[];
    
    public FlowLayout() {
        super();
        this.initialize();
        this.setVisible(true);
    }

    private FlowLayout(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void initialize() {
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER_ALIGNMENT);
        this.setLayout(layout);
        
        this.botoes = new JButton[NUM_BOTOES];
        for (int i = 0; i < this.botoes.length; i++) {
            this.botoes[i] = new JButton("Botão " + i);
            this.add(this.botoes[i]);
        }
    }    

    private void setLayout(FlowLayout layout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}