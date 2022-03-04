/*
 * Entornos de desarrollo DAW
 * puig adam  * 
 */
package calculadora;

/**
 * Una calculadora sencilla como ejemplo para JUnit y Javadoc
 * @author estrella
 */
public class Calculadora {
 //implementa dos operaciones sencillas, la suma y la resta
 /**
  * Implementa la operacion suma de enteros
  * @param a
  * @param b
  * @return la suma de los dos valores de entrada
  */   
    public static int Sumar(int a, int b){
        return a+b;
    }
    /**
     * Implementa la resta de enteros
     * @param a
     * @param b
     * @return la resta de los dos valores
     */
    public static int restar(int a, int b){
        return a-b;
    }
    /**
     * Programa para probar los metodos de la calculadora
     *
     * @param args 
     */
    public static void main(String args[])
    {
        int num1=3, num2=5;
        System.out.println(Sumar(num1,num2));
        System.out.println(restar(num1,num2));
        
        
    }
}

