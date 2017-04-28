package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObterUrlPage {

	public static void main(String[] args) {		


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String urlAtual = driver.getCurrentUrl();
		System.out.println(urlAtual);
		
		//	ambos fecham o navegador
		
		//driver.close();	
		//driver.quit();

	}

}
