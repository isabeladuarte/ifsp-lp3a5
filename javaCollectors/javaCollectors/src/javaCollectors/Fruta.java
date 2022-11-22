package javaCollectors;

public class Fruta {
	String nome;
	String cor;
	
	@Override
	public String toString() {
	      return "nome='" + nome + '\'' +
	                ",cor=" + cor;
	}
	
	public Fruta(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
}