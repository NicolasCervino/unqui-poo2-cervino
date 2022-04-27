package unq.tp5;

public class Producto {
	private String nombre;
	private Double precio;
	
	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	// Getters y setters
	private void setPrecio(Double precio) {
		this.precio = precio;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
