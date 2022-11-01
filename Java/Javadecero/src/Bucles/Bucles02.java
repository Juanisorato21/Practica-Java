/*
Ejercicio 2: leer un numero e indicar si es positivo o negativo.
el proceso se repetira hasta que se introduzca un 0.
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles02 {
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(num !=0){ //Mientras numero sea diferente a 0.
            if(num >0){
                System.out.println("El numero "+num+"es positivo");
            }
            else{ 
                System.out.println("El numero "+num+"es negativo");
            }
            
             num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
    }
    
}
