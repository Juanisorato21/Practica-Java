/*
El operador ternario '?'
valor = (condicional) ? valor1 : valor2
*/
package Condicionales;

import javax.swing.JOptionPane;


public class TeoriaCondicionales3 {
    public static void main(String[] args) {
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        mensaje = (numero%2 == 0) ? "Es par" : "Es Impar";
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
