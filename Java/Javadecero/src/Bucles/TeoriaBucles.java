/*
Ciclo while

while(condicion){
    Intruccion;
}

*/
package Bucles;

import java.util.Scanner;




public class TeoriaBucles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1, contador; 
        
        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        
        while(i<=contador){ //le decimos que cuente hasta el 10
            System.out.println(i);
            i ++;// si queremos que valla de 1 a 10. si ponemos i--; va a contar de 10 a 1.
            
        }
    }
}
