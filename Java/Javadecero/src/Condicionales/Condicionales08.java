/*
 Ejercicio 8: pedir un numero entre 0 y 99999 y decir cuantas cifra tienen
 */
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales08 {
    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de 0 a 99999: "));
        
        if(num < 10){
            JOptionPane.showMessageDialog(null, "El numero: "+num+" tiene 1 cifra ");
        }
        else if (num <100){
            JOptionPane.showMessageDialog(null, "El numero: "+num+"tiene 2 cifras");
        }
        else if(num <1000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+"tiene 3 cifras");
        }
        else if(num <10000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+"tiene 4 cifras");
        }
        else if(num <100000){
            JOptionPane.showMessageDialog(null, "El numero: "+num+"tiene 5 cifras");
        }
    }
    
}
