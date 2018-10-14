package br.com.simple.model;

public class Banco {

	private String numero;
	private String banco;
	private Agencia agencia;

	public Banco() {

	}

	public Banco(Agencia agencia, String banco, String numero) {
		this.agencia = agencia;
		this.banco = banco;
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
