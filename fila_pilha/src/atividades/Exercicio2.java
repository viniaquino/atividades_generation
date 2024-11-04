package atividades;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nomeLivro, resposta;

        do {
            System.out.println("***************************************");
            System.out.println("1 - Adicionar Livro na pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("***************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    do {
                        System.out.print("Digite o nome do livro: ");
                        nomeLivro = scanner.nextLine();
                        pilha.push(nomeLivro);
                        System.out.println("Pilha: " + pilha);
                        System.out.println("Livro Adicionado!");
                        System.out.print("Deseja continuar adicionando? (s/n): ");
                        resposta = scanner.nextLine();
                    } while (resposta.equalsIgnoreCase("s"));
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        Iterator<String> iterator = pilha.iterator();
                        while (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                        System.out.print("Deseja continuar? (s/n): ");
                        resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("n")) {
                            opcao = 0;
                            System.out.println("Programa Finalizado!");
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A Pilha está vazia!");
                        System.out.print("Deseja tentar novamente (s/n)? ");
                        resposta = scanner.nextLine();
                        if (resposta.equalsIgnoreCase("n")) {
                            opcao = 0;
                            System.out.println("Programa Finalizado!");
                        }
                    } else {
                        do {
                            String livroRetirado = pilha.pop();
                            System.out.println("Pilha: " + pilha);
                            System.out.println("Um Livro foi retirado da pilha!");
                            System.out.print("Deseja continuar retirando? (s/n): ");
                            resposta = scanner.nextLine();
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