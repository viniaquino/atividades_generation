package atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int par = 0, impar = 0;
		
		boolean repetir = false;
		do {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");
			int numero = scanner.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + par);
		System.out.println("Total de números impares: " + impar);
		
		System.out.println("\nDeseja repetir o processo ? (s/n): ");
		String resposta = scanner.next();
		
		repetir = resposta.equalsIgnoreCase("s");
		
		} while (repetir);
		
		scanner.close();
	}

}
