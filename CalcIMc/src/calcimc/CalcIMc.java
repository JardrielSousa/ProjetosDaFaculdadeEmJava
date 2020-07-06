package calcimc;
import javax.swing.JOptionPane;
/**
 * @author Jardriel Sousa
 */
public class CalcIMc {

    public static void main(String[] args) {
        //variaveis 
        CalculoImc CalculoImc = new CalculoImc();
        double peso , altura , calculo ;
        
        //pega o que foi digitado pelo usuario
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        
        //pega o que foi digitado pelo usuario
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o Altura"));
        
        //Faz o calculo
        calculo = CalculoImc.CalculoImc(altura, peso);
        
        //Estrutura de Decisão com o resultado mostra um resultado
        if(calculo < 16.99){
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso!!");
        }
        else if(calculo > 17 && calculo < 18.4){
        JOptionPane.showMessageDialog(null, "Abaixo do peso!!");
        } 
        else if(calculo > 18 && calculo < 24.99){
        JOptionPane.showMessageDialog(null, "peso Normal!!");
        }
        else if(calculo > 25 && calculo < 29.99){
        JOptionPane.showMessageDialog(null, "Acima do Peso!!");
        }
        else {
        JOptionPane.showMessageDialog(null, "Obeso!!");    
        }
    }
    
}
