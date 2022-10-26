/*
Contruir un programa que, dado un numero total de horas, devuelve el numero de 
semanas, dias y horas equivalentes. por ejemplo. dado un total de 1000 hs debe mostrar
5 semanas, 6 dias y 16 hs
*/
package Operadores;

import java.util.Scanner;


public class Operadores07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int  horast, semanas, dias, horas;
        
        System.out.print("Ingrese la cantidad de horas a calcular: ");
        horast = entrada.nextInt();
        
        semanas = horast / 168;
        dias = horast%168 /24;
        horas = horast%24;
        
        System.out.println("\n El equivalente es:");
        System.out.println("Semanas: "+semanas);
        System.out.println("dias: "+dias);
        System.out.println("Horas: "+horas);
    }
    
}
