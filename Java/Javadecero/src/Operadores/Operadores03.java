/*
Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
Juan tienen la mitad de lo que posee Luis y guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los tres.
*/
package Operadores;

import java.util.Scanner;


public class Operadores03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.print("Digite la cantidad de dinero que tienen Guillermo: ");
        guillermo = entrada.nextFloat();
        System.out.println(" Guillermo tiene: "+guillermo);
        
        luis = guillermo /2;
        System.out.println("Luis tiene: "+luis);
        
        juan = (guillermo + luis) /2;
        System.out.println("Juan tiene: "+juan);
        
        total = guillermo + luis + juan;
        System.out.println("Los tres tienen: "+total);
    }
    
}
