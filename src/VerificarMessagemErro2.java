import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerificarMessagemErro2 {

	@Test
	public void meuTeste() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Inmetrics\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http:\\www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		
		Thread.sleep(2000);
		
		String erroAtual = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();
		
		String erroEsperado = "Insira seu e-mail.";
		
		//Assert.assertEquals(erroEsperado, erroAtual);
		
		Assert.assertTrue(erroAtual.contains("Insira seu e-mail."));
		
		System.out.println("teste completado");
		
		

	}

}
