package unq.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaTestCase {
	private Producto p1;
	private Producto p2;
	
	private Factura f1;
	private Factura f2;
	
	private Supermercado supermercado;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		supermercado = new Supermercado("abc");
		p1 = new Producto("Arroz", 20d, supermercado);
		p2 = new Producto("Yerba", 50d, supermercado);
		
		supermercado.agregarProducto(p1);
		supermercado.agregarProducto(p2);
		
		f1 = new Impuesto(500d);
		f2 = new Servicio(125d, 22);
		
		caja = new Caja();
		
	}
	
	@Test
	public void testGetMontoCajaNueva() {
		assertEquals(caja.getMonto(), 0);
	}
	
	@Test
	public void testGetMontoCajaConProductos() {
		caja.registrar(p1);
		caja.registrar(p2);
		assertEquals(caja.getMonto(), 70);
	}
	
	@Test
	public void testGetMontoConFacturas() {
		caja.registrar(f1);
		caja.registrar(f2);
		
		assertEquals(caja.getMonto(), 3250);
	}
}
