package classes_abstratas;

public class Cachorro extends Animal implements Mamifero{

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Cachorro comendo ");
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println("Mamifero andando " + passos);
	}

}
