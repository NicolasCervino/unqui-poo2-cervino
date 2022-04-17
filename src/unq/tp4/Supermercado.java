package unq.tp4;

import java.util.ArrayList;

public class Supermercado {
	// Atributos
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	// Constructor
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.productos = new ArrayList<Producto>();
	}
	
	// Metodos
	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double getPrecioTotal() {
		double total = 0;
		for(int i=0; i < this.getCantidadDeProductos(); i++) {
			total += this.getProductos().get(i).getPrecio();
		}
		return total;
	}
	
	// Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
}