package objeto;

public class Gato {
	String nome;
	int idade;
	String cor;
	String raca;
	
	public void Miar() {
		System.out.println("Miaaaauuuu");
	}
	
	public void Comer() {
		System.out.println("Comendo a ração");
	}
	
	public void Dormir() {
		System.out.println("ZZZZzzzzzzzzzzzzzzZZZZZZZZ");
	}
	
	public void Imprimir() {
		System.out.println("\nNome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cor: " + cor);
		System.out.println("Raça: " + raca);
	}
	
}
