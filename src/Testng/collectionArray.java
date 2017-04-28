package Testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collectionArray {

	public static void main(String[] args) {
		Collection <String> nomes = new ArrayList();
		
		nomes.add("mike");
		nomes.add("tyson");
		nomes.add("schwarzenegger");
		nomes.add("pradella");
		
		if(nomes.isEmpty()){
			System.out.println("lista vazia");
		}else{

			nomes.remove("tyson");
		
		System.out.println("lista de nomes " + nomes);
		
		}
		
		Collection<String> vogais = new ArrayList();
		vogais.add("A");
		vogais.add("E");
		vogais.add("I");
		
		Collection<String> vogais2 = Arrays.asList("O", "U");
		
		//RECEBE TODOS OS ELEMENTOS DA COLEÇÃO ADICIONANDO NA COLEÇÃO VOGAIS
		vogais.addAll(vogais2);
		
		System.out.println("Lista das Vogais: "+vogais);
		
		Collection<String> vogais3 = new ArrayList();
		vogais.add("A");
		vogais.add("E");
		vogais.add("I");
		vogais.add("O");
		vogais.add("U");

		//PERCORRE TODOS OS ELEMENTOS DA COLEÇÃO VOGAIS
		for(String vog : vogais){
			System.out.println("Vogal: "+vog);
		}
		

	}

}
