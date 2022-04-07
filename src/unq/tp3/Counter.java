package unq.tp3;

import java.util.ArrayList;
 
public class Counter {
	// Atributos
	private ArrayList<Integer> numeros;
	
	// Constructor
	public Counter(ArrayList<Integer> _numeros) {
		this.setNumeros(_numeros);
	}
	
	// Metodos
	public void addNumber(int _numero) {
		this.getNumeros().add(_numero);
	}
	
	// Devuelve la cantidad de numeros pares
	public int getEvenOcurrences() {
		ArrayList<Integer> numeros = this.getNumeros();
		int resultado = 0;
		for(int i=0; i < numeros.size(); i++ ) {
			if (isEven(numeros.get(i))) {
				resultado++;
			}
		}
		return resultado;
	}
	
	// Devuelve la cantidad de numeros impares
	public int getOddOcurrences() {
		ArrayList<Integer> numeros = this.getNumeros();
		int resultado = 0;
		for(int i=0; i < numeros.size(); i++ ) {
			if (!isEven(numeros.get(i))) {
				resultado++;
			}
		}
		return resultado;
	}
	
	// Indica si un numero es par
	private boolean isEven(int _numero) {
		return _numero%2 == 0;
	}
	
	//Getters y Setters
	public ArrayList<Integer> getNumeros() {
		return this.numeros;
	}
	
	public void setNumeros(ArrayList<Integer> _numeros) {
		this.numeros = _numeros;
	}
	
}