/*
 Ejercicio 03: Leer numeros hasta que se ingrese un 0. para cada uno indicar si es par o impar
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles03 {
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(num !=0){
            if(num%2 ==0){
                System.out.println("El numero: "+num+" es positivo");
            }
            else{
                System.out.println("El numero: "+num+" es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
    }
    
}
