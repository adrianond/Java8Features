package br.com.dantas.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.dantas.adriano.dao.GenericDao;
import br.com.dantas.adriano.model.Funcionario;

public class GenericoDaoFuncionarioTeste {
	
	static List<Funcionario> listFunc = new ArrayList<Funcionario>();
	
	public static void main(String[] args) {
		
		createFuncionario();
		alterarFuncionario();
		lerFuncionario();
		
	}
	
	@SuppressWarnings({ "unchecked" })
	private static void createFuncionario() {
		GenericDao<Funcionario> func = new GenericDao<>();
		Funcionario f = new Funcionario("Carlos", "1012", "10/12/2017");
		listFunc = (List<Funcionario>) func.criar(f);
		System.out.println(listFunc.size());
	}

	
	@SuppressWarnings({ "unchecked" })
	private static void alterarFuncionario() {
		GenericDao<Funcionario> func = new GenericDao<>();
		Funcionario f = new Funcionario("Pedro", "1012", "10/12/2017");
		listFunc = (List<Funcionario>) func.alterar(f);
		System.out.println(listFunc.size());
	}
	
	@SuppressWarnings({ "unchecked" })
	private static void lerFuncionario() {
		GenericDao<Funcionario> func = new GenericDao<>();
		Funcionario f = new Funcionario("Antonio", "1012", "10/12/2017");
		listFunc = (List<Funcionario>) func.ler(f);
		System.out.println(listFunc.size());
	}
}
