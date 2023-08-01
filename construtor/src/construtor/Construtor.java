package construtor;

public class Construtor {
	
	private int numero;
	
	public Construtor() {
		System.out.println("Essa é uma menssagem do construtor");
	}
	
	public Construtor(int valor) {
		this.numero = valor;
	}
	
	public Construtor(int v1, int v2) {
		this.numero = v1 + v2;
	}
	
	public int getNumero() {
		return numero;
	}
	
	
}
