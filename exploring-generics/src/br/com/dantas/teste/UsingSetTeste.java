package br.com.dantas.teste;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.dantas.adriano.collections.set.UsingSet;
import br.com.dantas.adriano.model.Pessoa;
import br.com.dantas.adriano.model.PessoaTreeSet;

public class UsingSetTeste {
	
	public static void main(String[] args) {
		
		hashSetClass();
		System.out.println("----------------------------------------------------------------------");
		treeSetClass();
		linkedHashSet();
	}

	private static void linkedHashSet() {
		apenasStringLinkedHashSet();
		linkedHashSetPessoas();
	}

	private static void treeSetClass() {
		apenasStringTreeSet();
		treeSetPessoas();
	}

	private static void apenasStringTreeSet() {
		System.out.println("TreeSet de String -> não add valores repetidos e ordena os valores");
		TreeSet<String> s = new TreeSet<String>();
		s.add("Ateste");
		s.add("Dteste");
		s.add("Ateste");
		s.add("Atestes");
		s.forEach( s1 -> {
			System.out.println(s1);
		});
	}
	
	private static void treeSetPessoas() {
		System.out.println("Imprime TreeSet de Pessoa -> classe Pessoa deve implementar Comparable para imprimir ordenado e tirar os repetidos");
		List<PessoaTreeSet> list = Arrays.asList(new PessoaTreeSet("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				new PessoaTreeSet("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				new PessoaTreeSet("Sergio", "Filho", "33", "2783465394", "28996612358"),
				new PessoaTreeSet("Dede", "Antunes", "32", "2783465391", "28996612355"));
		
		
		TreeSet<PessoaTreeSet> treeSet = null;
		treeSet = UsingSet.consultarPessoasCadastradasTreeSet(list);
		System.out.println("---------------------------------------------------------------------------");
		treeSet.forEach((PessoaTreeSet p) -> {
			PessoaTreeSet pessoa = new PessoaTreeSet();
			pessoa.setNome(p.getNome());
			System.out.println(pessoa.getNome());
		});
	}

	private static void hashSetClass() {
		apenasString();
		System.out.println("---------------------------------------------------------------------------");
		setPessoas();
	}

	private static void setPessoas() {
		System.out.println("Imprime HashSet de Pessoa -> classe Pessoa deve implementar equals e hashCode methods para não haver objeto repetido");

		List<Pessoa> list = Arrays.asList(new Pessoa("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				                          new Pessoa("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				                          new Pessoa("Sergio", "Filho", "33", "2783465394", "28996612358"),
				                          new Pessoa("Dede", "Antunes", "32", "2783465391", "28996612355"));
		
		HashSet<Pessoa> p = UsingSet.consultarPessoasCadastradasHashSet(list);
		System.out.println("---------------------------------------------------------------------------");
		p.forEach(p1 -> {
			System.out.println(p1);
		});
	}

	private static void apenasString() {
		System.out.println("A interface Set em qualquer de suas 3 classes (HashSet, LinkedHashSet ou TreeSet) usando String -> não add valores repetidos");		
		HashSet<String> s = new HashSet<String>();
		s.add("teste");
		s.add("teste");
		s.add("todo");
		s.add("tudo");
		s.forEach( s1 -> {
			System.out.println(s1);
		});
	}
	
	private static void linkedHashSetPessoas() {
		System.out.println("Imprime linkedHashSet de Pessoa -> classe Pessoa deve implementar equals e hashCode methods para não haver objeto repetido");

		List<Pessoa> list = Arrays.asList(new Pessoa("Dede", "Antunes", "32", "2783465391", "28996612355"),
				                          new Pessoa("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				                          new Pessoa("Paulo", "Junqueira", "34", "2783465398", "28996612356"),
				                          new Pessoa("Sergio", "Filho", "33", "2783465394", "28996612358"),
				                          new Pessoa("Dede", "Antunes", "32", "2783465391", "28996612355"),
				                          new Pessoa("Dede", "Antunes", "32", "2783465391", "28996612355"));
		
		Set<Pessoa> p = null;
		p = UsingSet.consultarPessoasCadastradas(list);
		System.out.println("---------------------------------------------------------------------------");
		
		Iterator<Pessoa> it = p.iterator();
		while(it.hasNext()) {
		   System.out.println(it.next());
		}
		/*p.forEach(p1 -> {
			System.out.println(p1);
		});*/
	}
	
	private static void apenasStringLinkedHashSet() {
		System.out.println("A interface Set em qualquer de suas 3 classes (HashSet, LinkedHashSet ou TreeSet) usando String -> não add valores repetidos");		
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("Z");
		s.add("W");
		s.add("W");
		s.add("B");
		s.forEach( s1 -> {
			System.out.println(s1);
		});
		
	}

}
