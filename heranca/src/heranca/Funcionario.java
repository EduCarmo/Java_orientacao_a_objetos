package heranca;

public class Funcionario extends Pessoas{
	
	public Funcionario(String fnome, String fcpf, int fidade) {
		super(fnome, fcpf, fidade);
	}
	
	public int salario;
	public String departamento;
}
