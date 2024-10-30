package atividades;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int codigo, qntd;
		float preco;
		String prod;
		
		System.out.println("Digite um número de código de 1 a 6: ");
		codigo = scan.nextInt();
		
		System.out.println("Digite a quantidade de produtos desejada: ");
		qntd = scan.nextInt();
		
		switch (codigo) {
		case 1:
			prod = "Cachorro Quente";
			preco = 10;
			break;
			
		case 2:
			prod = "X-Salada";
			preco = 15;
			break;
		
		case 3:
			prod = "X-Bacon";
			preco = 18;
			break;
			
		case 4:
			prod = "Bauru";
			preco = 12;
			break;
			
		case 5:
			prod = "Refrigerante";
			preco = 8;
			break;
			
		case 6:
			prod = "Suco de Laranja";
			preco = 13;
			break;

		default:
			System.out.println("Código inválido");
			scan.close();
			return;
		}
		
		float vlrTotal = qntd * preco;
		
		System.out.println("\nProduto: " + prod);
		System.out.printf("Valor total: R$ %.2f\n", vlrTotal);
	}

}
