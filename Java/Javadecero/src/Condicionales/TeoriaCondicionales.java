/*
La sentencia if:

if (condicional){
    Intruccion1;
}
else{
    Intruccion2;
}
*/

/*
== :Igualdad 
!= :Diferencia
<: Menor
<= Menor o igual
>: Mayor
>= Mayor o igual

*/
package Condicionales;

import javax.swing.JOptionPane;

 class TeoriaCondicionales {
     public static void main(String[] args) {
         int numero, dato = 5; //defino la variable numero y asigno valor a dato
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); //Pido que ingresen el valor de numero
         
        if(numero == dato){  //si numero es igual a dato
             JOptionPane.showMessageDialog(null, "El numero es 5");
            
        }
        else{
             JOptionPane.showMessageDialog(null, "El numero es diferente a 5");
        }
     }
    
}
