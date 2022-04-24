package ta_5;

public class Password {

	// Attributs
	private int longitud;
	private String contrasena;

	// Constructor

	public Password() {
		this.longitud = 8;
		this.contrasena = generarPassword();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	// Getters Setters

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	// Methods
	public boolean esFuerte() {

		int nrMinus = 0;
		int nrMayus = 0;
		int nrNumeros = 0;

		for (int i = 0; i < contrasena.length(); i++) {
			char caracter = contrasena.charAt(i);
			if (caracter >= 'A' && caracter <= 'Z') {
				nrMayus++;
			} else if (caracter >= 'a' && caracter <= 'z') {
				nrMinus++;
			} else {
				nrNumeros++;
			}
		}

		// Condiciones para que sea considera una contraseña fuerte
		if (nrMayus > 2 && nrMinus > 1 && nrNumeros > 5)
			return true;
		return false;
	}

	/**
	 * Generar Password con minusculas, mayusculas y numeros
	 */
	public String generarPassword() {
		// String de la contraseña
		String pass = "";
		// Cada character de la contraseña
		char character = 48;

		// Componer contraseña
		for (int i = 0; i < this.longitud; i++) {
			// Probabilidad de minuscula, mayuscula y numero.
			int probabilidad = Helpers.random(0, 100);

			if (probabilidad < 20) {
				// minuscula
				character = (char) Helpers.random(97, 122);
			} else if (probabilidad > 35) {
				// number
				character = (char) Helpers.random(48, 57);
			} else {
				// mayuscula
				character = (char) Helpers.random(65, 90);
			}

			pass += character;
		}
		return pass;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasena=" + contrasena + "]";
	}

}
