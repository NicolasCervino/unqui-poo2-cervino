package unq.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaTestCase {
	private Producto p1;
	private Producto p2;
	
	private Supermercado supermercado;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		p1 = new Producto("Arroz", 20d);
		p2 = new Producto("Yerba", 50d);
		
		supermercado = new Supermercado("abc");
		
		caja = new Caja(supermercado);
		
	}
	
	@Test
	public void testGetMontoCajaNueva() {
		assertEquals(caja.getMonto(), 0);
	}
	
	@Test
	public void testGetMontoCajaConProductos() {
		caja.registrarProducto(p1);
		caja.registrarProducto(p2);
		assertEquals(caja.getMonto(), 70);
	}
	
	
}
