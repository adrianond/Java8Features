package stream.simple.model;

public class Funcionario {

	private String nome;
	private String idade;
	private String cargo;

	public Funcionario(String nome, String idade, String cargo) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
