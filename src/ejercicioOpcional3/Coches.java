package ejercicioOpcional3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Coches {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("coches.dat", "rw");

		String[] modelos = new String[10];

		modelos[0] = "BMW Serie 4 Cabrio";
		modelos[1] = "Clase C Cabrio";
		modelos[2] = "Audi A5 Cabrio";
		modelos[3] = "Porsche 911 Cabrio";
		modelos[4] = "Jaguar F-Type Cabrio";
		modelos[5] = "Vantage Roadster";
		modelos[6] = "McLaren 570S Spider";
		modelos[7] = "Ferrari 488 Spider";
		modelos[8] = "Huracan Spyder";
		modelos[9] = "Porche panamera";

		int[] anios = new int[10];

		anios[0] = 2022;
		anios[1] = 2022;
		anios[2] = 2022;
		anios[3] = 2023;
		anios[4] = 2022;
		anios[5] = 2023;
		anios[6] = 2023;
		anios[7] = 2023;
		anios[8] = 2023;
		anios[9] = 2021;

		double[] precios = new double[10];

		precios[0] = 42900;
		precios[1] = 32900;
		precios[2] = 37600;
		precios[3] = 107000;
		precios[4] = 60900;
		precios[5] = 163000;
		precios[6] = 220000;
		precios[7] = 290000;
		precios[8] = 320000;
		precios[9] = 120000;

		for (int i = 0; i < precios.length; i++) {
			raf.writeUTF(modelos[i]);
			raf.writeInt(anios[i]);
			raf.writeDouble(precios[i]);
		}

		raf.close();
		
		raf = new RandomAccessFile("coches.dat", "r");
		
		leerCoches(raf);
		
		raf.close();
	}

	private static void leerCoches(RandomAccessFile raf) throws IOException {
		for (int i = 0; i < 10; i++) {
			System.out.println("Modelo: " + raf.readUTF());
			System.out.println("Año: " + raf.readInt());
			System.out.println("Precio: " + raf.readDouble());
		}
	}
}
