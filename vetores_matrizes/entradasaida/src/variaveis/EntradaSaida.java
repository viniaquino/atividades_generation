package variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Entre com seu nome: ");
		ler.skip("\\R?");
		nome = ler.nextLine().toUpperCase();
		
		System.out.println("Sua idade é: " + idade + " anos e seu nome é: " + nome);
	}

}
