/*
Hacer un programa que leea un numero entero y muestre si el numero es
multiplo de 10.
*/
package Condicionales;

import javax.swing.JOptionPane;

public class Condicionales01 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: ")); //Pido al usuario el valor de numero
        
        
       if(numero%10 == 0){
           JOptionPane.showMessageDialog(null, "El numero digitado es multiplo de 10");
          
       }
       else
           JOptionPane.showMessageDialog(null, "El numero digitado no es multiplo de 10");
    }
    
}
