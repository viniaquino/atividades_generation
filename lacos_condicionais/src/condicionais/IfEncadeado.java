package condicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.println("Digite a nota da P1");
		nota1 = scan.nextFloat();
		
		System.out.println("Digite a nota da P2");
		nota2 = scan.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Média final: " + media + " aluno aprovado!");
		} else if(media >= 5){
			System.out.println("Média final: " + media + " aluno de recuperação!");
		} else {
			System.out.println("Média final: " + media + " aluno reprovado!");
		}
		
		scan.close();
	}

}
