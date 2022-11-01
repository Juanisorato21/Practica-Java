/*
 Ejercicio 8: Pedir un numero n, y mostrar todos los numeros del 1 al n.
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles08 {
    public static void main(String[] args) {
        
        int num, i;
        
        num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        i = 1;
        
        while(i <= num ){
            System.out.println (i);
            i++;
        
    }
    }
}
