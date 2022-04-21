package ta_1;

import java.util.Scanner;

public class Controller {
	private static Scanner scnr = new Scanner(System.in);

	/**
	 * Pide input de numero entero Devuelve el numero introducido si es un integro
	 * 
	 */
	public static int pedirNumero() {
		int nr = -1;
		System.out.println("\n Intrduce un número:");

		try {
			nr = Integer.parseInt(scnr.next());
		} catch (Exception e) {
			System.out.println("El valor introducido no se reconoce.");
		}

		return nr;

	}

	/**
	 * Genera un numero del 1 al 500
	 * 
	 * @return
	 */
	public static int generarNumero() {
		return Helpers.random(1, 500);
	}

	/**
	 * Mostrar si el numero es mayor o menor Devuelve false si no has adivinado el
	 * numero. Devuelve true si se ha adivinado
	 * 
	 * @param inputNr
	 * @param guessNr
	 */
	public static boolean comprobarNumero(int inputNr, int guessNr) {
		if (inputNr < guessNr) {
			System.out.println("El numero que buscas es -Mayor-");
		} else if (inputNr > guessNr) {
			System.out.println("El numero que buscas es -menor-");
		} else {
			System.out.println("Has adivinado! El número es '" + guessNr + "'. Felicidades!");
			return true;
		}

		return false;
	}
}
