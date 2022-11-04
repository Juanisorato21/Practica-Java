
package Aritmetica;

public class Aritmetica {
    //Atributos de la clase.
    int a;
    int b;
    
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a+b;
        System.out.println("Resultado: "+resultado);
    }
    
    //segundo Metodo
    public int sumarConRetorno(){
        int resultado = a+b;
        return resultado;
    }
    
    //tercer metodo
    public int sumarConArgumentos( int a , int b){
      this.a = a; //El argumento se asigna al atributo this.a
      this.b = b;
      //return a+b;
      return this.sumarConRetorno();
    }
    
}
