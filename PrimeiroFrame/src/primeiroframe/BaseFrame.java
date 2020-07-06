/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroframe;
import javax.swing.JFrame;
/**
 *
 * @author Jardriel Sousa
 */
public abstract class BaseFrame extends JFrame {
    public BaseFrame() {
        this("PROG II");
    }
    
    public BaseFrame(String title) {
        this(title, 400, 300);
    }
    
    public BaseFrame(String title , int width , int height){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setSize(width, height);
    }
}
