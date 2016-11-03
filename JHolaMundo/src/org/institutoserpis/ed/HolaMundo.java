package org.institutoserpis.ed;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
 		String nombre = scanner.nextLine();
 		System.out.println("Dime tu edad: ");
 		String edad = scanner.nextLine();
 		int edadNumero = Integer.parseInt(edad) + 1;
		System.out.println("Hola " + nombre + " tienes " + edad + " años y  el año que viene tendras " + edadNumero );
	}

}
