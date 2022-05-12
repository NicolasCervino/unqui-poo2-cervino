package unq.tp7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerStatusTest {
	private PokerStatus pokerstatus;
	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	
	@BeforeEach
	public void setUp() {
		pokerstatus = new PokerStatus();
	}
	
	@Test
	public void testPoker4CartasIguales() {
		boolean resultado = this.pokerstatus.verificar("1C","1P","1D","1T","9D");
		assertTrue(resultado);
	}
	
	@Test
	public void testPoker5CartasIguales() {
		boolean resultado = this.pokerstatus.verificar("1C","1P","1D","1T","1D");
		assertTrue(resultado);
	}
	
	@Test
	public void testPoker4CartasDistintas() {
		assertFalse(pokerstatus.verificar("1C","3P","7D","1T","9D"));
	}
	
	@Test
	public void testPoker3CartasIguales() {
		assertFalse(pokerstatus.verificar("1C","1P","1D","5T","10D"));
	}
	
	@Test
	public void testPoker4CartasIgualesLetras() {
		assertTrue(pokerstatus.verificar("JC","JP","JD","JT","9D"));
	}
	
	@Test
	public void testColor() {
		assertEquals("Color", pokerstatus.verificarV2("1D","2D","5D","JD","KD"));
	}
	
	@Test
	public void testTrio() {
		assertEquals("Trio", pokerstatus.verificarV2("1D","1P","4D","1C","7D"));
	}
	
	@Test
	public void testPoker() {
		assertEquals("Poquer", pokerstatus.verificarV2("1D","1P","1C","5T","1T"));
	}
	
	@Test
	public void testNada() {
		assertEquals("Nada", pokerstatus.verificarV2("1D","8D","1C","5T","9C"));
	}
	
	@Test
	public void testPokerConCartas() {
		c1 = new Carta("1", "Diamante");
		c2 = new Carta("1", "Treboles");
		c3 = new Carta("1", "Picas");
		c4 = new Carta("1", "Corazones");
		c5 = new Carta("K", "Diamante");
		
		assertEquals("Poquer", pokerstatus.verificarV3(c1,c2,c3,c4,c5));
	}
	
	@Test
	public void testColorConCartas() {
		c1 = new Carta("1", "Diamante");
		c2 = new Carta("2", "Diamante");
		c3 = new Carta("5", "Diamante");
		c4 = new Carta("J", "Diamante");
		c5 = new Carta("K", "Diamante");
		
		assertEquals("Color", pokerstatus.verificarV3(c1,c2,c3,c4,c5));
	}
	@Test
	public void testTrioConCartas() {
		c1 = new Carta("1", "Diamante");
		c2 = new Carta("1", "Treboles");
		c3 = new Carta("5", "Diamante");
		c4 = new Carta("1", "Corazones");
		c5 = new Carta("K", "Diamante");
		
		assertEquals("Trio", pokerstatus.verificarV3(c1,c2,c3,c4,c5));
	}
	
	@Test
	public void testNadaConCartas() {
		c1 = new Carta("1", "Diamante");
		c2 = new Carta("2", "Diamante");
		c3 = new Carta("5", "Corazones");
		c4 = new Carta("J", "Diamante");
		c5 = new Carta("K", "Diamante");
		assertEquals("Nada", pokerstatus.verificarV3(c1,c2,c3,c4,c5));
	}
}
