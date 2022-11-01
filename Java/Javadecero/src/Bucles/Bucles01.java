/*
 Ejercicio 1: Leer un numero y mostrar su cuadrado, 
repetir el proceso hasta que 
se introduzca un numero negativo
 */
package Bucles;

import javax.swing.JOptionPane;


public class Bucles01 {
    public static void main(String[] args) {
        int num,cuadrado;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        while(num >= 0){ //Mientras num sea 0 o positivo (1,2..1000)
            cuadrado= (int)Math.pow(num,2);
            
            JOptionPane.showMessageDialog(null, "El numero "+num+" elevado al cuadrado da como resultado: "+cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
    }
    
}
