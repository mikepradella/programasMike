package Testng;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mike");
		list.add("tyson");
		list.add("schwarzenegger");
		list.add("pradella");
		
		
		Iterator  itr = list.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
		
		
		
	}

}
