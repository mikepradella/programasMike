package Testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class fonteHtml {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String fontePagina = driver.getPageSource();
		System.out.println(fontePagina);
		
		
		
	}

}
