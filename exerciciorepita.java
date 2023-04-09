
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author guilhermegomes
 */
public class ExercicioRepita {

    
    
    public static void main(String[] args) {
        // Declaração das variáveis 
        int n, s= 0;
        int tv=-1;
        int tp=-1;
        int ti=0;
        int maior=0;
        int media=0;
        do {    //Condiçaõ da parte lógica com estrutura de repetição para adicionar valores as variáveis        
            n= Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número:<br><em>(Valor 0 interrompe)</em></html>")); //Formatação das linhas no painel pré-pronto.
            s+=n;
            tv+=1;
            if (n%2==0) {//Conta lógica que calcula se o número é par ou impar.
                tp+=1;
                
            }else{
                ti+=1;
                
            }
            if(n>100){
                maior+=1;
            }
            

           
        } while (n != 0);//Condição da estrutura de repetição
        
        media = (int) (float) (s / tv); //Calculo da média utilizando os valores das variáveis.
        
         JOptionPane.showMessageDialog(null, "<html>Resultado final<br><hr>" //Toda formatação do painel.
                + "Somatório vale: &nbsp;<strong>" + s
                + ".</strong><br>Valores inseridos: &nbsp;<strong>" + tv
                + ".</strong><br>Valores pares: &nbsp;&nbsp;<strong>" + tp
                + ".</strong><br>Valores ímpares: &nbsp;<strong>" + ti
                + ".</strong><br>Valores acima de 100: &nbsp;<strong>" + maior
                 + ".</strong><br>Média dos valores: &nbsp;<strong>" + media + "</strong></html>"); 
         
    }
    
}
