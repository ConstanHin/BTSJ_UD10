package ta_5;

import java.util.Scanner;

public class mainCincoApp {

	public static void main(String[] args) {
				
		Scanner scnr = new Scanner(System.in);

		// Input n�mero de contrase�as
		System.out.println("Introduce la cantidad de contrase�as:");
		int cantidadPass = Integer.parseInt(scnr.next());
	
		// Input n�mero de caracteres
		System.out.println("Introduce la longitud de las contrase�as:");
		int longitudPass = Integer.parseInt(scnr.next());
				
		// Almacena passwords
		Password[] arrayPass = new Password[cantidadPass];
		// Array almacenamiento tipo de contrase�a fuerte o no
		boolean[] strongPass = new boolean[cantidadPass];
		
		// Almacenar contrase�as y si es fuerte o no
		for (int i = 0; i < arrayPass.length; i++) {
			Password password = new Password(longitudPass);
			arrayPass[i] = password;
			strongPass[i] = password.esFuerte();
			System.out.print(arrayPass[i].getContrasena() + " ");
			System.out.println(strongPass[i]);
		}
		
		System.out.println("Programa finalizado");
		scnr.close();
		
	}

}
