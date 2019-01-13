package br.com.dantas.adriano.model;

public class Funcionario {

	private String idFunc;
	private String data_Admissao;
	private String nome;


	public Funcionario(String nome, String idFunc, String data_Admissao) {
		this.nome = nome;
		this.idFunc = idFunc;
		this.data_Admissao = data_Admissao;
	}

	public Funcionario() {

	}

	public String getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(String idFunc) {
		this.idFunc = idFunc;
	}

	public String getData_Admissao() {
		return data_Admissao;
	}

	public void setData_Admissao(String data_Admissao) {
		this.data_Admissao = data_Admissao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
