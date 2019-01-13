package br.com.dantas.adriano.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import br.com.dantas.adriano.model.Pessoa;
import br.com.dantas.adriano.model.PessoaTreeSet;

public class UsingSet {
	
	public static Set<Pessoa> consultarPessoasCadastradas(List<Pessoa> listPessoas){
		System.out.println("Imprime lista de Pessoa com dados repetidos");
		System.out.println(listPessoas);
		return listPessoas.stream().collect(Collectors.toCollection(LinkedHashSet::new));
	}
	
	public static HashSet<Pessoa> consultarPessoasCadastradasHashSet(List<Pessoa> listPessoas){
		System.out.println("Imprime lista de Pessoa com dados repetidos");
		System.out.println(listPessoas);
		return  (HashSet<Pessoa>) listPessoas.stream().collect(Collectors.toSet());
	}
	
	
	
	public static TreeSet<PessoaTreeSet> consultarPessoasCadastradasTreeSet(List<PessoaTreeSet> listPessoas){
		System.out.println("Imprime lista de Pessoa com dados repetidos");
		System.out.println(listPessoas);
		return listPessoas.stream().collect(Collectors.toCollection(TreeSet::new));
	}

}
