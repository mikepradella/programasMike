package Testng;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lerArquivoExcel {

	public static void main(String[] args) throws IOException {
		
				
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Inmetrics\\Desktop\\mikeTeste.xlsx");
		
		HSSFWorkbook Workbook  = new HSSFWorkbook(fis);
		
		HSSFSheet sheetExcel = Workbook.getSheetAt(0);

		System.out.println("quantidade de linhas" + sheetExcel.getLastRowNum());
		
	
		
		
		

	}

}
