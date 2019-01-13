package br.com.dantas.adriano.model;

public class PessoaTreeSet implements Comparable<PessoaTreeSet>{

	private String nome;
	private String sobreNome;
	private String idade;
	private String rg;
	private String cpf;

	public PessoaTreeSet(String nome, String sobreNome, String idade, String rg, String cpf) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}

	public PessoaTreeSet() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public int compareTo(PessoaTreeSet p) {
		if (this.nome.length() < p.getNome().length()) {
			return -1;
		} else if (this.nome.length() > p.getNome().length()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Pessoa " + ": " + nome + " | " + "Sobrenome: " + sobreNome + " | " + "idade: " + idade + " | " + "rg: "
				+ rg + " | " + "cpf: " + cpf;
	}
}
