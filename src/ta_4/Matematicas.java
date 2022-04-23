package ta_4;

import java.util.Scanner;

public class Matematicas {

	private Scanner scnr = new Scanner(System.in);
	// Attributes
	private int nrSelection;

	public Matematicas() {
	}

	/**
	 * Menu
	 */
	public void menu() {
		System.out.println("¿Que operación quieres realizar?");
		System.out.println("Introduce el número del menú y pulsa Enter:\n");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Potencia");
		System.out.println("6. Raiz cuadrada");
		System.out.println("7. Raiz cubica");

		try {
			this.nrSelection = Integer.parseInt(scnr.next());
			checkMenuInput(this.nrSelection);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Ha ocurrido un problema con el valor introducido.");
		}
	}
	

	/**
	 * Check menu selection option
	 * 
	 * @param selectionMenu
	 */
	private void checkMenuInput(int selectionMenu) {
		switch (selectionMenu) {
		case 1:
			suma();
			break;
		case 2:
			resta();

			break;
		case 3:
			multiplicar();

			break;
		case 4:
			dividir();

			break;
		case 5:
			potencia();

			break;
		case 6:
			raizCuadrada();

			break;
		case 7:
			raizCubica();

			break;

		default:
			System.out.println("No existe la opción introducida.");
			System.out.println("Pulsa ENTER para intentar de nuevo!");
			scnr.next();
			break;
		}
	}

	/**
	 * Sumar
	 */
	private void suma() {
		double result = 0;
		double addend1 = 0;
		double addend2 = 0;

		try {
			System.out.println("Introduce el primer número:");
			addend1 = scnr.nextDouble();
			System.out.println("Introduce el segundo número:");
			addend2 = scnr.nextDouble();

			result = addend1 + addend2;

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println(addend1 + " + " + addend2 + " = " + result);
		System.out.println("=======================================");
	}

	/**
	 * Restar
	 */
	private void resta() {
		double result = 0;
		double addend1 = 0;
		double addend2 = 0;

		try {
			System.out.println("Introduce el primer número:");
			addend1 = scnr.nextDouble();
			System.out.println("Introduce el segundo número:");
			addend2 = scnr.nextDouble();

			result = addend1 - addend2;

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println(addend1 + " - " + addend2 + " = " + result);
		System.out.println("=======================================");
	}

	/**
	 * Multiplicar
	 */
	private void multiplicar() {
		double result = 0;
		double addend1 = 0;
		double addend2 = 0;

		try {
			System.out.println("Introduce el primer número:");
			addend1 = scnr.nextDouble();
			System.out.println("Introduce el segundo número:");
			addend2 = scnr.nextDouble();

			result = addend1 * addend2;

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println(addend1 + " * " + addend2 + " = " + result);
		System.out.println("=======================================");
	}
	
	/**
	 * Dividir
	 */
	private void dividir() {
		double result = 0;
		double addend1 = 0;
		double addend2 = 0;

		try {
			System.out.println("Introduce el primer número:");
			addend1 = scnr.nextDouble();
			System.out.println("Introduce el segundo número:");
			addend2 = scnr.nextDouble();

			result = addend1 / addend2;

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println(addend1 + " / " + addend2 + " = " + result);
		System.out.println("=======================================");
	}
	
	/**
	 * Potencia
	 */
	private void potencia() {
		double result = 0;
		double addend1 = 0;
		double addend2 = 0;

		try {
			System.out.println("Introduce la base:");
			addend1 = scnr.nextDouble();
			System.out.println("Introduce el exponente:");
			addend2 = scnr.nextDouble();

			result = Math.pow(addend1, addend2);

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println(addend1 + " ^ " + addend2 + " = " + result);
		System.out.println("=======================================");
	}
	
	/**
	 * Raiz Cuadrada
	 */
	private void raizCuadrada() {
		double result = 0;
		double numero = 0;

		try {
			System.out.println("Introduce el número:");
			numero = scnr.nextDouble();

			result = Math.sqrt(numero);

		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("=======================================");
		System.out.println("Raiz cuadrada de " + numero + " = " + result);
		System.out.println("=======================================");
	}

	/**
	 * Raiz cubica
	 */
	private void raizCubica() {
		double result = 0;
		double numero = 0;
		
		try {
			System.out.println("Introduce el número:");
			numero = scnr.nextDouble();
			
			result = Math.cbrt(numero);
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("=======================================");
		System.out.println("Raiz cubica de " + numero + " = " + result);
		System.out.println("=======================================");
	}
	
	/**
	 * Cerrar scanner
	 */
	public void closeScanner() {
		this.scnr.close();
	}

}
