/*
Hcaer un programa que 
*/
package Pruebas;

import javax.swing.JOptionPane;


public class Prueba2 {
  
     
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Hola Juancito, por favor inicia sesion");
  
        String contraseña=  JOptionPane.showInputDialog(null, "Ingrese su contraseña: ");
   
        final int INTENTOS = 3;
         
        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Introduce una contraseña");
  
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                JOptionPane.showMessageDialog(null,"Accediendo a su cuenta");
                acierto=true;
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Su contraseña no coincide, intentelo nuevamente");
            }
            
            
        }
    }
}
    
    

