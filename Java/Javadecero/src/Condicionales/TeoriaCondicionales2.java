/*
La sentencia Switch:

Switch(dato) {
case 1: Intruciones1;
        break;
case 2 : Intrucciones2;
        break;
case n: intruccionesN;
        break;
default: casoContrario;
        break;
}
*/
package Condicionales;

import javax.swing.JOptionPane;

public class TeoriaCondicionales2 {
    public static void main(String[] args) {
        
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un N° entre 1 y 5: "));
        
        switch(dato){
            case 1 -> JOptionPane.showMessageDialog(null ,"Este es el numero 1");
            case 2 -> JOptionPane.showMessageDialog(null ,"Este es el numero 2");
            case 3 -> JOptionPane.showMessageDialog(null, "Este es el numero 3");
            case 4 -> JOptionPane.showMessageDialog(null, "Este es el numero 4");
            case 5 -> JOptionPane.showMessageDialog(null, "Este es el numero 5");
            default -> JOptionPane.showMessageDialog(null, "El numero no esta registrado");
            
            
    }
    }
}
    

