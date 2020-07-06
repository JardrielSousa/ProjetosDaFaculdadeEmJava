/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Jardriel Sousa
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*por Herança 
        ParalelismoPorherenca p1 = new ParalelismoPorherenca("Processo 1", 1, 10);
        ParalelismoPorherenca p2 = new ParalelismoPorherenca("Processo 2", 11, 20);
        
        p1.start();
        p2.start();
        */
        
        ParalelismoPorInterface I1 = new ParalelismoPorInterface("Interface 1", 1, 10);
        ParalelismoPorInterface I2 = new ParalelismoPorInterface("Interface 2", 11, 20);
        
        Thread p1 = new Thread(I1);
        Thread p2 = new Thread(I2);
        
        p1.start();
        p2.start();
        
        System.out.println("Fim");
    }
    
}
