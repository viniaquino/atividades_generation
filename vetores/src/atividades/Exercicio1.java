package atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean encontrado = false;
		int numero;
		
		int[] numsInteiros = new int[10];
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < numsInteiros.length; i++) {
			System.out.print("Número na posição " + i + ": ");
			numsInteiros[i] = scanner.nextInt();
		}
		
		System.out.println("Digite um número que você deseja encontrar: ");
		numero = scanner.nextInt();
		
		for (int i = 0; i < numsInteiros.length; i++) {
			if (numsInteiros[i] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		scanner.close();
	}

}
