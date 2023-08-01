package exercicio;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1, v2;
		Mensagem text = new Mensagem();
		
		System.out.println("Digite um valor");
		v1 = input.nextInt();
		System.out.println("Digite um valor");
		v2 = input.nextInt();
		
		
		Mensagem somar = new Mensagem(v1, v2);
		
		
		
		System.out.println("A soma é " + somar.getNumero());

	}

}
