package atividades;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = false;
        int num1, num2;
        
        do {
            System.out.println("Digite o primeiro número do intervalo: ");
            num1 = scanner.nextInt();
            
            System.out.println("Digite o último número do intervalo: ");
            num2 = scanner.nextInt();
            
            if (num1 < num2) {
            	System.out.println("\nNo intervalo entre: " + num1 + " e " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i + " é múltiplo de 3 e 5");
                    }
                }
            } else {
                System.out.println("Intervalo inválido!");
            }
            
            System.out.println("\nDeseja repetir o processo? (s/n): ");
            String resposta = scanner.next();
            
            repetir = resposta.equalsIgnoreCase("s");
            
        } while (repetir);
        
        scanner.close();
    }
}