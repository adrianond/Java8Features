package br.com.dantas.adriano.model;

public class ModelGenerico<T> {

	private T dados;

	public ModelGenerico() {

	}

	public ModelGenerico(T dados) {
		this.dados = dados;
	}

	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

}
