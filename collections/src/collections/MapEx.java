package collections;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long, String> pessoa = new HashMap<>();
		
		pessoa.put(12345678911L, "Felipe");
		pessoa.put(12345678911L, "Sansão");
		pessoa.put(12345678911L, "Sansão");
		System.out.println(pessoa);
	}

}
