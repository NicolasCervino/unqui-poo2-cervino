package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTestCase {
	private Point p1;
	private Point p2;
	
	@BeforeEach
	public void setup() {
		// Creo un Punto con parametros
		p1 = new Point(4,8);
		
		// Creo un Punto sin parametros
		p2 = new Point();
	}
	
	@Test
	public void testMoverPunto() {
		p1.moverPunto(20, 40);
		
		assertEquals(p1.getX(),20);
		assertEquals(p1.getY(),40);
	}
	
	@Test
	public void testSumarPuntos() {
		// Muevo los valores de p2 para que sean distintos de 0
		p2.moverPunto(30, 10);
		
		// Sumo los valores de p1 y p2
		Point resultado = p1.sumarPuntos(p2);
		
		// Compruebo los valores x y del resultado
		assertEquals(resultado.getX(),34);
		
		assertEquals(resultado.getY(),18);
	}
}
