package atividades;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		int opcao;
		String nomeCliente, resposta;

		do {
			System.out.println("***************************************");
			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("\n2 - Listar todos os Clientes");
			System.out.println("\n3 - Retirar Cliente da fila");
			System.out.println("\n0 - Sair");
			System.out.println("***************************************");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("Digite o nome: ");
					nomeCliente = scanner.next();
					fila.add(nomeCliente);
					System.out.println("Fila: " + fila);
					System.out.println("\nCliente Adicionado!");
					System.out.println("Deseja continuar adicionando ? (s/n)");
					resposta = scanner.next();
				} while (resposta.equalsIgnoreCase("s"));
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println("Fila: " + fila);
					Iterator<String> iterator = fila.iterator();
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("\nDeseja continuar ? (s/n)");
					resposta = scanner.next();
					if (resposta.equalsIgnoreCase("n")) {
						opcao = 0;
						System.out.println("Programa Finalizado!");
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
					System.out.println("\nDeseja tentar novamente (s/n) ?");
					resposta = scanner.next();
					if (resposta.equalsIgnoreCase("n")) {
						opcao = 0;
						System.out.println("Programa Finalizado!");
					}
				} else {
					do {
						fila.remove();
						System.out.println("Fila: " + fila);
						System.out.println("\nO Cliente foi Chamado!");
						System.out.println("\nDeseja continuar removendo ? (s/n)");
						resposta = scanner.next();
					} while (resposta.equalsIgnoreCase("s"));
				}
				break;

			case 0:
				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);

		scanner.close();
	}

}
