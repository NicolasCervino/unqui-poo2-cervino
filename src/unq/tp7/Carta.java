package unq.tp7;

public class Carta implements Comparable<Carta> {
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.setValor(valor);
		this.setPalo(palo);
	}
	
	// Metodo para saber si 2 cartas son iguales
	@Override
	public boolean equals(Object c) {
		if (c instanceof Carta) {
			Carta carta = (Carta) c;
			return this.getValor().equals(carta.getValor()) && this.getPalo().equals(carta.getPalo());
		}
		return false;
	}
	
	// Metodo para poder comparar Cartas por valor
	@Override
	public int compareTo(Carta carta) {
		return (this.getValor().compareTo(carta.getValor()));
	}
	
	public boolean mayorQue(Carta c) {
		return this.compareTo(c) < 0;
	}
	
	public boolean menorQue(Carta c) {
		return this.compareTo(c) > 0;
	}
	
	public boolean igualA(Carta c) {
		return this.compareTo(c) == 0;
	}
	
	// Getters y Setters
	public String getValor() {
		return this.valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getPalo() {
		return this.palo;
	}
	
	public void setPalo(String palo) {
		this.palo = palo;
	}
}
