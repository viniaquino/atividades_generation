package atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList <String> cores = new ArrayList<>();
		
		System.out.println("Digite 5 cores: ");
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		cores.add(scanner.nextLine());
		
		System.out.println("\nListar todas as cores: " + cores);
		
		Collections.sort(cores);
		System.out.println("\nOrdenar todas cores: " + cores);
	}

}
