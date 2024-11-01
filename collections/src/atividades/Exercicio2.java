package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(15);
        numeros.add(20);
        numeros.add(33);
        numeros.add(40);
        numeros.add(55);
        numeros.add(60);
        numeros.add(72);
        numeros.add(88);

        // Criando o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para buscar: ");
        int numeroBusca = scanner.nextInt();

        // Procurando o número no ArrayList
        int posicao = numeros.indexOf(numeroBusca);

        // Verificando se o número foi encontrado
        if (posicao != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado na posição " + posicao + " da Collection.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado!");
        }

        // Fechando o Scanner
        scanner.close();
	}

}
