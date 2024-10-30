package atividades;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int codOperacao;
		float saldo = 1000, vlrSaque, vlrDeposito;
		
		System.out.println("Digite o código da operação desejada "
		+ "---> 1 = Saldo, 2 = Saque, 3 = Depósito <---");
		codOperacao = scan.nextInt();
		
		switch (codOperacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f\n", saldo);
			break;
			
		case 2:
			System.out.println("Digite o valor do saque: ");
			vlrSaque = scan.nextFloat();
			
			if(vlrSaque <= saldo) {
				saldo -= vlrSaque;
				System.out.println("Operação - Saque");
				System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
			} else {
				System.out.println("Operação - Saque");
				System.out.println("Saldo Insuficiente!");
			}
			break;
			
		case 3:
			System.out.printf("Digite o valor do depósito: ");
			vlrDeposito = scan.nextFloat();
			
			saldo += vlrDeposito;
			System.out.println("Operação - Depósito");
			System.out.printf("Novo Saldo: R$ %.2f\n", saldo);
			break;

		default:
			System.out.println("Operação Inválida");
			break;
		}
		scan.close();
	}

}
