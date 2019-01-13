package br.com.dantas.adriano.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.dantas.adriano.model.Funcionario;
import br.com.dantas.adriano.model.Pessoa;

public class GenericDao<T> implements IDao<T> {

	static List<?> generica = new ArrayList<>();
	List<Funcionario> listFunc = listaDeFuncionarios();
	List<Pessoa> listP = listaDePessoas();

	@Override
	public List<?> criar(T entidade) {

		if (entidade instanceof Funcionario) {
			listFunc.add((Funcionario) entidade);
			generica = listFunc;
		} else {
			listP.add((Pessoa) entidade);
			generica = listP;
		}
		return generica;
	}

	@Override
	public List<?> deletar(T entidade) {
		if (entidade instanceof Funcionario) {
			for (Funcionario f : listFunc) {
				if (f.getIdFunc().equals(((Funcionario) entidade).getIdFunc())) {
					listFunc.remove(entidade);
				}

			}
			generica = listFunc;
		} else {
			for (Pessoa p : listP) {
				if (p.getCpf().equals(((Pessoa) entidade).getCpf())) {
					listP.remove(p);
				}
			}
			generica = listP;
		}
		return generica;
	}

	@Override
	public List<?> alterar(T entidade) {
		if (entidade instanceof Funcionario) {
			for (Funcionario f : listFunc) {
				if (f.getIdFunc().equals(((Funcionario) entidade).getIdFunc())) {
					f.setData_Admissao("25/12/2016");
				}

			}
			generica = listFunc;
		} else {
			for (Pessoa p : listP) {
				if (p.getCpf().equals(((Pessoa) entidade).getCpf())) {
					p.setIdade("49");
				}
			}
			generica = listP;
		}
		return generica;

	}

	@Override
	public List<?> ler(T entidade) {
		if (entidade instanceof Funcionario) {
			generica = listFunc;
		} else {
			generica = listP;
		}
		return generica;
	}

	private List<Funcionario> listaDeFuncionarios() {

		listFunc = new ArrayList<>();
		Funcionario funcionario = new Funcionario("Ricardo", "1212", "Pedro Paulo");
		Funcionario funcionario2 = new Funcionario("Carlos", "1214", "Paulo Cesar");
		listFunc.add(funcionario);
		listFunc.add(funcionario2);
		return listFunc;
	}

	private List<Pessoa> listaDePessoas() {

		listP = new ArrayList<>();
		Pessoa p1 = new Pessoa("Saulo", "Pereira", "24", "278332354", "28996612543");
		Pessoa p2 = new Pessoa("Celso", "Carceres", "45", "278332111", "28996619999");
		listP.add(p1);
		listP.add(p2);
		return listP;
	}

}
