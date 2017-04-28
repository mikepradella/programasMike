package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Autosugestao {
 public static void main(String[] args) {
 


System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
 
WebDriver driver=new ChromeDriver();
 
driver.get("http://www.google.com");
 
driver.manage().window().maximize();
 
Actions act=new Actions(driver);
 
act.contextClick(driver.findElement(By.linkText("Gujarati"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
 
}
 
}