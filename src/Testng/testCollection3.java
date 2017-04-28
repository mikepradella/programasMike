package Testng;

import java.util.ArrayList;
import java.util.Iterator;

public class testCollection3 {

	public static void main(String[] args) {
		
		studant s1 = new  studant(10,"mike", 27);
		studant s2 = new studant(20, "tyson", 28);
		studant s3 = new studant(30,"pradella", 30);
		
		ArrayList<studant> al = new ArrayList<studant>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator  itr = al.iterator();
		
		while(itr.hasNext()){
			studant st=(studant)itr.next();
			System.out.println(st.rollno + " r" +st.name + " "+ st.age);
		}
		
		
		
		
				
	}

}
