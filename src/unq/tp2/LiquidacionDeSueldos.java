package unq.tp2;

import java.util.ArrayList;

public class LiquidacionDeSueldos {
	// Atributos
	ArrayList<ReciboDeHaberes> recibos;
	
	// Constructor
	public LiquidacionDeSueldos(Empresa _empresa) {
		for(int i = 0; i < _empresa.getEmpleados().size(); i = i++) {
				recibos.add(new ReciboDeHaberes(_empresa.getEmpleados().get(i)));
			}
	}
}