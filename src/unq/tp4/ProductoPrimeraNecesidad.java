package unq.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	// Atributo
	private int descuento;
	
	// Constructores
	public ProductoPrimeraNecesidad(String nombre, double precio, int descuento) {
		super(nombre,precio);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, int descuento, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
		this.setDescuento(descuento);
	}
	
	// Metodos
	
	@Override
	public double getPrecio() {
		double descuento = super.getPrecio() * this.getDescuento() / 100;
		return super.getPrecio() - descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public int getDescuento() {
		return this.descuento;
	}
}
