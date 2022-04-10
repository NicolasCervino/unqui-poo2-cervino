package unq.tp3;

import java.util.ArrayList;
 
public class Counter {
	// Atributos
	private ArrayList<Integer> numeros;
	
	// Constructor con parametro
	public Counter(ArrayList<Integer> _numeros) {
		this.setNumeros(_numeros);
	}
	
	// Constructor vacio
	public Counter() {
		numeros= new ArrayList<Integer>();
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
	
	// Devuelve los numeros del array que son multiplos del numero dado por parametro
	public ArrayList<Integer> getMultiplesOf(int _number) {
		ArrayList<Integer> numeros = this.getNumeros();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for(int i=0; i< numeros.size(); i++) {
			if(isMultiple(_number,numeros.get(i))) {
				resultado.add(numeros.get(i));
			}
		}
		return resultado;
	}
	
	// Devuelve la cantidad de numeros del array que son multiplos del numero dado por parametro
	public int multiplesOf(int _number) {
		return getMultiplesOf(_number).size();
	}
	
	
	// Indica si un numero es par
	private boolean isEven(int _numero) {
		return _numero%2 == 0;
	}
	
	//Indica si 2 numeros son multiplos entre si
	private boolean isMultiple(int num1, int num2) {
		return num1%num2 == 0;
	}
	
	//Getters y Setters
	public ArrayList<Integer> getNumeros() {
		return this.numeros;
	}
	
	public void setNumeros(ArrayList<Integer> _numeros) {
		this.numeros = _numeros;
	}
	
}