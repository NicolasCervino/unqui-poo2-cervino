package unq.tp3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	private Multioperador multioperador;
	
	@BeforeEach
	public void setup() {
		// Se crea el multioperador
		multioperador = new Multioperador();
		
		// Se agregan los numeros
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(5);
		multioperador.agregarNumero(8);
		multioperador.agregarNumero(20);
	}
	
	// Pruebo la suma
	@Test
	public void testSuma() {
		assertEquals(multioperador.suma(),35);
	}
	
	// Pruebo la resta
	@Test
	public void testResta() {
		assertEquals(multioperador.resta(),-31);
	}
	
	// Pruebo la multiplicacion
	@Test
	public void testMultiplicacion() {
		assertEquals(multioperador.multiplicacion(),1600);
	}
}
