package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.seleniumeasy.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Selenium")).click();;
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("appium");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
