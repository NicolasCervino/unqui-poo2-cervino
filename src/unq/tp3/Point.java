package unq.tp3;

public class Point {
	// Atributos
	private int x;
	private int y;
	
	// Constructor con parametros
	public Point(int _x, int _y) {
		this.setX(_x);
		this.setY(_y);
	}
	
	// Constructor sin parametros
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	// Metodos
	public void moverPunto(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}
	
	public Point sumarPuntos(Point p) {
		// Creo el nuevo punto
		Point punto = new Point();
		
		// Seteo los valores
		punto.setX(this.getX()+p.getX());
		punto.setY(this.getY()+p.getY());
		
		return punto;
	}
	// Getters y Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
