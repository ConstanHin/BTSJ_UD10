package exception;

public class MyCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 525076151377545053L;

	public MyCustomException(String errorMessage) {
		super(errorMessage);
	}

}
