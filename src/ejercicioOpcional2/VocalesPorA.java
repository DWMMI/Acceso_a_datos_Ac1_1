package ejercicioOpcional2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VocalesPorA {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("texto.txt");
		BufferedReader br = new BufferedReader(fr);
		
		 String linea;
	        while ((linea = br.readLine()) != null) {
	        	System.out.println(linea.replaceAll("[aeiouAEIOU]", "a"));
	        }

	        fr.close();
	        br.close();
	}
}
