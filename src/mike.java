

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class mike {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");

// Initialize browser
WebDriver driver=new ChromeDriver();

// Open facebook
driver.get("http://www.google.com.br");

// Maximize browser

driver.manage().window().maximize();



}

}