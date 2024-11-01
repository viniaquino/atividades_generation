package atividades;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> valores = new HashSet<>();
		int pesquisa;
		
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		pesquisa = scanner.nextInt();
		
		if (valores.contains(pesquisa)) {
			System.out.println("O número " + pesquisa + " foi encontrado!");
		} else {
			System.out.println("O número " + pesquisa + " não foi encontrado!");
		}
	}

}
