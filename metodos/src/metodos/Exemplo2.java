package metodos;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mensagem();
		
		somarNumeros(10, 5);
	}
	
	public static void mensagem() {
		System.out.println("Método sem retorno");
	}
	
	public static void somarNumeros(int a, int b) {
		int resultado = a + b;
		System.out.println("A soma é: " + resultado);
	}

}
