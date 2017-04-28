package Testng;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class casosDeTeste {
 
 
public static void main(String []args){
 

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
 
driver.manage().window().maximize();
 
driver.get("http://www.facebook.com");
 

// Inspect element
WebElement username= driver.findElement(By.id("email")); 
//Call reuse method
realçar.highLightElement(driver, username);
username.sendKeys("miketysonpradella@yahoo.com.br");

WebElement password = driver.findElement(By.id("pass"));
// Call reuse method
realçar.highLightElement(driver, password);
password.sendKeys("C@rlos363");



WebElement login = driver.findElement(By.id("loginbutton"));
// Call reuse method
realçar.highLightElement(driver, login);
login.click();

}
}