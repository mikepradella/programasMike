package Testng;



public class caixaDeTexto {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
		System.out.println(java.time.Clock.systemUTC().instant());
		
		java.util.Date date =  new java.util.Date();
		
		System.out.println(date);
		
		long millis = System.currentTimeMillis();
		java.sql.Date date2 =  new java.sql.Date(millis);
		System.out.println(date2);
	}

	}



