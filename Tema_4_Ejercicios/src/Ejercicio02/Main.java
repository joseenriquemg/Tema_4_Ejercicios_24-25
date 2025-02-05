package Ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona();
		
		String dni = "";

		String nombre = "";

		String apellidos = "";

		int edad = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su DNI:");

		persona.dni = sc.next();

		System.out.println("Introduzca su nombre:");

		persona.nombre = sc.next();

		System.out.println("Introduzca sus apellidos:");

		persona.apellidos = sc.next();

		System.out.println("Introduzca su edad:");

		persona.edad = sc.nextInt();
		
		Persona.guardaDatos(dni, nombre, apellidos, edad);

		sc.close();

	}

}
