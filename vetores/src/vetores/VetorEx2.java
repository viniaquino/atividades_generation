package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int vetorInteiro[] = new int[5];

		for (int i = 0; i < vetorInteiro.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorInteiro[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			System.out.println((i + 1) + "º elemento: " + vetorInteiro[i]);
		}
		
		System.out.println("Tamanho do vetor: " + vetorInteiro.length);
		
		Arrays.sort(vetorInteiro);
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			System.out.println((i + 1) + "º elemento: " + vetorInteiro[i]);
		}
		
	}

}
