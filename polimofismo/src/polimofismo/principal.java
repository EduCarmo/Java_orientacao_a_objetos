package polimofismo;

public class principal {

	public static void main(String[] args) {
		Transporte t = new Transporte();
		Veiculo v = new Veiculo();
		Carro c = new Carro();
		
		t.andar();
		v.andar();
		c.andar();
		v.andar(85);
		
		
	}

}
