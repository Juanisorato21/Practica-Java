/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. suponiendo que todos 
los meses son de 30 dias
*/
package Condicionales;

import javax.swing.JOptionPane;


public class Condicionales09 {
    public static void main(String[] args) {
        
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de año: "));
        
        
        if (dia>=1 && dia<=30){
            if(mes>=1 && mes<=12){
                if(año != 0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto");
        }
        
    }
    
}
