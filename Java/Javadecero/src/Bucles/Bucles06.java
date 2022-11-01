/*
 Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.

 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles06 {
    public static void main(String[] args) {
        
        int num, suma = 0;
        
        
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            
            suma = suma+num; // suma (0)+num(1)
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: "+suma);
        
        }
}
