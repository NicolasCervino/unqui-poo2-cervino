package unq.tp7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PokerStatusTest {
	private PokerStatus pokerstatus;
	
	@BeforeEach
	public void setUp() {
		pokerstatus = new PokerStatus();
	}
	
	@Test
	public void testPoker4CartasIguales() {
		String carta = "10D";
		System.out.println(carta.substring(0, carta.length()-1));
		assertTrue(pokerstatus.verificar("1C","1P","1D","1T","9D"));
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
