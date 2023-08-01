package classes_abstratas;

abstract class Animal {
	private String nome;
	
	public void setNome(String Anome) {
		this.nome = Anome;
	}
	public String getNome() {
		return nome;
	}
	
	public abstract void comer();
}
