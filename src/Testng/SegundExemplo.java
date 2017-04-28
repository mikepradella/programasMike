package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SegundExemplo {
public static void main(String[] args) {
	// Create a new instance of the FireFox driver
	

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	String url = "http://toolsqa.wpengine.com/Automation-practice-form/"; 

	// Launch the Online Store WebSite
	driver.get(url);

	String titulo = driver.getTitle();
	System.out.println("titulo da pagina é : " + titulo);
	
	int tamanho = driver.getTitle().length();
	System.out.println("tamanho do conteudo do titulo" + tamanho);
	
	String urlAtual = driver.getCurrentUrl();
	System.out.println("url da pagina " + urlAtual);
	
	
	
	if (url.equals(urlAtual)){
		System.out.println("a url esta correta");
		
	}else {
		System.out.println("a url nao esta correta");
	}
		
	
	//String codigoPagina = driver.getPageSource();
	//System.out.println(codigoPagina);
	
	
	// Click on "Partial Link Text" link
	driver.findElement(By.partialLinkText("Partial")).submit();
	System.out.println("Partial Link Test Pass");

	// Convert element in to a string 
	String sClass = driver.findElements(By.tagName("button")).toString();
	System.out.println(sClass);

	// Click on "Link Text" link
	driver.findElement(By.linkText("Link Test")).submit();
	System.out.println("Link Test Pass");
	
	driver.close();
	}
}
