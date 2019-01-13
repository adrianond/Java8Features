package br.com.teste.simple.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AloMundo extends Applet {

	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Inicializando");
	}

	public void paint(Graphics g) {

        this.setBackground(Color.GREEN);
		g.setColor(Color.BLUE);
		this.setSize(400, 100);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão JVM: "+System.getProperty("java.version"), 20, 20);
		g.drawString("Versão S.O: "+System.getProperty("os.name"), 50, 50);
	}

	public void start() {
		System.out.println("Executando");
	}

	public void stop() {
		System.out.println("Parando");
	}

	public void destroy() {
		System.out.println("Eliminando");
	}

}
