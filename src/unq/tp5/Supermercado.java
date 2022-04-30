package unq.tp5;

import java.util.HashMap;

public class Supermercado {
	private String nombre;
	private HashMap<Producto, Integer> stock;
	
	public Supermercado(String nombre) {
		this.setNombre(nombre);
		this.stock = new HashMap<Producto, Integer>();
	}
	
	public void agregarProducto(Producto p) {
		// Esta variable es igual al stock del producto o 0 si el producto no existe en el map
		int stockP = this.getStock().getOrDefault(p, 0);
		// Aumento la cantidad del producto
		this.getStock().put(p, stockP + 1);
	} 
	
	public void disminuirStock(Producto p) {
		// Primero compruebo si el producto existe
		if (this.getStock().containsKey(p)) {
			// Esta variable es igual al stock del producto
			int stockP = this.getStock().get(p);
			// Disminuyo la cantidad del producto
			this.getStock().put(p, stockP - 1);
		}
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Producto, Integer> getStock() {
		return stock;
	}

}


