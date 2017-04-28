package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		

		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://www.google.com"; 

		// Launch the Online Store WebSite
		driver.get(url);
		
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("automacao");
		
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('mike tyson');");
		
		
		

	}

}
