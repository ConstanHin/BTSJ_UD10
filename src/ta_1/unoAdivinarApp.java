package ta_1;

public class unoAdivinarApp {

	public static void main(String[] args) {
		
		int nrIntentos = 0;

		boolean adivinado = false;
		
		// Mostrar por pantalla las instrucciones
		System.out.println("Tienes que adivinar el número.");
		System.out.println("Introduce un número entre 1 y 500, ambos incluidos."
				+ "\n¡Cada intento cuenta! Suerte!");

		// Generar numero entre 1-500
		int numeroAdivinar = Controller.generarNumero();

		do {
			// Pedir al usuario introducir un numero por pantalla
			int inputNr = Controller.pedirNumero();

			/*
			 * Mostrar si el numero es mayor o menor Devuelve false si no has adivinado el
			 * numero. Devuelve true si se ha adivinado
			 */
			adivinado = Controller.comprobarNumero(inputNr, numeroAdivinar);

			// Sumar el número de intentos y mostrarlo por consola
			nrIntentos++;			
			System.out.println("Intentos: " + nrIntentos);
			
			// Jugar mientras el número no se haya adivinado
		} while (!adivinado);
		

	}

}
