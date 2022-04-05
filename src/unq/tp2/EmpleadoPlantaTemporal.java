package unq.tp2;

import java.time.*;

public class EmpleadoPlantaTemporal extends Empleado {
	// Atributos
	LocalDate fechaFin;
	int cantHorasExtras;
	
	// Constructor
	public EmpleadoPlantaTemporal(String _nombre, String _direccion, String _estadoCivil, LocalDate _fechaDeNacimiento, float _sueldoBasico, LocalDate _fechaFin) {
		nombre = _nombre;
		direccion = _direccion;
		estadoCivil = _estadoCivil;
		fechaDeNacimiento = _fechaDeNacimiento;
		sueldoBasico = _sueldoBasico;
		fechaFin = _fechaFin;
		cantHorasExtras = 0; // Inicializo las horas extras en 0?
	}
	// Metodos Privados(subtareas)
	private float obraSocial() {
		float costoFijo = (this.sueldoBruto()*10)/100;
		if (this.edad()>50) {
			return costoFijo +25;
		}
		else {
			return costoFijo;
		}
	}
	
	// Metodos abstractos en la superclase
	@Override
	public float sueldoBruto() {
		float bonoXHorasExtras = this.cantHorasExtras*40;
		return this.sueldoBasico + bonoXHorasExtras;
	}

	@Override
	public float retenciones() {
		float obraSocial = this.obraSocial();
		float aportes = this.sueldoBruto()+this.cantHorasExtras*5;
		return obraSocial + aportes;
	}

	@Override
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

}