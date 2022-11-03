/*
 Ejercicio 12: Pedir un numero y calcular su factorial.
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles12 {
    public static void main(String[] args) {
        
        int num;
        long factorial=1;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        for(int i=1 ; i<=num; i++){
            factorial *= i; //multiplicacion interactiva.
        }
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
    
}
