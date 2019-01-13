package br.com.dantas.adriano.collections.map;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import br.com.dantas.adriano.model.Boleto;
import br.com.dantas.adriano.model.BoletoComp;
import br.com.dantas.adriano.model.BoletoComparable;
import br.com.dantas.adriano.model.Funcionario;

/**
 * 
 * @author nss_admin
 *
 */
public class UsingMap {

	public static void main(String[] args) {
		hashMap();
        treeMap();
	}

	private static void treeMap() {
		apenasStringTreeMap();
		objetoFuncionarioTreeMap();
		objetoBoleto();
		objetoBoleto2();
	}

	private static void objetoBoleto2() {
		Map<BoletoComparable,String> treeMap = new TreeMap<>();
		
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(10), "Bradesco.SA"), "");
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(5), "BBCD.SA"), "");
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(4), "BB.SA"), "");
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(2),  "Itau.SA"), "");
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(11), "Bradesco.SA"), "");
		treeMap.put(new BoletoComparable("1000,00", dataPagamentoBoleto(8), "Decide.SA"), "");
		
		treeMap.forEach((boleto, chave) ->{
			System.out.println("valor: " + boleto.getValor() + " " + "data de pagamento: " +
		    " " + boleto.getData_pagamento() + "credor: " + boleto.getCredor());
		});
		
	}

	private static void objetoBoleto() {
		
		Map<Boleto,String> treeMap = new TreeMap<Boleto, String>(new BoletoComp());
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(10), "Bradesco.SA"), "");
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(5), "BBCD.SA"), "");
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(4), "BB.SA"), "");
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(2),  "Itau.SA"), "");
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(11), "Bradesco.SA"), "");
		treeMap.put(new Boleto("1000,00", dataPagamentoBoleto(8), "Decide.SA"), "");
		
		treeMap.forEach((boleto, chave) ->{
			System.out.println("valor: " + boleto.getValor() + " " + "data de pagamento: " +
		    " " + boleto.getData_pagamento() + "credor: " + boleto.getCredor());
		});
	}

	private static Date dataPagamentoBoleto(int dia) {
        
		GregorianCalendar c =  new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, +dia);
		Date data_pagamento = c.getTime();
		return data_pagamento;
	}

	private static void apenasStringTreeMap() {
		//ordena os valores pela chave, neste caso como a chave é uma String ordena pela ordem alfabética, também não há chaves repetidas
		Map<String, String> mapa = new TreeMap<>();
		mapa.put("nome", "adriano");
		mapa.put("sobreNome", "dantas");
		mapa.put("endreco", "Palmeiras 59");
		mapa.put("bairro", "Jaguare");
		mapa.put("bairro", "Jaguare");
		mapa.put("bair", "Jaguare");
		
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k + "-> valor: " + v);
		});
		
	}

	private static void hashMap() {
		apenasString();
		objetoFuncionario();
	}

	private static void objetoFuncionario() {
		//Chaves repetidas não são inseridas no mapa
		Map<String, Funcionario> mapa = new HashMap<>();
		mapa.put("Roberto", new Funcionario("Roberto", "10", "23/04/2017"));
		mapa.put("Pedro", new Funcionario("Pedro", "10", "23/04/2017"));
		mapa.put("Felipe", new Funcionario("Felipe", "10", "23/04/2017"));
		mapa.put("Antonio", new Funcionario("Antonio", "12", "22/05/2018"));
		mapa.put("Cesar", new Funcionario("Cesar", "99", "01/02/2010"));
		mapa.put("Sandro", new Funcionario("Sandro", "12", "22/05/2018"));
		mapa.put("Vinicius", new Funcionario("Vinicius", "12", "22/05/2018"));
		
		mapa.forEach((k, v) -> {
			System.out.println("Mapa de funciários:" + "chave:" + k + " " + "Nome: " + v.getNome() + " " + "ID: " + v.getIdFunc() + " " + "DT_Admissão: " + v.getData_Admissao());
		});
	}
	
	private static void objetoFuncionarioTreeMap() {
		//1. Chaves repetidas não são inseridas no mapa e o treeMap ordena pela ordem alfabética, pois a chave é uma String 
		//2. Não precisa implementar comparable, há não ser que deseje criar sua pórpia ordenação
		Map<String, Funcionario> mapa = new TreeMap<>();
		mapa.put("roberto", new Funcionario("Roberto", "10", "23/04/2017"));
		mapa.put("pedro", new Funcionario("Pedro", "10", "23/04/2017"));
		mapa.put("felipe", new Funcionario("Felipe", "10", "23/04/2017"));
		mapa.put("antonio", new Funcionario("Antonio", "12", "22/05/2018"));
		mapa.put("antonio", new Funcionario("Antonio", "12", "22/05/2018"));
		mapa.put("cesar", new Funcionario("Cesar", "99", "01/02/2010"));
		mapa.put("sandro", new Funcionario("Sandro", "12", "22/05/2018"));
		mapa.put("vinicius", new Funcionario("Vinicius", "12", "22/05/2018"));
		
		mapa.forEach((k, v) -> {
			System.out.println("Mapa de funciários:" + "chave:" + k + " " + "Nome: " + v.getNome() + " " + "ID: " + v.getIdFunc() + " " + "DT_Admissão: " + v.getData_Admissao());
		});
	}

	private static void apenasString() {
		
		System.out.println("HashMap não há ordeção");
		System.out.println("Percorre o HashMap de String");
		Map<String, String> mapa = new HashMap<>();
		mapa.put("nome", "adriano");
		mapa.put("sobreNome", "dantas");
		mapa.put("endreco", "Palmeiras 59");
		mapa.put("bairro", "Jaguare");
		mapa.put("bairro", "Jaguare");

		for (Map.Entry<String, String> teste : mapa.entrySet()) {
			System.out.println("chave : " + teste.getKey() + " " + "valor :" + teste.getValue());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Percorre o HashMap de String com forEach");
		mapa.forEach((k, v) -> {
			System.out.println(k + " " +  v);
		});
		
		System.out.println("--------------------------------------------------------------------------------");
		//Chaves repetidas não são inseridas no mapa  -> Com iterator posso retirar todos os repetidos do mapa, mas será exluidos todos esses elementos repetidos 
		Map<String, String> map = new HashMap<>();
		map.put("nome", "adriano");
		map.put("sobreNome", "dantas");
		map.put("endreco", "Palmeiras 59");
		map.put("bairro", "Jaguare");
		map.put("bairro", "Jaguare");
		map.put("sobreNomeAtual", "dantas");
		map.put("sobreNomeAtual2", "dantas");

		Iterator<String> it = map.keySet().iterator();
		System.out.println("Mapa não insere chaves iguais: " + map);
		System.out.println("--------------------------------------------------------------------------------");
		while (it.hasNext()) {
			String key = it.next();
			if ("dantas".equals(map.get(key))) {
				it.remove();
			}
		}
		System.out.println("Imprime o mapa após retirados os valores reptidos com chaves diferentes");
		System.out.println(map);
		System.out.println("--------------------------------------------------------------------------------");
	}

}
