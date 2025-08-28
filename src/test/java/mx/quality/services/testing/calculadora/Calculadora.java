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
            System.out.println("3. Multiplicacion");
            System.out.println("4. Salir");
            System.out.print("\n¿Qué opción requieres? ");

            // Leer opción
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }

            if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            }

            // Leer los dos valores
            System.out.print("Valor primer número: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Valor segundo número: ");
            int b = Integer.parseInt(scanner.nextLine());

            int resultado = 0;

            switch (opcion) {
                case 1:
                    Suma suma = new Suma();
                    resultado = suma.suma(a, b);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                	/*
                    Resta resta = new Resta();
                    resultado = resta.restar(a, b);
                    System.out.println("Resultado de la resta: " + resultado);
                    */
                	System.out.println("Opcion en construcción");
                    break;
                case 3:
                    Multiplicacion multi = new Multiplicacion();
                    resultado = multi.multiplicar(a, b);
                    System.out.println("Resultado de la multiplicación: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
        
    }
	
}
