/*
La calificacion final de un estudiante de informatica se calcula
con base a las calificaciones de cuatro aspectos de su rendimiento academico:
participacion, primer examen, segundo examen y examen final. Sabiendo que las calificaciones anteriores entran a 
la calificacion final con ponderaciones del 10%, 25%, 25% y 40%.
Hacer un programa que calcule e imprima la calificacion final obtenida por el estudiante.
*/
//
package Operadores;

import java.util.Scanner;

public class Operadores05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float part, exam1, exam2, examf, nfin;
        //Pedimos los datos
        
        System.out.print("Digite la nota de participacion: ");
        part = entrada.nextFloat();
        
        System.out.print("Digite la nota del examen 1: ");
        exam1 = entrada.nextFloat();
        
        System.out.print("Digite la nota del examen 2: ");
        exam2 = entrada.nextFloat();
        
        System.out.print("Digite la nota del examen final: ");
        examf = entrada.nextFloat();
        
        //Sacamos los calculos
        part = 0.10f;
        exam1 = 0.25f;
        exam1 = 0.25f;
        examf = 0.40f;
        
        //Sumamos las notas
        nfin = part + exam1 + exam2 + examf;
        System.out.print("\n La nota final es: "+nfin);
        
    }
    
}
