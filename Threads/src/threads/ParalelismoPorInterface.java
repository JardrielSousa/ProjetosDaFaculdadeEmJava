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
public class ParalelismoPorInterface implements Runnable{
    
    private String Nome ;
    private int Inicio ;
    private int Fim ;
    
    public ParalelismoPorInterface(String nome , int init , int fish){
    this.Nome = nome;
    this.Inicio = init;
    this.Fim = fish;
}
    @Override
    public void run(){
        for(int i=Inicio;i<Fim;i++){
            System.out.println("["+Nome+"]"+i);
        }
    }
    
}
