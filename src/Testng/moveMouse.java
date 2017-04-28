package Testng;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class moveMouse {
 
 
public static void main(String []args){
 

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.google.com.br");
 

// Inspect element
 
Actions actions = new Actions(driver);
WebElement moveonmenu = driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a"));
actions.moveToElement(moveonmenu).click().perform();

//Call reuse method

}
}