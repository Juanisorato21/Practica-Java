/*
Ejercicio 04: Una compañia de ventas de autos usados, paga a su personal
de ventas un salario de $1000 menusales, mas una comision de $150 por cada carrovendido
cada mes el contador de la empresa ingresa en la computadora los datos pertinentes
hacer un programa que calcule e imprima el salario mensual de un vendedordado.
*/
package Operadores;

import java.util.Scanner;


public class Operadores04 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int salario;
        float comision,suma, total;
        
        salario = 1000;
        
        System.out.print("Ingrese la cantidad de autos venidos: ");
        comision = entrada.nextFloat();
        
        suma = 150 * comision;
        
        total= salario + suma;
        
        System.out.println("El sueldo a pagar es: "+total);
        
        
        
    }
    
}
