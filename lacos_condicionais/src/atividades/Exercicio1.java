package atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numA, numB, numC, soma;
		
		System.out.println("Digite o número A: ");
		numA = scan.nextInt();
		
		System.out.println("Digite o número B: ");
		numB = scan.nextInt();
		
		System.out.println("Digite o número C: ");
		numC = scan.nextInt();
		soma = numA + numB;
		
		if ((numA + numB) > numC) {
			System.out.println(numA + "+" + numB + "=" + soma + ">" + numC + "\nA Soma de A + B é Maior do que C");
		} else if((numA + numB) < numC) {
			System.out.println(numA + "+" + numB + "=" + soma + "<" + numC + "\nA Soma de A + B é Menor do que C");
		} else {
			System.out.println(numA + "+" + numB + "=" + soma + "=" + numC +"\nA Soma de A + B é Igual a C");
		}
		scan.close();
	}

}
