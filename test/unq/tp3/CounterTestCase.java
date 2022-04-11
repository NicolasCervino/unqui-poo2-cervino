package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter contador;
	
	@BeforeEach
	public void setup() throws Exception{
		// Se crea el contador
		contador = new Counter();
		
		// Se agregan los numeros, un par y nueve impares
		contador.addNumber(1);
		contador.addNumber(3);
		contador.addNumber(5);
		contador.addNumber(7);
		contador.addNumber(9);
		contador.addNumber(1);
		contador.addNumber(1);
		contador.addNumber(1);
		contador.addNumber(1);
		contador.addNumber(4);
	}
	
	// Pruebo la cantidad de numeros pares
	@Test
	public void testEvenNumbers() {
		// Almaceno la cantidad de pares
		int pares = contador.getEvenOcurrences();
		
		// Testeo que la cantidad coincida
		assertEquals(pares,1);
	}
	
	// Pruebo la cantidad de numeros impares
	@Test
	public void testOddNumbers() {
		// Almaceno la cantidad de pares
		int impares = contador.getOddOcurrences();
		
		// Testeo que la cantidad coincida
		assertEquals(impares,9);
	}
	
	// Pruebo los multiplos de 4
	@Test
	public void testGetMultiplyNumbers() {
		// Almaceno la cantidad de multiplos
		ArrayList<Integer> multiplos = contador.getMultiplesOf(4);
		
		// Creo un array con los multiplos esperados
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		resultado.add(4);
		
		// Testeo que la cantidad coincida
		assertEquals(multiplos,resultado);
	}
	
	// Pruebo la cantidad de multiplos de 4
	@Test
	public void testMultiplyNumbers() {
		// Almaceno la cantidad de multiplos
		int multiplos = contador.multiplesOf(4);
		
		
		// Testeo que la cantidad coincida
		assertEquals(multiplos,1);
	}
	
}
