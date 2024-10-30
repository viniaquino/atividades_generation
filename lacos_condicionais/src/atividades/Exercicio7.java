package atividades;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		float num1, num2, resultado;
		int codOperacao;
		
		System.out.println("Digite o 1º número: ");
		num1 = scan.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		num2 = scan.nextFloat();
		
		System.out.println("Digite o código da operação de '1' a '6'");
		codOperacao = scan.nextInt();
		
		switch (codOperacao) {
		case 1:
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			break;
			
		case 2:
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			break;
			
		case 3:
			resultado = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado);
			break;
			
		case 4:
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;

		default:
			System.out.println("Operação Inválida!");
			return;
		}
		scan.close();
	}

}
