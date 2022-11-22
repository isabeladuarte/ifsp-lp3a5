package optionalExceptions;

public class Exception {
	String message;
	
	public Exception(String message) {
		System.out.println("Erro " + message);
	}
	
	public Exception(String message, Throwable cause) {
		System.out.println(cause);
	}
}
