package condicionais;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 4, n2 = 3, n3 = 4;
		
		if(n1 < (n2 - n3)) {
			System.out.println("O número 1 é menor que a soma");
		}
		
		if (n1 < (n2 - n3)) {
			System.out.println("O número 1 é menor que a subtração");
		}
		
		if (n1 < (n3 - n2)) {
			System.out.println("O número 1 é menor que a subtração");
		}
	}

}
