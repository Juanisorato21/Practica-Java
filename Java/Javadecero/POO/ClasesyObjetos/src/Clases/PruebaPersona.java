
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al contructor
        persona1.nombre = "Juani";
        persona1.apellido = "Sorato";
        
        persona1.obtenerInformacion();
        
        
        Persona persona2;
        persona2 = new Persona();
        persona2.nombre = "Facundo";
        persona2.apellido = "Garcia";
        persona2.obtenerInformacion();
        
    }
    
}
