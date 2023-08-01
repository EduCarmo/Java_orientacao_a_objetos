package heranca;

public class Pessoas {
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoas(String pnome, String pcpf, int pidade) {
		this.nome = pnome;
		this.cpf = pcpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
}
