package programacaoConcorrente;

public class OlaMundoRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Quem fala eh a: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Estamos na: " + Thread.currentThread().getName());
		Runnable runnable = new OlaMundoRunnable();

		Thread thread = new Thread(runnable);
		thread.start();

	}

}