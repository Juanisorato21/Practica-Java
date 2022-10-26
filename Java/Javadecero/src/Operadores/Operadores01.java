//Hacer un programa que calcule e imprima la suma de tres calificaciones
package Operadores;

import java.util.Scanner;


public class Operadores01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, suma, prom;
        
        System.out.print("Digite 3 calificaciones: ");
        nota1 = entrada.nextInt();
        nota2 = entrada.nextInt();
        nota3 = entrada.nextInt();
        
        suma = nota1 + nota2 + nota3; //sumamos las tres notas
        prom = suma/3; 
        
        System.out.println("\n La suma de las notas son: "+suma);
        System.out.println("\n El promedio de las notas es: "+prom);
    }
    
}
