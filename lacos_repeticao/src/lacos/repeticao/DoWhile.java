package lacos.repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";
        boolean autenticado = false;
		
		do {
			System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
 
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				System.out.println("Autenticado com sucesso!");
			} else {
				System.out.println("Usuário ou senha incorretos. Tente novamente.");
                System.out.print("Deseja tentar novamente? (s/n): ");
                String continuar = scanner.next().toUpperCase();
                
                if (continuar.equals("S")) {
					autenticado = true;
					scanner.nextLine();
				} else {
					autenticado = false;
					System.out.println("Autenticação inválida!");
				}
			}
		} while (autenticado);
	}
}
