/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcimc;

/**
 *
 * @author Jardriel Sousa
 */
public class CalculoImc {
 
     public double CalculoImc( double altura , double peso){
        double imc=0;
        imc = peso / (altura*altura);
        return imc;
    }
}
