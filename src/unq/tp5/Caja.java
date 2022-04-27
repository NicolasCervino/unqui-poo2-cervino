package unq.tp5;

import java.util.ArrayList;

public class Caja {
	private Double montoAPagar;
	private ArrayList<Producto> stock;
	
	public Caja() {
		this.montoAPagar = (double) 0;
		this.stock = new ArrayList<Producto>();
	}
	
	public void registrarProducto(Producto p) {
		this.montoAPagar += p.getPrecio();
	}
}
