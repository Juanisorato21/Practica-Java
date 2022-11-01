/*
 Ejercicio 4: Pedir numeros hasta que se teclee un numero negativo.
mostrar cuantos numeros se han introducido.
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles04 {
    public static void main(String[] args) {
        int num,contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(num >=0){ //mientras numero no sea negativo
            contador++; //aumentamos en uno el contador
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            
        }
        System.out.println("a introducido "+contador+" de numeros positivos");
        JOptionPane.showMessageDialog(null,"a introducido "+contador+" de numeros positivos");
        
    }
    
}
