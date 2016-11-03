package org.institutoserpis.ed;
import java.util.Random;
import java.util.Scanner;

public class adivina {

	private static Scanner scanner;

	public static void main (String[] args) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt (1000) +1;
		System.out.println("Adivina el numero oculto de 0 a 1000");
	    System.out.println (numeroAleatorio);
		scanner = new Scanner(System.in);
		int numero;
		int contador = 0;
		
		do {
			System.out.println("Introduce el numero: ");
			String line = scanner.nextLine();
			numero = Integer.parseInt(line);
			if (numero > numeroAleatorio) {
				System.out.println("El numero introducido es mayor, intentelo de nuevo.");
				contador++;

			}
			else if (numero < numeroAleatorio) {
					System.out.println("El numero introducido es menor, intentelo de nuevo");
					contador++;

			}
			
			
		} while (numero != numeroAleatorio); {
		System.out.println("El numero introducido ees el correcto");
		System.out.println("El numero de intentos es de: " +contador);
		}
	}
}


	
	
	
	

