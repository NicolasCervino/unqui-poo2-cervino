package unq.tp7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerStatusTest {
	private PokerStatus pokerstatus;
	
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
}
