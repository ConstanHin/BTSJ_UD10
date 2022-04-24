package ta_5;

import java.util.Scanner;

public class mainCincoApp {

	public static void main(String[] args) {
				
		Scanner scnr = new Scanner(System.in);

		// Input número de contraseñas
		System.out.println("Introduce la cantidad de contraseñas:");
		int cantidadPass = Integer.parseInt(scnr.next());
	
		// Input número de caracteres
		System.out.println("Introduce la longitud de las contraseñas:");
		int longitudPass = Integer.parseInt(scnr.next());
				
		// Almacena passwords
		Password[] arrayPass = new Password[cantidadPass];
		// Array almacenamiento tipo de contraseña fuerte o no
		boolean[] strongPass = new boolean[cantidadPass];
		
		// Almacenar contraseñas y si es fuerte o no
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
