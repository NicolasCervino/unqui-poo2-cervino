package unq.tp5;

public class Impuesto extends Factura {
	private Double tasaServicio;
	
	public Impuesto(Double tasa) {
		this.setTasaServicio(tasa);
	}
	
	public Double getPrecio() {
		return this.getTasaServicio();
	}
	
	public Double registrar() {
		registrarPago(this);
		return this.getPrecio();
	}
	
	public void registrarPago(Factura f) {
		
	}
	
	// Getters y Setters
	public Double getTasaServicio() {
		return tasaServicio;
	}
	
	public void setTasaServicio(Double tasaServicio) {
		this.tasaServicio = tasaServicio;
	}
}
