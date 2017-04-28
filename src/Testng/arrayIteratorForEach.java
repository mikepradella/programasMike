package Testng;

import java.util.ArrayList;

public class arrayIteratorForEach {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mike");
		list.add("tyson");
		list.add("schwarzenegger");
		list.add("pradella");

		for (String mostrar: list){
			
			System.out.println(mostrar);
		}

	}

}
