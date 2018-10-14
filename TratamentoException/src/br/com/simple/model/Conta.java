package br.com.simple.model;

public class Conta {

	private String numero;
	private String digito;
	private int saldo;

	public Conta() {

	}

	public Conta(String numero, String digito, int saldo) {
		this.numero = numero;
		this.digito = digito;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
