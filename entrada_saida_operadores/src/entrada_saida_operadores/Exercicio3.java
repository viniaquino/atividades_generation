package entrada_saida_operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float salBruto, adcNoturno, hraExtra, descontos, salLiquido;
		
		System.out.println("Digite o sslário bruto: ");
		salBruto = scan.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adcNoturno = scan.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		hraExtra = scan.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = scan.nextFloat();
		
		salLiquido = salBruto + adcNoturno + (hraExtra * 5) - descontos;
		System.out.println("Salario liquido: " + salLiquido);
	}

}
