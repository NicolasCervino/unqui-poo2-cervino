package unq.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReciboDeHaberes {
	// Atributos
	String nombreEmpleado;
	String direccionEmpleado;
	LocalDate fechaEmision;
	float sueldoBruto;
	float sueldoNeto;
	ArrayList<String> desgloce;
	
	// Constructor
	public ReciboDeHaberes(Empleado _empleado) {
		nombreEmpleado = _empleado.getNombre();
		direccionEmpleado = _empleado.getDireccion();
		fechaEmision = LocalDate.now();
		sueldoBruto = _empleado.sueldoBruto();
		sueldoNeto = _empleado.sueldoNeto();
		//desgloce??
	}
}