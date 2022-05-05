package unq.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTestCase {
	private Producto p1;
	private Producto p2;
	private Supermercado supermercado;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		supermercado = new Supermercado("abc");
		
		p1 = new Producto("Arroz", 20d, supermercado);
		p2 = new Producto("Yerba", 50d, supermercado);
		
		
		supermercado.agregarProducto(p1);
		supermercado.agregarProducto(p1);
		
		supermercado.agregarProducto(p2);
		
		caja = new Caja();
	}
	
	@Test
	public void testCantProductos() {
		int cantP1 = supermercado.getStock().get(p1);
		int cantP2 = supermercado.getStock().get(p2);
		assertEquals(cantP1, 2);
		assertEquals(cantP2, 1);
	}
	
	@Test
	public void testDisminuirStock() {
		supermercado.disminuirStock(p1);
		
		int cantP1 = supermercado.getStock().get(p1);
		assertEquals(cantP1, 1);
	}
	
	@Test
	public void testDisminuirStockConCaja() {
		caja.registrar(p1);
		caja.registrar(p1);
		caja.registrar(p1);
		
		int cantP1 = supermercado.getStock().get(p1);
		assertEquals(cantP1, 0);
	}
}
