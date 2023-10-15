package ejercicioOpcional1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InsertarProductos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("productos.dat");
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			Producto[] productos = new Producto[10];

			// Asignamos valores a los productos:
			for (int i = 0; i < productos.length; i++) {
				productos[i] = new Producto(i, "Producto " + i, i * 0.5f);
			}

			// Almacenar los datos en el fichero:
			for (Producto producto : productos) {
				oos.writeObject(producto);
			}
			System.out.println("Productos almacenados en el fichero.");
			oos.close();
	        fos.close();
		}
	}
}