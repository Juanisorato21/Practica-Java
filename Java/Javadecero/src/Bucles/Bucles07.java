/*
 Ejercicio 7: Pedir numeros hasta que se introduzca uno negativo y calcular la media
 */
package Bucles;

import javax.swing.JOptionPane;

public class Bucles07 {
    public static void main(String[] args) {
        
    
    
    int num, elem =0,suma=0;
    float media;
    
   num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    
   
        while(num>=0){
            suma = suma + num;
            elem++;//aumentamos uno a elementos
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        if(elem== 0){
            System.out.println("Error. La division entre 0 no existe"); 
        }
        else{
            media= (float)suma/elem;
            System.out.println("La medio o prmedio es: "+media);
        }
    }
    
}
