package atividades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> valores = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 10 valores inteiros não repetidos: ");
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		valores.add(scanner.nextInt());
		
		Iterator<Integer> iterator = valores.iterator();
		System.out.println("Listar dados do set: ");
		for (Integer valor : valores) {
			System.out.print(valor + "  ");
		}
		
		scanner.close();
		
	}

}
