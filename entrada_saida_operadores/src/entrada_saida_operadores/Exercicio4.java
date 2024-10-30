package entrada_saida_operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o primeiro número: ");
		n1 = scan.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		n3 = scan.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		n4 = scan.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		System.out.println("Diferença: " + diferenca);
	}

}
