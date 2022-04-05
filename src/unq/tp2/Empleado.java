package unq.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	// Atributos
	String nombre;
	String direccion;
	String estadoCivil;
	LocalDate fechaDeNacimiento;
	float sueldoBasico;
	
	// Metodos
	
	public int edad() {		
		LocalDate fechaNacimiento = this.fechaDeNacimiento;
		LocalDate hoy = LocalDate.now();
		// Calculo edad
		Period edad = Period.between(fechaNacimiento, hoy);
		
		return edad.getYears();
	}
	// Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	// Metodos abstractos, cada subclase debe definirlo
	abstract public float sueldoBruto();
	
	abstract public float retenciones();
	
	abstract public float sueldoNeto();
}