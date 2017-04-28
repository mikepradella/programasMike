package Testng;

public class trabalhandoComString {

	public static void main(String[] args) {
		char data[]={'a','b','c'};
		String str=new String(data);
		//System.out.println(str);
		
		/*
		String valor= "DEVMEDIA - Java";
		System.out.println(valor.charAt(0));
		

		String valor2= "DEVMEDIA - Java";
		System.out.println(valor.codePointAt(1));

		String valor3="DEVMEDIA - Java";
		System.out.println(valor3.compareTo("DEVMEDIA - Java")==0? true:false);
		System.out.println(valor3.compareTo("DEVMEDIA - JAVA")==0? true:false);
		System.out.println(valor3.compareToIgnoreCase("DEVMEDIA - JAVA")==0? true:false);
		

		String valor4="DEVMEDIA - Java";
		System.out.println(valor4.endsWith("java"));
		System.out.println(valor4.startsWith("DEV"));
		System.out.println(valor4.startsWith("ME", 3));
		
		String valor5 ="DEVMEDIA - Java";
			for(char c :valor5.toCharArray())
				System.out.println("Char :" + c);
		
			
		String valor6 ="0";
		
		System.out.println(valor6.isEmpty());
		
		
		String valor7="DEVMEDIA - Java";
		String [] valorComSplit=valor7.split(" - ");
		for(String s:valorComSplit){
			System.out.println(s);
		}
		

		String valor8="DEVMEDIA - Java - Engenharia - Software";
		String [] valorComSplit1=valor8.split(" - ",2);
		for(String s:valorComSplit1){
			System.out.println(s);
		}
		
		*/
		
		String valor8 = "DEVMEDIA - Java";
		System.out.println(valor8.subSequence(0, 5));
		System.out.println(valor8.substring(2, 5));
		

		String valor9 = "DEVMEDIA - Java";
			System.out.println(valor9.toLowerCase());
			System.out.println(valor9.toUpperCase());
			System.out.println(valor9.trim());	
			
			  String result = String.format("Hoje nós processamos %,d transações", 100000);
              System.out.println(result);
              
              result = String.format("10 / 3 = %.2f", 10.0 / 3.0);
              System.out.println(result);
	}

}
