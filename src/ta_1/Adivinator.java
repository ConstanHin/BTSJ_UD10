package ta_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinator {

	private static Scanner scnr = new Scanner(System.in);
	// Attibuts
	private int inputNr;
	private int guessNr;
	private int intentosNr;
	private boolean adivinado;

	// Constructor
	public Adivinator() {
		this.guessNr = generarNumero();
		this.inputNr = -1;
		this.intentosNr = 0;
		this.adivinado = false;
	}

	// Getters Setters

	/**
	 * @return the intentosNr
	 */
	public int getIntentosNr() {
		return intentosNr;
	}

	/**
	 * @param intentosNr the intentosNr to set
	 */
	public void setIntentosNr(int intentosNr) {
		this.intentosNr = intentosNr;
	}

	/**
	 * @return the adivinado
	 */
	public boolean isAdivinado() {
		return adivinado;
	}

	/**
	 * @param adivinado the adivinado to set
	 */
	public void setAdivinado(boolean adivinado) {
		this.adivinado = adivinado;
	}

	// Methods
	/**
	 * Pide input de numero entero Devuelve el numero introducido si es un integro
	 * 
	 */
	public void pedirNumero() {
		int nr = -1;
		System.out.println("\n Intrduce un número:");

		try {
			nr = scnr.nextInt();
//			nr = Integer.parseInt(scnr.next());
		} catch (InputMismatchException e) {
			System.out.println("El valor introducido no se reconoce.");
			scnr.next();
		}

		this.inputNr = nr;

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
	 * Mostrar si el numero es mayor o menor. Si se adivina el número se le muestra
	 * al usuario
	 * 
	 * @param inputNr
	 * @param guessNr
	 */
	public void comprobarNumero() {

		if (this.inputNr < this.guessNr) {
			System.out.println("El numero que buscas es -Mayor-");
			this.adivinado = false;
		} else if (this.inputNr > this.guessNr) {
			System.out.println("El numero que buscas es -menor-");
			this.adivinado = false;
		} else {
			System.out.println("Has adivinado! El número es '" + this.guessNr + "'. Felicidades!");
			this.adivinado = true;
		}

	}

	public void sumarIntento() {
		this.intentosNr++;
	}
	
	public void mostrarIntro() {
		System.out.println("¡Adivina el número!");
		System.out.println("Introduce un número entre 1 y 500, ambos incluidos."
				+ "\n¡Cada intento cuenta! Suerte!");
	}
}
