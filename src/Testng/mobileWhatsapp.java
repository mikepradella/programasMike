package Testng;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class mobileWhatsapp {

	public static AndroidDriver ANDROIDDRIVER;
	
	public static void openWhatsapp() throws MalformedURLException{
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("plataformName", "Android");
		desiredCapabilities.setCapability("plataformVersion", "4.4.2");
		desiredCapabilities.setCapability("deviceName", "d219d664");
		desiredCapabilities.setCapability("newCommandTimeout", "700");
		desiredCapabilities.setCapability("appPackage", "com.whatsapp");
		desiredCapabilities.setCapability("appActivity", "com.whatsapp.Main");
		ANDROIDDRIVER = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		ANDROIDDRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void executa(){
		
		
		//System.out.println(ANDROIDDRIVER.getPageSource());
		//ANDROIDDRIVER.findElements(By.xpath("//android.widget.Button")).get(0);
		
		//ANDROIDDRIVER.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
		
		//ANDROIDDRIVER.findElement(By.name("+")).click();
		
		//ANDROIDDRIVER.findElement(By.name("5")).click();
		
		//ANDROIDDRIVER.findElement(By.name("=")).click();
		
		//List<WebElement> calcButtons = ANDROIDDRIVER.findElements(By.xpath("//android.widget.Button"));
		
		//calcButtons.get(1).click();
		//calcButtons.get(2).click();

		// String result = ANDROIDDRIVER.findElement(By.className("android.widget.EditText")).getText();
		//  System.out.println("Number sum result is : " + result);
		
		int i =0;
		while (i < 100){
		ANDROIDDRIVER.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'com.jaumo:id/zappingTop')]")).click();
		ANDROIDDRIVER.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebElement dinheiro = ANDROIDDRIVER.findElement(By.xpath("//android.widget.TextView[@test='No, thanks']"));
		
	//	if (dinheiro.getText() == "No, thanks"){
		//	dinheiro.click();	
		
			
		//}
		i++;
		}
		
	}
	
	public static void exit(){
		
		ANDROIDDRIVER.quit();
	}
	
	public static void main(String[] args) throws MalformedURLException {
		
		openWhatsapp();
		//executa();
		exit();
	}

}
