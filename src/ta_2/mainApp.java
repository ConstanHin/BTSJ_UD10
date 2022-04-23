package ta_2;

import exception.MyCustomException;

public class mainApp {

	public static void main(String[] args) {
		
		// Throwing a custom exception
		
		int number = 1;
		
		try {
			if (number == 1) {
				throw new MyCustomException("This is a custom exception object");
			}
			
		} catch (MyCustomException e) {
			System.out.println(e);
		}
		
		System.out.println("Program end.");
		
	}

}
