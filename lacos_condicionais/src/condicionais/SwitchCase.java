package condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int opcao;
		String genero;
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
		
        opcao = scan.nextInt();
        
        switch (opcao) {
		case 1:
			System.out.println("Digite o gênero do livro: ");
			genero = scan.next();
			
			if(genero.equals("Ficção")) {
				System.out.println("Livro: Senhor dos aneis, genero: " + genero);
			} else {
				System.out.println("Livro não encontrado!");
			}
			break;

		case 2:
			System.out.println("Frase motivacional: Não desista do curso da Generation");
			break;
		
		case 3:
			System.out.println("Indicação de música: só preciso de dinheiro pra comprar o mé");
			break;
			
			default:
			System.out.println("Alternativa incorreta");
			break;
		}
        
	}

}
