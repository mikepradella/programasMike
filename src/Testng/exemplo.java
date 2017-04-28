package Testng;

//Importa as bibliotecas do JUnit, Selenium WebDriver, List etc.
import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Classe JUnit que cont�m os m�todos de teste.
public class exemplo {

	// Declarando um objeto do tipo WebDriver, utilizado pelo Selenium WebDriver.
	private static WebDriver driver;

	// M�todo que inicia tudo que for necess�rio para o teste
	// Cria uma inst�ncia do navegador e abre a p�gina inicial da DevMedia.
	@BeforeClass
	public static void setUpTest(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get("http://www.DevMedia.com.br");
		

	}

	// M�todo que finaliza o teste, fechando a inst�ncia do WebDriver.    
	//@AfterClass
	//public static void tearDownTest(){
	//	driver.quit();
	//}

	// Testa t�tulo "DevMedia - Cursos, Tutoriais e V�deos para Desenvolvedores".
	@Test
	public void testaTituloDaPagina(){
		assertEquals("DevMedia", driver.getTitle());
	}				  

	// M�todo que testa o login no site DevMedia.
	@Test
	public void testaLoginDevMedia() throws InterruptedException {

	// Instancia um novo objeto do tipo "WebElement", e passa como par�metro
	// um elemento da tela cujo valor do atributo "name" seja igual a "usuario".
	driver.findElement(By.className("login-btn")).click();
		
	WebElement element = driver.findElement(By.name("usuario"));
	Dimension dimension = element.getSize();
	System.out.println(dimension);
	
	Point point = element.getLocation();
	System.out.println(point);
		
	// Insere dados no elemento "usuario".
	element.sendKeys("user@devmedia.com.br");

	// Atribui ao objeto �element� o elemento de atributo "name" igual a "senha".
	element = driver.findElement(By.name("senha"));
	
	
	// pega valor do elemento e mostra
	String valor = element.getAttribute("name");	
	System.out.println(valor);
	
	// pega tag do elemento e mostra
	String tagname = element.getTagName();
		
	System.out.println(tagname);

	// Insere dados no elemento "senha".
	element.sendKeys("123456");
	
	WebElement pai = driver.findElement(By.className("pai"));
	//List<WebElement> lista = driver.findElements(By.tagName("button"));
	//System.out.println(lista.size());
	WebElement login = pai.findElement(By.xpath("//button"));
	
	String tagnome = login.getTagName();
	System.out.println(tagnome);
	
	login.click();
	
	//atualiza a pagina
	driver.navigate().refresh();
	
	//espera 5 segundos
	//Thread.sleep(500);
	
	//mesma funcao do botao voltar do navegador
	//driver.navigate().back();
	
	
	//mesma funcao do botao avancar do navegador
	//driver.navigate().forward();
	
	//abre outro navegador
 	//driver.navigate().to("http://www.google.com.br");

	// Clica no bot�o "OK" e submete os dados para concluir o login.
		//driver.findElement(by.name("login")).click();
	}
}
	
