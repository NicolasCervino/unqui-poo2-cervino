package unq.tp7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartaTest {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	
	@BeforeEach
	public void setUp() {
		carta1 = new Carta("10", "Diamante");
		carta2 = new Carta("5", "Corazones");
		carta3 = new Carta("5", "Corazones");
	}
	
	@Test
	public void sePuedeConocerElValorDeUnaCarta() {
		assertEquals("10", carta1.getValor());
	}
	
	@Test
	public void sePuedeConocerElPaloDeUnaCarta() {
		assertEquals("Diamante", carta1.getPalo());
	}
	
	@Test
	public void sePuedeSaberSi2CartasSonIguales() {
		assertEquals(carta2, carta3);
	}
	
	@Test
	public void sePuedeSaberSiUnaCartaEsMayorQueOtra() {
		assertTrue(carta1.mayorQue(carta2));
	}
	
	@Test
	public void sePuedeSaberSiUnaCartaEsMenorQueOtra() {
		assertTrue(carta2.menorQue(carta1));
	}
}
