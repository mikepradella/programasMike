package Testng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lerEscreverArquivo {

	public static void main(String[] args) throws IOException {
		
		String testeArquivo =  "C:\\Users\\Inmetrics\\Documents\\mikeTeste.txt";
		
		File fc = new File(testeArquivo);
		
		fc.createNewFile();
		
		FileWriter fw = new FileWriter(testeArquivo);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("mike testando seu primeiro arquivo");
		bw.newLine();
		bw.write("mike testando segunda linha");
		bw.close();
		
		FileReader fr = new FileReader(testeArquivo);
		BufferedReader br = new BufferedReader(fr);
		String content = "";
		
		while ((content = br.readLine())!= null) {
			System.out.println(content);
			
		}
		
		
		
	}

}
