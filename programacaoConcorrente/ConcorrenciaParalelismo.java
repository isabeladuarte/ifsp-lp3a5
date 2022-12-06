package programacaoConcorrente;

public class ConcorrenciaParalelismo {
	public class programacaoConcorrente {

		public static void ConcorrenciaParalelismo(String[] args) {

			class OlaParalelo implements Runnable {
				public void run() {
					System.out.println("Ola Paralelo!");
				}
			}
			Thread t1 = new Thread(new OlaParalelo());
			t1.start();
			System.out.println("Thread principal: " + Thread.currentThread().getName());
		}
	}
}
