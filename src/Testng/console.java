package Testng;

import java.io.Console;


public class console {

	public static void main(String[] args) {
		
		Console c = System.console();
		System.out.println("enter your name");

		String n= c.readLine();
		
		System.out.println("welcome" + n);
	}

}
