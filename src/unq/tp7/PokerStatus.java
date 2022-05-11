package unq.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

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
}
