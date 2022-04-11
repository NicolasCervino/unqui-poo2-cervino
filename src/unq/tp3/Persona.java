package unq.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	// Atributos
	private String nombre;
	private LocalDate fechaNac;
	
	// Constructor
	public Persona(String _nombre, LocalDate _fecha) {
		this.setNombre(_nombre);
		this.setFechaNac(_fecha);
	}
	
	// Metodos

	public int getEdad() {
		// Obtengo fecha actual
		LocalDate hoy = LocalDate.now();
		// Calculo la edad
		int edad = Period.between(this.getFechaNac(), hoy).getYears();
		
		return edad;
	}
	
	// Indica si la persona es menor que la que recibe por parametro
	public boolean menorQue(Persona p) {
		return this.getEdad() < p.getEdad(); 
	}
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
}
