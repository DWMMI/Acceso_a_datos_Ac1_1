package ejercicioOpcional1;

import java.io.Serializable;

/**
 * @author dichaowang
 */
/*
 * Ejercicio1. Crea una clase Producto en el proyecto con los siguientes
 * atributos: id (int), nombre (String), medidas (String), precio (float). Crea
 * también sus constructores, getters y setters. Ten en cuenta que objetos de
 * esta clase serán almacenados en ficheros binarios. Crea una clase
 * InsertarProductos que mediante un array de objetos Producto introduzca 10
 * productos en un fichero binario productos.dat. Almacena el fichero dentro de
 * la carpeta del proyecto.
 */
public class Producto implements Serializable{
	int id;
	String nombre;
	float precio;
	
	public Producto(int id, String nombre, float precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
