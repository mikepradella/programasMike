package Testng;

import javax.swing.*;

public class jtable {

	
		JFrame f;
		
		 jtable(){
			
			f=new JFrame();
			
			String data[][] = {{"101","mike","67000"},
								{"102","tyson","78000"},
								{"101","mike","67000"}};
			
			String column[] = {"ID","NAME","SALARY"};
			
			JTable jt = new JTable(data,column);
			
			jt.setBounds(30,40,200,300);
			
			JScrollPane sp = new JScrollPane(jt);
			
			f.add(sp);
			f.setSize(300, 400);
			f.setVisible(true);
			
		}
		
	
		
	public static void main(String[] args) {
	
		new jtable();
		
	}

}
