package atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] numsInteiros = new int[10];
		int soma = 0;
		float media;
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < numsInteiros.length; i++) {
			System.out.print("Número na posição " + i + ": ");
			numsInteiros[i] = scanner.nextInt();
			soma += numsInteiros[i];
		}
		
		System.out.println("\nElementos nos índices ímpares: ");
		for (int i = 0; i < numsInteiros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numsInteiros[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("\nElementos pares: ");
		for (int i = 0; i < numsInteiros.length; i++) {
			if (numsInteiros[i] % 2 == 0) {
				System.out.print(numsInteiros[i] + " ");
			}
		}
		System.out.println();
		
		media = (float) soma / numsInteiros.length;
		System.out.println("\nSoma: " + soma);
		System.out.printf("\nMédia: " + media);
		
		scanner.close();
	}

}
