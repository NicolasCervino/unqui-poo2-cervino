package unq.tp2;

import java.time.LocalDate;

public class Contratado extends Empleado {
	// Atributos
	int nroContrato;
	String medioDePago;
		
	// Constructor
	public Contratado(String _nombre, String _direccion, String _estadoCivil, LocalDate _fechaDeNacimiento, float _sueldoBasico, int _nroContrato, String _medioDePago) {
		nombre = _nombre;
		direccion = _direccion;
		estadoCivil = _estadoCivil;
		fechaDeNacimiento = _fechaDeNacimiento;
		sueldoBasico = _sueldoBasico;
		nroContrato = _nroContrato;
		medioDePago = _medioDePago;
	}
	
	// Metodos abstractos en la superclase
	@Override
	public float sueldoBruto() {
		return this.sueldoBasico;
	}

	@Override
	public float retenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float sueldoNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

}