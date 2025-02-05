package Ejercicio02;

public class Persona {

	String dni;
	
	String nombre;
	
	String apellidos;
	
	int edad;
	
	static public void guardaDatos (String dni, String nombre, String apellidos, int edad) {
		
		if (edad >= 18) {
		
		System.out.println(nombre + " " + apellidos + " con DNI " + dni + " es mayor de edad.");
		
		} else {
			
			System.out.println(nombre + " " + apellidos + " con DNI " + dni + " no es mayor de edad.");
			
		}
		
	}
	
	
}
