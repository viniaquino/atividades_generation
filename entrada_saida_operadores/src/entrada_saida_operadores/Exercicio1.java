package entrada_saida_operadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		
		System.out.println("Digite o salário: ");
		salario = scan.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono =  scan.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("Novo salário: " + novoSalario);
		
		scan.close();
	}

}
