package br.com.dantas.adriano.io;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamAPP {
	
	public static void byteStream() throws IOException {
		
		FileInputStream in = new  FileInputStream("C:/desenv/workspace/CursoJava8/entrada-saida-dados/teste.txt");
		int contador = 0;
		
		while((in.read()) != -1)
			contador++;
		System.out.println("Número de caracteres é: " + contador);
		in.close();
		
	}
	
public static void caracteresStream(char letra) throws IOException {
		
		FileInputStream in = new  FileInputStream("C:/desenv/workspace/CursoJava8/entrada-saida-dados/teste.txt");
		int contador = 0;
		int c;
		
		while((c = in.read()) != -1) {
			if(c == letra) {
				contador++;
			}
		}
			contador++;
		System.out.println("Número de vezes que a letra informada aparece é: " + contador);
		in.close();
		
	}
	
	public static void main(String[] args) {
		
		try {
			//byteStream();
			
			System.out.println("Informa a letra a ser encotrada:");
			char letra = (char) System.in.read();
			caracteresStream(letra);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
