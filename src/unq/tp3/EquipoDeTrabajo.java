package unq.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	// Atributos
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	// Constructor
	public EquipoDeTrabajo(String _nombre) {
		this.setNombre(_nombre);
		this.setIntegrantes(new ArrayList<Persona>());
	}
	
	// Metodos
	public int promedioEdad() {
		int totalEdad = 0;
		int totalPersonas =  this.getIntegrantes().size();
		// Sumo la edad de todas las personas en el ArrayList
		for(int i=0; i <  totalPersonas; i++) {
			totalEdad += this.getIntegrantes().get(i).getEdad();
		}
		return totalEdad / totalPersonas;
	}
	
	// Agrega una persona al Equipo
	public void agregarIntegrante(Persona _integrante) {
		this.getIntegrantes().add(_integrante);
	}
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	private void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
}
