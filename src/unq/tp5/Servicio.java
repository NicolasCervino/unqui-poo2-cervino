package unq.tp5;

public class Servicio extends Factura {
	private Double costoXUnidad;
	private int cantUnidades;
	
	public Servicio(Double costo, int cant) {
		this.setCostoXUnidad(costo);
		this.setCantUnidades(cant);
	}

	public Double getPrecio() {
		return this.getCostoXUnidad() * this.getCantUnidades();
	}
	
	public Double registrar() {
		registrarPago(this);
		return this.getPrecio();
	}
	
	public void registrarPago(Factura f) {
		
	}
	
	// Getters y Setters
	public Double getCostoXUnidad() {
		return this.costoXUnidad;
	}
	
	private void setCostoXUnidad(Double costo) {
		this.costoXUnidad = costo;
	}
	
	public int getCantUnidades() {
		return this.cantUnidades;
	}
	
	private void setCantUnidades(int cant) {
		this.cantUnidades = cant;
	}
}
