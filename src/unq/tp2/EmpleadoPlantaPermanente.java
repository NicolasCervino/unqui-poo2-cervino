package unq.tp2;

import java.time.*;

public class EmpleadoPlantaPermanente extends Empleado {
	// Atributos
	int cantidadDeHijos;
	LocalDate fechaInicioEnEmpresa;
	
	// Constructor
	public EmpleadoPlantaPermanente(String _nombre, String _direccion, String _estadoCivil, LocalDate _fechaDeNacimiento, float _sueldoBasico, LocalDate _fechaInicioEnEmpresa) {
		nombre = _nombre;
		direccion = _direccion;
		estadoCivil = _estadoCivil;
		fechaDeNacimiento = _fechaDeNacimiento;
		sueldoBasico = _sueldoBasico;
		fechaInicioEnEmpresa = _fechaInicioEnEmpresa;
	}
	// Metodos propios de la subclase
	public int antiguedad() {
		LocalDate fechaInicioEnEmpresa = this.fechaInicioEnEmpresa;
		LocalDate hoy = LocalDate.now();
		// Calculo antiguedad
		Period antiguedad = Period.between(fechaInicioEnEmpresa, hoy);
		
		return antiguedad.getYears();
	}
	
	// Metodos Privados(subtareas)
	private float salarioFamiliar() {
		// Bonos
		float asignacionXHijo = 150*this.cantidadDeHijos;
		float asignacionXConyuge = this.bonoPorConyuge();
		float bonoXAntiguedad = 50*this.antiguedad();
		return asignacionXHijo + asignacionXConyuge + bonoXAntiguedad;
	}
	
	private float bonoPorConyuge() {
		if (this.estadoCivil == "casado") {
			return 150;
		}
		else {
			return 0;
		}
	}
	
	// Metodos abstractos en la superclase
	@Override
	public float sueldoBruto() {
		return this.sueldoBasico + this.salarioFamiliar();
	}

	@Override
	public float retenciones() {
		float obraSocial = (this.sueldoBruto()*10)/100 + 20*this.cantidadDeHijos;
		float aportes = this.sueldoBruto()*15/100;
		return obraSocial+aportes;
	}

	@Override
	public float sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

}