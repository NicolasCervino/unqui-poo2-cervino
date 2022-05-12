package unq.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		ArrayList<String> cartas = new ArrayList<>();
		// Agrego el numero de las cartas a un array
		cartas.add(c1.substring(0, c1.length()-1));
		cartas.add(c2.substring(0, c2.length()-1));
		cartas.add(c3.substring(0, c3.length()-1));
		cartas.add(c4.substring(0, c4.length()-1));
		cartas.add(c5.substring(0, c5.length()-1));
		
		// Agrego las cartas del ArrayList a un Set para obtener todos los numeros sin repetidos
		HashSet<String> cartasSinRepetidos = new HashSet<>();
		for (String carta: cartas) {
			cartasSinRepetidos.add(carta);
		}
		
		// Consulto si alguna de las cartas del Set se repite en el ArrayList al menos 4 veces
		for (String carta: cartasSinRepetidos) {
			if(Collections.frequency(cartas, carta) >= 4) {
				return true;
			}
		}
		return false;
	}
	
	// Esta version devuelve strings e indica si la jugada es Color, Poquer, Trio o Nada
	public String verificarV2(String c1, String c2, String c3, String c4, String c5) {
		// Agrego el numero de las cartas a un array
		ArrayList<String> valorCartas = new ArrayList<>();
		
		valorCartas.add(c1.substring(0, c1.length()-1));
		valorCartas.add(c2.substring(0, c2.length()-1));
		valorCartas.add(c3.substring(0, c3.length()-1));
		valorCartas.add(c4.substring(0, c4.length()-1));
		valorCartas.add(c5.substring(0, c5.length()-1));
		
		// Agrego el palo de las cartas a un array
		ArrayList<String> paloCartas = new ArrayList<>();
		
		paloCartas.add(c1.substring(c1.length()-1));
		paloCartas.add(c2.substring(c2.length()-1));
		paloCartas.add(c3.substring(c3.length()-1));
		paloCartas.add(c4.substring(c4.length()-1));
		paloCartas.add(c5.substring(c5.length()-1));
		
		// Agrego las cartas del ArrayList a un Set para obtener todos los numeros sin repetidos
		HashSet<String> valorCartasSinRepetidos = new HashSet<>();
		for (String carta: valorCartas) {
			valorCartasSinRepetidos.add(carta);
		}
		
		// Agrego las cartas del ArrayList a un Set para obtener todos los numeros sin repetidos
		HashSet<String> paloCartasSinRepetidos = new HashSet<>();
		for (String carta: paloCartas) {
			paloCartasSinRepetidos.add(carta);
		}
		
		// Verifico Color
		for (String carta: paloCartasSinRepetidos) {
			if (Collections.frequency(paloCartas, carta) == 5) {
				return "Color";
			}
		}
		
		// Verifico Poker o Trio
		// Consulto si alguna de las cartas del Set se repite en el ArrayList al menos 4 veces
		for (String carta: valorCartasSinRepetidos) {
			if (Collections.frequency(valorCartas, carta) >= 4) {
				return "Poquer";
			}
			else if (Collections.frequency(valorCartas, carta) == 3) {
				return "Trio";
			}
		}
		return "Nada";
	}
	
	// Esta version del metodo recibe cartas en lugar de strings
	public String verificarV3(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		// Agrego las cartas a un arraylist
		ArrayList<Carta> cartas = new ArrayList<>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		
		// Compruebo las jugadas
		if (hayPoquer(cartas)) {
			return "Poquer";
		}
		else if (hayColor(cartas)){
			return "Color";
		}
		else if (hayTrio(cartas)) {
			return "Trio";
		}
		else {
			return "Nada";
		}
	}
	
	// Dadas 5 cartas, indica si 4 tienen el mismo valor
	private boolean hayPoquer(ArrayList<Carta> cartas) {
		// Creo un ArrayList con todos los valores de las cartas
		ArrayList<String> valores = new ArrayList<>();
		for (Carta carta: cartas) {
			valores.add(carta.getValor());
		}
		
		// Agrego los valores de las cartas del ArrayList a un Set para obtener todos los valores sin repetidos
		HashSet<String> setValores = new HashSet<>();
		for (String valor: valores) {
			setValores.add(valor);
		}
		
		// Compruebo si la frecuencia de alguno de los valores del set en el arrayList es igual a 4
		for (String valor: setValores) {
			if (Collections.frequency(valores, valor) == 4) {
				return true;
			}
		}
		return false;
	}
	
	// Dado un ArrayList de 5 cartas indica si las 5 son del mismo Palo
	private boolean hayColor(ArrayList<Carta> cartas) {
		// Obtengo el palo de la primera carta
		String palo = cartas.get(0).getPalo();
		// Filtro las cartas del ArrayList cuyo palo sea igual al de la primera
		List<Carta> resultado = cartas.stream().filter(carta -> carta.getPalo() == palo).collect(Collectors.toList());
		// Si todas tienen el mismo palo, debe haber 5 cartas en el resultado
		return resultado.size() == 5;
	}
	
	// Dadas 5 cartas, indica si 3 tienen el mismo valor
	private boolean hayTrio(ArrayList<Carta> cartas) {
		// Creo un ArrayList con todos los valores de las cartas
		ArrayList<String> valores = new ArrayList<>();
		for (Carta carta: cartas) {
			valores.add(carta.getValor());
		}
		
		// Agrego los valores de las cartas del ArrayList a un Set para obtener todos los valores sin repetidos
		HashSet<String> setValores = new HashSet<>();
		for (String valor: valores) {
			setValores.add(valor);
		}
		
		// Compruebo si la frecuencia de alguno de los valores del set en el arrayList es igual a 3
		for (String valor: setValores) {
			if (Collections.frequency(valores, valor) == 3) {
				return true;
			}
		}
		return false;
	}
}
