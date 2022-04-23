package ta_3;

import java.util.Random;

import exception.MyCustomException;

public class RandomNumber {

	// Attributes
	private int numeroRandom = new Random().nextInt(999);

	// Constructor
	public RandomNumber() {
	}

	/**
	 * Genera número aleatorio
	 */
	public void generarNumeroAleatorio() {
		System.out.println("Generando número aleatorio...");
		this.numeroRandom = new Random().nextInt(999);
	}

	/**
	 * Throw exception mostrando el número y si es par o impar
	 */
	public void comprobarParImpar() {
		String message = "El número aleatorio es:" + this.numeroRandom;
		try {
			if (this.numeroRandom % 2 == 1) {
				throw new MyCustomException(message + ".\nEs impar.");
			} else {
				throw new MyCustomException(message + ".\nEs par.");
			}

		} catch (MyCustomException e) {
			System.out.println(e);
		}
	}

}
