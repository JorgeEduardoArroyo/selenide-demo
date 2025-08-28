package mx.quality.services.testing.calculadora;

public class Calculadora {

    public static void main(String[] args) {
    	
    	int resultado = 0;
    	
    	//// suma
    	Suma suma = new Suma();
        resultado = suma.suma(3, 5);
        System.out.println("Resultado de la sua: " + resultado);
        
        //// resta
        
  
        //// multiplicacion
    	Multiplicacion multiplicaion = new Multiplicacion();
        resultado = multiplicaion.multiplicar(3, 5);
        System.out.println("Resultado de la multiplicación: " + resultado);
        
    }
	
}
