package lacos.repeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num, resultado;
		
		System.out.println("Digite um número de '0' a '10' para visualizar a tabuada!");
		num = scan.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			resultado = num * i;
			System.out.println("Tabuada do número: " + num + "\n" + resultado);
		}
	}
	

}
