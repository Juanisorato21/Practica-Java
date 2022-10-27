/*
Ejercicio 4: En PlazaShoping se hace un 20% de descuento a los clientes cuya compra supere los $300
¿Cual sera la cantidad a pagar una persona por su compra
 */
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales04 {
    public static void main(String[] args) {
        int  compra,desc, cfin;
       
        
        compra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de la compra: "));
        
        desc = (20 * compra)/100;
        cfin = (compra - desc);
        
       if (compra >= 300){
           JOptionPane.showMessageDialog(null, "Usted aplico al descuento y debe pagar: "+cfin);
       }
       else {
           JOptionPane.showMessageDialog(null, "Usted no aplica al descuento y debe pagar: "+compra);
       }
    }
    
}
