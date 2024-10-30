package atividades;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite 'Vertebrado' ou 'Invertebrado'");
		palavra1 = scan.nextLine();
		
		if (palavra1.equals("Vertebrado")) {
			System.out.println("Digite 'Ave' ou 'Mamifero'");
			palavra2 = scan.nextLine();
			
			if (palavra2.equals("Ave")) {
				System.out.println("Escolha entre 'Carnivoro', 'Onivoro', 'Herbivoro' ou 'Hematofogo'");
				palavra3 = scan.next();
				
				if (palavra3.equals("Carnivoro")) {
					System.out.println("Águia");
				} else {
					System.out.println("Pomba");
				}
			} else {
				System.out.println("Escolha entre 'Onivoro' ou 'Herbivoro'");
				palavra3 = scan.next();
				
				if (palavra3.equals("Onivoro")) {
					System.out.println("Homem");
				} else {
					System.out.println("Vaca");
				}
			}
		} else {
			if (palavra1.equals("Invertebrado")) {
				System.out.println("Escolha entre 'Inseto' ou 'Anelidio'");
				palavra2 = scan.nextLine();
				
				if (palavra2.equals("Inseto")) {
					System.out.println("Escolha entre 'Hematofago' ou 'Herbivoro'");
					palavra3 = scan.next();
					
					if (palavra3.equals("Hematofago")) {
						System.out.println("Pulga");
					} else {
						System.out.println("Lagarta");
					}
			} else if(palavra2.equals("Anelidio")) {
				System.out.println("Escolha entre 'Hematofago' ou 'Onivoro'");
				palavra3 = scan.next();
				
				if (palavra3.equals("Hematofago")) {
					System.out.println("Sanguessuga");
				} else {
					System.out.println("Minhoca");
				}
			}
		} else {
			System.out.println("Opção Inválida");
		}
		scan.close();
	}
  }
}
