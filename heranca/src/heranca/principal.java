package heranca;

public class principal {

	public static void main(String[] args) {
		Funcionario f;
		f = new Funcionario("Eduardo", "55778899", 28);

		System.out.println("Nome do funcionario: " + f.getNome());
		System.out.println("Nome do funcionario: " + f.getCpf());
	}

}
