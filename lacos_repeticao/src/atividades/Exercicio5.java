package atividades;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numero, soma = 0;
		boolean repetir = false;
		
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero >= 0) {
				soma += numero;
			}
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		scanner.close();
	}
	
}
