package encapsulamento;

public class principal {

	public static void main(String[] args) {
		Visibilidade visibilidade;
		visibilidade = new Visibilidade();
		
		visibilidade.setIdade(27);
		
		System.out.println("Idade : " + visibilidade.getIdade());
		
	}

}
