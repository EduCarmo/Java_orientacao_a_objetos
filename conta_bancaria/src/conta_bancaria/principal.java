package conta_bancaria;

public class principal {

	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		
		c1.nome_cliente = "Eduardo";
		c1.numero_conta = 21857;
		c1.saldo = 0;
		
		System.out.println("**********************************");
		System.out.println("Nome: " + c1.nome_cliente);
		System.out.println("Numero da conta: " + c1.numero_conta);
		System.out.println("Saldo da conta: " + c1.saldo);
		
		c1.depositar(5);
		
		System.out.println("**********************************");
		System.out.println("Nome: " + c1.nome_cliente);
		System.out.println("Numero da conta: " + c1.numero_conta);
		System.out.println("Saldo da conta: " + c1.saldo);
		
		c1.sacar(2);
		
		System.out.println("**********************************");
		System.out.println("Nome: " + c1.nome_cliente);
		System.out.println("Numero da conta: " + c1.numero_conta);
		System.out.println("Saldo da conta: " + c1.saldo);
		
		System.out.println("****** Verifica Saldo*******");
		System.out.println(c1.verificasaque(20));
	}

}
