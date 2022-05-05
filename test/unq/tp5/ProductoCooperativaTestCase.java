package unq.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoCooperativaTestCase {
	private Producto p1;
	private Supermercado s;
	
	@BeforeEach
	public void setUp() {
		p1 = new ProductoCooperativa("Arroz", 20d, s);
	}
	
	@Test
	public void testPrecioProducto() {
		double precioP1 = p1.getPrecio();
		
		assertEquals(precioP1, 18);
	}
}
