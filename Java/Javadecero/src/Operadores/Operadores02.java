//Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
// de sus horas trabajadas y su salario por hora.
package Operadores;

import java.util.Scanner;


public class Operadores02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int horassemanales;
        float salarioHoras, pago;
        
       System.out.print("Digite la cantidad de horas trabajadas: ");
       horassemanales = entrada.nextInt();
       System.out.print("Digite el valor de la hora: ");
       salarioHoras = entrada.nextFloat();
       
       pago = horassemanales * salarioHoras;
        System.out.println("Se le debe pagar: "+pago);
    }
    
}
