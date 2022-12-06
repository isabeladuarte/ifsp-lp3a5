package optionalExceptions;

public class OptionalExceptions {

	public class OpException extends Exception {

		private String customMessage;

		public OpException(String customMessage) {
			super(customMessage);
			this.customMessage = customMessage;

		}
	}

	public static void main(String[] args) {
		try {
			new OptionalExceptions().test();
		} catch (Exception e) {
			System.out.println("A mensagem de excecao é " + e.getMessage());
		}
	}

	public void test() throws OpException {
		try {
			int i = 1 / 0;
		} catch (Exception e) {
			throw new OpException(e.getMessage());
		}
	}

}