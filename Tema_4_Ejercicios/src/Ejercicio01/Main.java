package Ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Variable para recoger la cantidad a sumar.
		int numero = 0;

		// Variable opara recoger la posicion del punto para operar
		String opcion = "";

		// Variable para recoger el punto para operar
		int eleccionPunto;

		// Creamops un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos nuestros tres puntos.
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		// Definimos los valores de nuestros puntos.
		p1.posicionX = 5;
		p1.posicionY = 0;

		p2.posicionX = 10;
		p2.posicionY = 10;

		p3.posicionX = -3;
		p3.posicionY = 7;

		// Mostramos los puntos al usaurio.
		Punto.mostrarPuntos(p1, p2, p3);

		// Preguntamso al usuario cuanto desea sumar.
		System.out.println("¿Que cantidad desea sumar?");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Solicitamos al usuario si desea operarr con las X o las Y
		System.out.println("¿A que termino posicion deseas sumarle? Xpunto o Ypunto");

		// Leemos del teclado.
		opcion = sc.next();

		// Solicitamos al usaurio el punto con el que desea operar.
		System.out.println("¿Con que punto deseas operar?");

		// Leemos el punto del teclado.
		eleccionPunto = sc.nextInt();

		// Elegiremos el punto con un switch y realizamos la suma.
		switch (eleccionPunto) {

		case 1 -> {

			Punto.sumaPuntos(numero, opcion, p1);

		}
		case 2 -> {

			Punto.sumaPuntos(numero, opcion, p2);

		}
		case 3 -> {

			Punto.sumaPuntos(numero, opcion, p3);

		}
		}
		
		// Mostramos el resultado.
		Punto.mostrarPuntos(p1, p2, p3);
	}

}
