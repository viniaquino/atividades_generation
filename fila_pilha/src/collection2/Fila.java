package collection2;

import java.util.Collections;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fila = new LinkedList<String>();
		
		Collections.addAll(fila, "Gabriel","Priscila","Kaue");
		
		System.out.println(fila);
		
		System.out.println("\nAdicionar novo Elemento: " + fila.add("Geandro"));
		
		System.out.println(fila);
		
		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());
		 
		System.out.println(fila);
		
		System.out.println("\nRemover elemento:  " + fila.remove());
		
		System.out.println(fila);
	}

}
