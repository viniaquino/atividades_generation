package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int pesquisa, posicao;
		
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.print("Digite o número que você desja encontrar: ");
        pesquisa = scanner.nextInt();

        posicao = numeros.indexOf(pesquisa);

        if (posicao != -1) {
            System.out.println("O número " + pesquisa + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + pesquisa + " não foi encontrado!");
        }

        scanner.close();
	}

}
