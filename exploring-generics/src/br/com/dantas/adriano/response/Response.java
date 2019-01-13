package br.com.dantas.adriano.response;

/**
 * Classe utilizada apenas para transportar o objeto de retorno para o front end
 * 
 * @author 660454
 *
 * @param <T>
 */
public class Response<T> {

	private T dados;
	private String msgError;

	public T getDados() {
		return dados;
	}

	public void setDados(T dados) {
		this.dados = dados;
	}

	public String getMsgError() {
		return msgError;
	}

	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}

}
