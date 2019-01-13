package br.com.dantas.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.dantas.adriano.dao.GenericDao;
import br.com.dantas.adriano.model.Pessoa;

public class GenericoDaoPessoaTeste {
	
	static List<Pessoa> listPessoa = new ArrayList<Pessoa>();
	
	
	public static void main(String[] args) {
		
		createPessoa();
		deletePessoa();
	}
	
	

	@SuppressWarnings("unchecked")
	private static void createPessoa() {
		GenericDao<Pessoa> p = new GenericDao<>();
		Pessoa pessoa = new Pessoa("Cleyton", "Souza", "32", "27822511-4", "28996612600");
		listPessoa = (List<Pessoa>) p.criar(pessoa);
		System.out.println(listPessoa.size());
	}

	@SuppressWarnings("unchecked")
	private static void deletePessoa() {
		GenericDao<Pessoa> p = new GenericDao<>();
		Pessoa pessoa = new Pessoa("Saulo", "Pereira", "24", "278332354", "28996612543");
		listPessoa = (List<Pessoa>) p.deletar(pessoa);
		System.out.println(listPessoa.size());
	}
}
