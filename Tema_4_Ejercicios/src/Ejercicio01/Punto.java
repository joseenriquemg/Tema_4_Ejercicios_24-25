package Ejercicio01;

public class Punto {

	// Variable que recoge las X de cada punto.
	private int posicionX;

	// Variable que recoge las Y de cada punto.
	private int posicionY;

	public void setXY(int x, int y) {
		
		
	
	}
	
	
	/**
	 * Creamos nuestro constructor Punto.
	 * 
	 * @param posicionX   Parametro para la posicionX.
	 * @param posicionY   Parametro para la posicionY.
	 */
	public Punto(int posicionX, int posicionY) {

		this.posicionX = posicionX;
		this.posicionY = posicionY;

	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * Metodo que muestra los puntos.
	 * 
	 * @param p1 Primer punto
	 * @param p2 Segundo punto
	 * @param p3 Tercer punto
	 */
	static public void mostrarPuntos(Punto p1, Punto p2, Punto p3) {

		System.out.println("(" + p1.posicionX + " , " + p1.posicionY + ")");
		System.out.println("(" + p2.posicionX + " , " + p2.posicionY + ")");
		System.out.println("(" + p3.posicionX + " , " + p3.posicionY + ")");

	}

	/**
	 * Metodo para sumar los puntos.
	 * 
	 * @param numero Recibe por parametro el nuemroa sumar.
	 * @param opcion Recibe si debe sumar a la posicion X o a la Y
	 * @param punto  Recibe el punto con el que se va a operar
	 */
	static public void sumaPuntos(int numero, String opcion, Punto punto) {

		switch (opcion) {

		case "Xpunto" -> {

			punto.posicionX = punto.posicionX + numero;

		}

		case "Ypunto" -> {

			punto.posicionY = punto.posicionY + numero;

		}
		}
		;

	}

}
