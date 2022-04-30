package unq.tp5;


public class Caja {
	private Double montoAPagar;
	private Supermercado supermercado;
	
	public Caja(Supermercado s) {
		this.montoAPagar = (double) 0;
		this.supermercado = s;
	}
	
	public void registrarProducto(Producto p) {
		this.montoAPagar += p.getPrecio();
		this.supermercado.disminuirStock(p);
	}
	
	public void informarMonto() {
		 System.out.println("El monto a pagar es de: " + this.getMonto());
	}
	
	// Getters y Setters
	
	public Double getMonto() {
		return this.montoAPagar;
	}

}
