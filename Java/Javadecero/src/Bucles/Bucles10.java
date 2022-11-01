/*
 Ejercicio 10: pedir 10 numeros y escribir la suma total
 */
package Bucles;

import javax.swing.JOptionPane;

public class Bucles10 {
    public static void main(String[] args) {
        int num,suma = 0;
        
        for(int i=1; i<=10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += num; //suma interactiva
        }
        System.out.println("La suma es "+suma);
    }
        
}
