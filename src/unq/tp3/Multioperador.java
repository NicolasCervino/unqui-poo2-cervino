package unq.tp3;

import java.util.ArrayList;
import java.util.Collections;

public class Multioperador {
	// Atributos
	private ArrayList<Integer> numeros;
	
	// Constructor sin parametro
	public Multioperador() {
		numeros = new ArrayList<Integer>();
	}
	
	// Getters y Setters
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	// Metodos
	
	// Agrega un numero al arrayList
	public void agregarNumero(int _numero) {
		numeros.add(_numero);
	}
	
	// Devuelve la suma de todos los numeros del arraylist
	public int suma() {
		int resultado = 0;
		for(int i=0; i < this.getNumeros().size(); i++) {
			resultado = resultado + this.getNumeros().get(i);
		}
		return resultado;
	}
	
	// Devuelve la resta de todos los numeros del arraylist
	public int resta() {
		ArrayList<Integer> numeros = this.getNumeros();
		
		// Compruebo que el array no este vacio
		if(numeros.size() == 0) {
			return 0;
		}
		else {
			// Obtengo el primer elemento
			int resultado = numeros.get(0);
		
			for(int i=1; i < numeros.size(); i++) {
				resultado = resultado - numeros.get(i);
			}
			return resultado;
		}
	}
	
	// Devuelve la multiplicacion de todos los numeros del arraylist
	public int multiplicacion() {
		int resultado = 1;
		for(int i=0; i < this.getNumeros().size(); i++) {
			resultado = resultado * this.getNumeros().get(i);
		}
		return resultado;
	}
}
