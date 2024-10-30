package atividades;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = scan.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = scan.nextInt();
		
		System.out.println("Primeira doação de sangue ?");
		doacao = scan.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69 && doacao) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			} else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
		scan.close();
	}

}
