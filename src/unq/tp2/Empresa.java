package unq.tp2;

import java.util.ArrayList;

public class Empresa {
	// Atributos
	private String nombre;
	private int cuit;
	ArrayList<Empleado> empleados;
	
	// Metodos
	
	//Constructor
	public Empresa(String _nombre, int _cuit) {
		this.setNombre(_nombre);
		this.setCuit(_cuit);
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCuit() {
		return cuit;
	}
	
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}
	
	public float totalSueldosNeto() {
		float sueldos = 0;
		for(int i = 0; i < empleados.size(); i = i++) {
		   sueldos = sueldos + empleados.get(i).sueldoNeto();
		}
		return sueldos;
	}
	
	public float totalSueldosBrutos() {
		float sueldos = 0;
		for(int i = 0; i < empleados.size(); i = i++) {
		   sueldos = sueldos + empleados.get(i).sueldoBruto();
		}
		return sueldos;
	}
	
	public float totalRetenciones() {
		float retenciones = 0;
		for(int i = 0; i < empleados.size(); i = i++) {
		   retenciones = retenciones + empleados.get(i).retenciones();
		}
		return retenciones;
	}
}