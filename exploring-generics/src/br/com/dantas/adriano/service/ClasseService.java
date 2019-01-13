package br.com.dantas.adriano.service;

import java.util.List;

import br.com.dantas.adriano.model.Funcionario;
import br.com.dantas.adriano.model.Pessoa;

public class ClasseService<T> implements InterfaceService<T> {

	public T consultar(Pessoa p, Funcionario f) {

		Pessoa pessoa;
		Funcionario func;
		T data = null;

		if (p.getNome().equals("Pedr")) {
			pessoa = new Pessoa();
			pessoa.setNome(p.getNome());
			data = (T) pessoa;
		}
		if (f.getIdFunc().equals("12")) {
			func = new Funcionario(f.getNome(), f.getIdFunc(), f.getData_Admissao());
			data = (T) func;
		}
		return data;
	}

	@Override
	public List<?> retornoConsultaGeral(Funcionario f) {
		// TODO Auto-generated method stub
		return null;
	}

}
