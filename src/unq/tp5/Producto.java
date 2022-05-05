package unq.tp5;

public class Producto implements Registrable {
	private String nombre;
	private Double precio;
	private Supermercado supermercado;
	
	public Producto(String nombre, Double precio, Supermercado supermercado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setSupermercado(supermercado);
	}
	
	// Disminuye el stock del supermercado y devuelve el precio
	public Double registrar() {
		this.getSupermercado().disminuirStock(this);
		return this.getPrecio();
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
	
	private Supermercado getSupermercado() {
		return this.supermercado;	
	}
	
	private void setSupermercado(Supermercado supermercado) {
		this.supermercado = supermercado;
	}
}
