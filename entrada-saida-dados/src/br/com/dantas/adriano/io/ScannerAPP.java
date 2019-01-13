package br.com.dantas.adriano.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAPP {
	
	public static void main(String[] args) {
		
		//cancularMedia();
		
		try {
			somarValuesFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void somarValuesFile() throws FileNotFoundException {
		Scanner entrada = new Scanner(new FileReader("C:/desenv/workspace/CursoJava8/entrada-saida-dados/numeros.txt"));
		double soma = 0;
		String valor;
		
		while(entrada.hasNext()) {
			valor  = entrada.next();
			soma = soma + Double.parseDouble(valor);
		}
		entrada.close();
		JOptionPane.showMessageDialog(null, "Asoma dos valores é: " + soma);
	}

	private static void cancularMedia() {
		Scanner entrada  = new Scanner(System.in);
		Formatter saida  = new Formatter(System.out);
		
		System.out.println("Informe a nota 1 : ");
		float n1 = entrada.nextFloat();
		
		System.out.println("Informe a nota 2 : ");
		float n2 = entrada.nextFloat();
		
		System.out.println("Informe a nota 3 : ");
		float n3 = entrada.nextFloat();
		
		System.out.println("Informe a nota 4 : ");
		float n4 = entrada.nextFloat();
		
		float media = (n1 + n2 + n3+ n3) / 4;
		
		saida.format("Média = %.2f", media);
		entrada.close();
		saida.close();
	}
	

}
