package ta_4;



public class mainCuatroApp {

	public static void main(String[] args) {
		
		// Instanciar clase
		Matematicas mate = new Matematicas();
		
		// Volver a mostrar el men� una vez acabada la operaci�n escogida
		for (int i = 0; i < 1; i++) {
			mate.menu();
		}
		
		// Finalizar programa
		System.out.println("Programa finalizado.");
		mate.closeScanner();		

	}

}
