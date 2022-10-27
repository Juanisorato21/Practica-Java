/*
Ejercicio 2: Pedir dos numeros y decir cual es mayor o si son iguales
*/
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales02 {
    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo numero: "));
        
        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+num1);
        }
        else if (num1 < num2){
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+num2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }
    }
    
}
