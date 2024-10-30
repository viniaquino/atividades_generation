package atividades;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String nome, cargo;
		int codCargo;
		float salario, reajuste, novoSal;
		
		System.out.println("Digite o nome do colaborador: ");
		nome = scan.nextLine();
		
		System.out.println("Digite de o código do cargo de '1' a '6'");
		codCargo = scan.nextInt();
		
		System.out.println("Digite o salário do colaborador selecionado: ");
		salario = scan.nextFloat();
		
		switch (codCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10F;
			break;
			
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07F;
			break;
			
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09F;
			break;
			
		case 4: 
			cargo = "Motorista";
			reajuste = 0.06F;
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05F;
			break;
			
		case 6: 
			cargo = "Técnico de TI";
			reajuste = 0.08F;
			break;

		default:
			System.out.println("Código inválido!");
			scan.close();
			return;
		}
		
		novoSal = salario + (reajuste * salario);
		
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Novo Salário: R$ %.2f\n", novoSal);
		
		scan.close();
	}

}
