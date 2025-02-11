package parte2.ejercicio1;

import java.util.Scanner;

public class CuentaCorriente {

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	private String DNI;

	private String nombre;

	private double saldo;

	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	public CuentaCorriente(String dni, double saldoInicial) {

		if (dni != null && dni.isBlank()) {
			this.DNI = dni;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}

	}

	public CuentaCorriente(String dni, String nombre, double saldoInicial) {

		if (dni != null && dni.isBlank()) {
			this.DNI = dni;
		}

		if (nombre != null && nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}

	}

	public CuentaCorriente(String dni, String nombre, double saldoInicial, String nacionalidad) {

		if (dni != null && dni.isBlank()) {
			this.DNI = dni;
		}

		if (nombre != null && nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}

		this.nacion = Nacionalidad.valueOf(nacionalidad);

		switch (nacionalidad) {
		case "EXTRANJERA" -> this.nacion = Nacionalidad.EXTRANJERA;
		}

	}

	public boolean retirarDinero(double cantidad) {

		boolean hayDinero = false;

		if (cantidad <= this.saldo) {

			this.saldo -= cantidad;

			hayDinero = true;

		}

		return hayDinero;

	}

	public boolean ingresarDinero(double cantidad) {

		boolean esPositivo = false;

		if (cantidad > 0) {

			this.saldo += cantidad;

			esPositivo = true;
		}

		return esPositivo;

	}

	public String toString() {

		String informacion = "";

		informacion = ("Nombre: " + this.nombre + "\nDNI: " + this.DNI + "\nSaldo: " + this.saldo + "\nNacionalidad: "
				+ this.nacion);

		return informacion;

	}

	public boolean equals(CuentaCorriente cuenta) {

		boolean iguales = false;

		if (this.nombre.equals(cuenta) && this.DNI.equals(cuenta)) {
			iguales = true;
		}

		return iguales;

	}

}
