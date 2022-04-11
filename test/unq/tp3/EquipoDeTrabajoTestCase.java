package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo;
	
	@BeforeEach
	public void setup() {
		// Creo un nuevo Equipo
		equipo = new EquipoDeTrabajo("Equipo1");
		
		// Creo 5 Personas
		Persona p1 = new Persona("Nicolas", LocalDate.of(1999, 7, 17));
		Persona p2 = new Persona("Roberto", LocalDate.of(1959, 8, 7));
		Persona p3 = new Persona("Juan", LocalDate.of(2002, 03, 14));
		Persona p4 = new Persona("Ema", LocalDate.of(1966, 8, 13));
		Persona p5 = new Persona("Ana", LocalDate.of(1984, 4, 24));
		
		// Agrego personas al equipo
		equipo.agregarIntegrante(p1);
		equipo.agregarIntegrante(p2);
		equipo.agregarIntegrante(p3);
		equipo.agregarIntegrante(p4);
		equipo.agregarIntegrante(p5);
	}
	
	// Pruebo promedio de edad
	@Test
	public void testPromedioEdad() {
		int resultado = equipo.promedioEdad();
		
		assertEquals(resultado,39);
	}
}
