package br.com.teste.simple.applet;

import java.applet.Applet;

public class Identidade extends Applet {

	private static final long serialVersionUID = 1L;

	public void init() {

		// crio uma matriz - 3 linhas e 3 colunas
		int I[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// verifico se os elementos são da diagonal
				if (i == j) 
					I[i][j] = 1;
				 else 
					I[i][j] = 0;
					System.out.print(I[i][j]);;
			}
			System.out.println("\n===");
		}
	}
}
