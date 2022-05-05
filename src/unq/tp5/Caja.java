package unq.tp5;

public class Caja {
	private Double montoAPagar;
	
	public Caja() {
		this.montoAPagar = 0d;
	}
	
	public void registrar(Registrable r) {
		this.montoAPagar += r.registrar();
	}
	
	public void informarMonto() {
		 System.out.println("El monto a pagar es de: " + this.getMonto());
	}
	
	// Getters y Setters
	
	public Double getMonto() {
		return this.montoAPagar;
	}
}
