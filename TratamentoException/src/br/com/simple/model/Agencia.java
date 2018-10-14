package br.com.simple.model;

public class Agencia {

	private String numero;
	private Conta conta;

	public Agencia() {

	}

	public Agencia(String numero, Conta conta) {
		this.numero = numero;
		this.conta = conta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
