package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.BindException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class trabalhandoComExcel {

	public static void main(String[] args) throws IOException,BindException, BiffException{
		
		
		FileInputStream  excel = new FileInputStream(new File("C:\\Users\\Inmetrics\\Downloads\\teste.xlsx"));
		//File file = new File ("teste.xls");

		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowiterator = sheet.iterator();
		
		
		System.out.println("iniciando a leitura  xls");
		
		
		workbook.close();
	}

}
