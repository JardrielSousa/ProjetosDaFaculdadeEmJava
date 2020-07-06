/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroframe;

import javax.swing.JLabel;

/**
 *
 * @author Jardriel Sousa
 */
public class PrimeiraJanela extends BaseFrame{
    JLabel meulabel;
    public PrimeiraJanela (){
        super("Com Titulo Definido");
        this.initialize();
    }
    public void initialize(){
        this.setLayout(null);
        this.meulabel = new JLabel("Ola Mundo");
        this.meulabel.setBounds(100, 100,200,200);
        this.add(meulabel);
    }
}
