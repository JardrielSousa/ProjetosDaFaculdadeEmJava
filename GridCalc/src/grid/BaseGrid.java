package grid;

import javax.swing.JFrame;

/**
 *
 * @author Jardriel Sousa
 */
public class BaseGrid extends JFrame{
    public BaseGrid() {
        this("Calc");
    }
    public BaseGrid(String title) {
        this(title, 250, 300);
    }
    public BaseGrid(String title , int width , int height){
        this.setSize(width, height);
        this.setTitle(title);
    }
}
