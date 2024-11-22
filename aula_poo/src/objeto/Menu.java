package objeto;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		
		System.out.println("\nCadastre seu gato: ");
		gato1.nome = "Bugadinho";
		gato1.idade = 1;
		gato1.cor = "Tricolor";
		gato1.raca = "Vira-lata";
		
		gato1.Imprimir();
		
		System.out.println("\nOque o gato1 está fazendo ?");
		
		gato1.Dormir();
		
		// Gato 2
		
		System.out.println("\nCadastre seu gato: ");
		gato2.nome = "Lili";
		gato2.idade = 18;
		gato2.cor = "Laranja";
		gato2.raca = "Vira-lata";
		
		gato2.Imprimir();
		
		System.out.println("\nOque o gato2 está fazendo ?");
		
		gato2.Miar();
		gato2.Comer();
	}

}
