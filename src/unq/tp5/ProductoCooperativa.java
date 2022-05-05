package unq.tp5;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombre, Double precio, Supermercado supermercado) {
		super(nombre, precio, supermercado);
	}
	
	public Double getPrecio() {
		double descuento = super.getPrecio() * 10 / 100;
		return super.getPrecio() - descuento;
	}
}
