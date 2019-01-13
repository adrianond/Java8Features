package br.com.dantas.adriano.service;

import java.util.List;

import br.com.dantas.adriano.model.Funcionario;
import br.com.dantas.adriano.model.Pessoa;

public interface InterfaceService<T> {

	public T consultar(Pessoa p, Funcionario f);
	
	public List<?> retornoConsultaGeral(Funcionario f);

}
