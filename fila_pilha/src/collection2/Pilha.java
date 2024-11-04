package collection2;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		 
        pilha.push("Prato Verde");
        pilha.push("Prato Azul");
        pilha.push("Prato Branco");
        pilha.push("Prato Amarelo");
        pilha.push("Prato Vermelho");
        
        System.out.println("\nElementos da pilha: " + pilha);
        
        System.out.println("\nRemover elementos da pilha: " + pilha.pop());
        
        System.out.println("\nElementos da pilha: " + pilha);
        
        pilha.push("Prato Roxo");
        
        System.out.println("\nElementos da pilha: " + pilha);
        
        Iterator<String> iterator = pilha.iterator();
        
        while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
