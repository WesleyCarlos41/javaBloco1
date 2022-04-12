package collectionList;

import java.util.*;

public class collection {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		Scanner ler = new Scanner (System.in);
		String x;
		
		nomes.add("São paulo");
		nomes.add("Milan");
		nomes.add("Barcelona");
		System.out.println(nomes);
		nomes.remove("Barcelona");
		System.out.println(nomes);
		for (int i = 0; i < 11; i++) { 
			nomes.add(x =ler.next());
		}
		System.out.println(nomes);
	}

}
