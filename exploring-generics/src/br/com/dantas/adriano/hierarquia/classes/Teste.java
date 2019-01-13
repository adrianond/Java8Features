package br.com.dantas.adriano.hierarquia.classes;

import java.util.Vector;

public class Teste {
	
	public static void main(String[] args) {
		
		Vector<Shape> picture = new Vector<Shape>();
		picture.add(new Circle());
		picture.add(new Rectangle());
		Rectangle rect = (Rectangle) picture.get(1);
		
		Circle c = new Circle();
		c.teste(new Circle());
		c.teste(new Shape());
		c.teste(new Rectangle());
		
		Rectangle r = new Rectangle();
		r.teste(new Rectangle());
		r.teste(new Shape());
		r.teste(new Circle());
	}

}
