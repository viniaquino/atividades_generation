package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> notas = new ArrayList<Double>(); 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		notas.add(scanner.nextDouble());
		
		notas.add(7.0);
		notas.add(5.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(4.0);
        
        for (Double nota : notas) {
			if (nota % 2 == 0) {
				System.out.println(nota);
			}
		}
        
        notas.add(1, 9.5);
        
        System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
        
        System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5.0));
	}

}
