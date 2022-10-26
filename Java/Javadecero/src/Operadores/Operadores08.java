/*
Contruir un programa que calcule e imprima las raices de la ecuacion de segundo grado de coeficientes reales. ax2+bx+c=0
 */
package Operadores;

import java.util.Scanner;

public class Operadores08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c, resultado1, resultado2;
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Digite el valor de c: ");
        c = entrada.nextDouble();
        
        
        resultado1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
        System.out.println("El resultado1 da: "+resultado1);
        resultado2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c))) / (2*a);
        System.out.println("El resultado2 da: "+resultado2);
        
    }
    
}
