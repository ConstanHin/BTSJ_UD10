package ta_1;

public class unoAdivinarApp {

	public static void main(String[] args) {
		
		// Instanciar objeto adivinator
		
		Adivinator adv = new Adivinator();
				
		// Mostrar por pantalla las instrucciones
		adv.mostrarIntro();

		do {
			// Pedir al usuario introducir un numero por pantalla
			
			adv.pedirNumero();
			
			/*
			 * Muestra si el n�mero es menor, mayor o correcto.	
			 */
			adv.comprobarNumero();

			// Sumar el n�mero de intentos y mostrarlo por consola
			adv.sumarIntento();
			System.out.println("Intentos: " + adv.getIntentosNr());
			
			// Jugar mientras el n�mero no se haya adivinado
		} while (!adv.isAdivinado());
		

	}

}
