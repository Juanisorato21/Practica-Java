/*
Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, 
y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta y mostrar el número de intentos.
 */
package Bucles;

import javax.swing.JOptionPane;




public class Bucles05 {
    public static void main(String[] args) {
        
         int num,aleatorio, contador = 0;
        
         
         
         aleatorio = (int) (Math.random()*100); //genera un numero entre 0 a 100;
         // System.out.println(aleatorio); esta linea se activa para saber que numero es aleatoreo
         
         do{
             num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
             if (aleatorio > num){ //Si aleatorio es mayor a numer
                      System.out.println("Digite un numero mayor");
                     }
             else {
                 System.out.println("Ingrese un numero menor");
             }
           contador++; //aumentamos en uno el contador.
           
         }while(num != aleatorio);
         JOptionPane.showMessageDialog(null,"\nGenial! Adivinaste el numero en : "+contador+"intentos");
         
    }
    
}
