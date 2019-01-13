package br.com.dantas.adriano.dao;

import java.util.List;

public interface IDao<T> {
	
	public List<?> criar(T entidade);
	public List<?> deletar(T entidade);
	public List<?> alterar(T entidade);
	public List<?> ler(T entidade);

}
