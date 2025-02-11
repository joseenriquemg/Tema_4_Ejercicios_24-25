package parte2.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nombre = "";

		String DNI = "";

		double saldo = 0;

		String nacionalidad = "";

		double cantidad = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre:");

		nombre = sc.next();

		System.out.println("Introduzca su DNI:");

		DNI = sc.next();

		System.out.println("Introduzca su saldo inicial:");

		saldo = sc.nextDouble();

		System.out.println("Introduzca su nacionalidad");

		nacionalidad = sc.next();

		CuentaCorriente cuenta1 = new CuentaCorriente(DNI, nombre, saldo, nacionalidad);

		System.out.println("¿Que cantidad desea ingresar?");

		cantidad = sc.nextDouble();

		if (cuenta1.ingresarDinero(cantidad)) {

			System.out.println("Se han ingresado " + cantidad + " euros de manera correcta.");

		} else {

			System.out.println("No puede ingresar esta cantidad.");

		}
		
		System.out.println("¿Que cantidad desea retirar?");

		cantidad = sc.nextDouble();

		if (cuenta1.retirarDinero(cantidad)) {

			System.out.println("Se han retirado " + cantidad + " euros de manera correcta.");

		} else {

			System.out.println("No puede retirar esta cantidad.");

		}

	}

}
