package br.com.teste.simple.applet;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Avaliacao extends Applet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {

		String notas = JOptionPane.showInputDialog("Informe a nota");
		float nota = Float.parseFloat(notas);

		if (nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Nota Inválida! Favor informar uma nota de 0 a 100");
			// chamo o método paint novamente (recursividade), até ser informado
			// uma nota válida
			paint(null);
		} else {
			if (nota < 50)
				JOptionPane.showMessageDialog(null, "Nota Insuficiente");
			else if (nota < 70)
				JOptionPane.showMessageDialog(null, "Regular");
			else if (nota < 90)
				JOptionPane.showMessageDialog(null, "Bom");
			else
				JOptionPane.showMessageDialog(null, "Excelente");
			System.exit(0);
		}
	}
}
