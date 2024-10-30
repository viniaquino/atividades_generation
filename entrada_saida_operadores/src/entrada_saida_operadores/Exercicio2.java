package entrada_saida_operadores;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = scan.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média final: %.1f", mediaFinal);
	}
}
