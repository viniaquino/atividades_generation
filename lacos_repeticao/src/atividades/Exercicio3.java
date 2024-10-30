package atividades;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean continua = true;
		int idade, menor21 = 0, menor50 = 0;
		
		while (continua) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			
			if (idade <= 0) {
				System.out.println("Idade Inválida!");
				break;
			}
			
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				menor50++;
			} 
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menor21);
		System.out.println("\nTotal de pessoas menores de 50 anos: " + menor50);
	}
	

}
