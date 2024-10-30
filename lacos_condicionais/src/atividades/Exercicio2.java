package atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.println("O Número " + num + " é par e positivo!");
			} else {
				System.out.println("O Número " + num + " é par e negativo!");
			}
		} else {
			if (num >= 0) {
				System.out.println("O Número " + num + " é impar e positivo!");
			} else {
				System.out.println("O Número " + num + " é impar e negativo!");
			}
		}
		scan.close();
	}

}
