package unq.tp3;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTestCase {
	private Persona p1;
	private Persona p2;
	
	@BeforeEach
	public void setup() {
		// Creo una persona
		p1 = new Persona("Nicolas", LocalDate.of(1999, 7, 17));
		p2 = new Persona("Roberto", LocalDate.of(1959, 8, 7));
	}
	
	// Pruebo obtener la edad
	@Test
	public void testEdad() {
		// Obtengo la edad
		int resultado = p1.getEdad();
		
		// Compruebo el resultado
		assertEquals(resultado,22);
	}
	
	// Prueba menorQue
	@Test
	public void testMenorQue() {
		assert(p1.menorQue(p2));
	}
}