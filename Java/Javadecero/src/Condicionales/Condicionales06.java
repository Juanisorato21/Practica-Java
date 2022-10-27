/*
Ejercicio 6: Hacer un programa que toma dos numeros y diga si ambos son pares o impares.
*/
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales06 {
    public static void main(String[] args) {
        
        int num1,num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
        
        if (num1%2== 0 && num2%2==0 ){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }
        else if(num1%2 !=0 && num2%2 !=0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
        else{
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
        }
    }
    
}
