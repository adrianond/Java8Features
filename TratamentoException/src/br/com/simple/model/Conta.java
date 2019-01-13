package br.com.simple.model;

public class Conta {

	private String numero;
	private String digito;
	private Double saldo;

	public Conta() {

	}

	public Conta(String numero, String digito, Double saldo) {
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

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
