/*
Ejercicio 03: Programa que lea un caracter por teclado y compruebe
si es una letra mayuscula.
*/
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales03 {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
        
        if(Character.isUpperCase (letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
    
}
