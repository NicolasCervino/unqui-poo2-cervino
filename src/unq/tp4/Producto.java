package unq.tp4;

public class Producto {
	// Atributos
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	// Constructores
	public Producto(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(false);
	}
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(precioCuidado);
	}
	
	// Metodos
	public void aumentarPrecio(double nuevoPrecio) {
		this.setPrecio(this.getPrecio() + nuevoPrecio);
	}
	
	// Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
}
