package classes_abstratas;

public class principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.setNome("Rex");
		System.out.println(c.getNome());
		
		c.andar();
		System.out.println(c.passos);
	}

}
