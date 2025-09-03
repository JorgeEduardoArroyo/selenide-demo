package mx.quality.services.testing.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.println("\nCalculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Raiz Cuadrada");
            System.out.println("6. Salir");
            System.out.print("\n¿Qué opción requieres? ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }

            if (opcion == 6) {
                System.out.println("Saliendo...");
                break;
            }

            
            int a = 0;
            int b = 0;
            if (opcion == 5) {
                System.out.print("Valor número: ");
                a = Integer.parseInt(scanner.nextLine());
            }
            else {
                System.out.print("Valor primer número: ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("Valor segundo número: ");
                b = Integer.parseInt(scanner.nextLine());
            }

            int resultado = 0;
            double res = 0;
            
            switch (opcion) {
                case 1:
                    Suma suma = new Suma();
                    resultado = suma.suma(a, b);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    Resta resta = new Resta();
                    resultado = resta.resta(a, b);
                    System.out.println("Resultado de la resta: " + resultado);              	
                    break;
                case 3:
                    Multiplicacion multi = new Multiplicacion();
                    resultado = multi.multiplicar(a, b);
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    Division div = new Division();
                    res = div.division(a, b);
                    System.out.println("Resultado de la división: " + res);
                    break;
                case 5:
                    RaizCuadrada raiz = new RaizCuadrada();
                    res = raiz.raiz(a);
                    System.out.println("Resultado de la raiz cuadrada: " + res);
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
        
    }
	
}
