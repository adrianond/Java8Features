package br.com.dantas.adriano.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.dantas.adriano.model.Pessoa;

public class MapMethods {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------ComputeIfPresentMethod()-----------------------------------------");
		ComputeIfPresentMethod();
		System.out.println("----------------------ComputeIfAbsentMethod()----------------------------------------");
		ComputeIfAbsentMethod();
		System.out.println("----------------------MergeMethod()----------------------------------------");
		MergeMethod();
		System.out.println("----------------------removeMethod()----------------------------------------");
		remove();
	}

	private static void remove() {
		//MetodoRemoveObjetoMapa();
		MetodoRemoverMapa();
	}

	private static void MetodoRemoveObjetoMapa() {
		Map<String, Pessoa> mapa = new HashMap<>();
		mapa.put("Pessoa", new Pessoa("Cris", "Toledo", "35", "3333333333", "44444444"));
		mapa.put("Pessoa2", new Pessoa("Cristiano", "Toledo", "35", "3333333333", "44444444"));
		
		System.out.println("mapa antes de remover chave e seu valor");
		mapa.forEach((chave, valor) -> {
			System.out.println(" Nomes: "+ valor.getNome());
		});
		
		//remove um objeto do mapa pela sua chave
		mapa.remove("Pessoa");
		System.out.println("mapa ap�s de remover chave e seu valor");
		mapa.forEach((chave, valor) -> {
			System.out.println(" Nomes: "+ valor.getNome());
		});
	}
	
	private static void MetodoRemoverMapa() {
		Map<String, Pessoa> mapa = new HashMap<>();
		mapa.put("Pessoa", new Pessoa("Cris", "Toledo", "35", "3333333333", "44444444"));
	
		Map<String, Pessoa> mapa2 = new HashMap<>();
		mapa2.put("Pessoa2", new Pessoa("Cristiano", "Toledo", "35", "3333333333", "44444444"));
		mapa2.putAll(mapa);
		
		System.out.println("mapa antes de remover");
		mapa2.forEach((chave, valor) -> {
			System.out.println(" Nomes: "+ valor.getNome());
		});
		
		//remove um mapa de outro mapa 
		mapa2.remove("Pessoa");
		System.out.println("mapa ap�s de remover");
		mapa2.forEach((chave, valor) -> {
			System.out.println(" Nomes: "+ valor.getNome());
		});
	}

	private static void MergeMethod() {
      UsoMetodoMerge();	
      UsoMetodoMerge2();
	}

	private static void UsoMetodoMerge() {
		
		System.out.println("Com m�todo putAll n�o insere o mapa se ja houver mapa com a mesma chave, ele substitui os valores para essa chave retida,"
				+ "este m�todo n�o faz o merge de mapas e sim copia um mapa para outro");
		Map<String, Pessoa> mapa = new HashMap<>();
		mapa.put("Pessoa", new Pessoa("Cris", "Toledo", "35", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa2 = new HashMap<>();
		mapa2.put("Pessoa2", new Pessoa("Paulo", "Cruz", "35", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa3 = new HashMap<>();
		mapa3.put("Pessoa", new Pessoa("Adriano", "Dantas", "35", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa4 = new HashMap<>();
		mapa4.putAll(mapa);
		mapa4.putAll(mapa2);
		mapa4.putAll(mapa3);
		
		System.out.println("tamanho do mapa: " + mapa4.size());
		mapa4.forEach((chave, valor) -> {
			System.out.println("chave: " + chave + " " + "valor: " + valor);
		});
	}
	
    private static void UsoMetodoMerge2() {
		
		System.out.println("Com m�todo merge � poss�vel juntar/mergear valores de diferentes mapas em um mapa de acordo com a regras definidas na nossa"
				+ "merge function! ");
		Map<String, Pessoa> mapa = new HashMap<>();
		mapa.put("Pessoa", new Pessoa("Cris", "Toledo", "35", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa2 = new HashMap<>();
		mapa2.put("Pessoa", new Pessoa("Paulo", "Cruz", "35", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa3 = new HashMap<>();
		mapa3.put("Pessoa", new Pessoa("Adriano", "Dantas", "39", "3333333333", "44444444"));
		
		Map<String, Pessoa> mapa4 = new HashMap<>(mapa);
		
		
		mapa2.forEach((chave, valor) -> {
			mapa4.merge(chave, valor, (v1, v2) -> new Pessoa(v1.getNome(), v2.getSobreNome(), v2.getIdade(), v2.getRg(), v2.getCpf()));
		});
		
		System.out.println("tamanho do mapa: " + mapa4.size());
		System.out.println("Imprime o sobreNome do objeto Pessoa contido no mapa2 e os demais atributos do objeto Pessoa contido no mapa1");
		mapa4.forEach((chave, valor) -> {
			System.out.println("chave: " + chave + " " + "valor: " + valor);
		});

		mapa3.forEach((chave, value) -> {
			mapa4.merge(chave, value, (v1, v2) -> new Pessoa(v1.getNome(), v2.getSobreNome(), v2.getIdade(), v2.getRg(), v2.getCpf()));
		});
		
		
		System.out.println("tamanho do mapa: " + mapa4.size());
		System.out.println("Imprime o nome do objeto Pessoa contido no mapa4 ap�s merge com mapa2 e os demais atributos do objeto Pessoa contido no mapa3");
		mapa4.forEach((chave, valor) -> {
		System.out.println("chave: " + chave + " " + "valor: " + valor);
		});
	}

	private static void ComputeIfAbsentMethod() {
		UsoDoMetodoComputeIfAbsent();
		System.out.println("--------------------------------------------------------------");
		UsoDoMetodoComputeIfAbsent2();
		System.out.println("--------------------------------------------------------------");
		UsoDoMetodoComputeIfAbsent3();
	}

	private static void ComputeIfPresentMethod() {
		UsoDoMetodoComputeIfPresent();
		UsoDoMetodoComputeIfPresent2();
		
	}

	private static void UsoDoMetodoComputeIfPresent() {
		Map<Integer, List<Pessoa>> mapa = new HashMap<>();
		mapa.put(1, listPessoa());
		
	    System.out.println("Imprime o mapa com uma lista");
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
		System.out.println("------------------------------------------");
		System.out.println("Imprime o mapa substituindo a lista de objeto Pessoa");
		mapa.computeIfPresent(1, (chave, value) -> new ArrayList<Pessoa>())
			.add(new Pessoa("Paulo", "Ferraz", "29", "222222222", "333333333"));
		    
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
	}
	
	private static void UsoDoMetodoComputeIfPresent2() {
		Map<Integer, List<Pessoa>> mapa = new HashMap<>();
		mapa.put(1, listPessoa());
		
	    System.out.println("Imprime o mapa com uma lista");
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
		System.out.println("------------------------------------------");
		System.out.println("Imprime o mapa adicionando outro objeto Pessoa na lista");
		mapa.computeIfPresent(1, (chave, value) -> adicionaObjeto(value));
		
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
		System.out.println("------------------------------------------");
		System.out.println("Imprime ap�s remover uma chave");
		mapa.computeIfPresent(1, (chave, value) -> value.
			removeIf(p -> p.getNome().equals("Luis")) && value.size() == 0 ? null : value);
		
		
		    
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
	}

	private static List<Pessoa> adicionaObjeto(List<Pessoa> value) {
		value.add(new Pessoa("Luis", "Carlos", "14", "225345139", "11111111111"));
		return value;
	}

	private static void UsoDoMetodoComputeIfAbsent() {
		Map<Integer, List<Pessoa>> mapa = new HashMap<>();
		mapa.put(1, listPessoa());
		
		System.out.println("tamanho do mapa: " + mapa.size());
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
		
		System.out.println("------------------------------------------");
		System.out.println("Adiciona listas para chaves que n�o existiam e tamb�m foram criadas");		
		mapa.computeIfAbsent(2, list -> new ArrayList<>())
		    .add(new Pessoa("Ricardo", "Santos", "18", "225345135", "11111111122"));
		
		mapa.computeIfAbsent(3, chave -> adicionaListaToMap(chave));
			
		System.out.println("tamanho do mapa: " + mapa.size());
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
			v.forEach(value -> {
				System.out.println("nome: " + value.getNome());
			});
		});
	}
	
	private static List<Pessoa> adicionaListaToMap(Integer chave) {

		List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Severino", "Santos", "18", "225345135", "11111111122"));
		return lista;
	}

	private static void UsoDoMetodoComputeIfAbsent2() {
		
		System.out.println("Cria dois objetos pessoa para chaves que n�o existiam e tamb�m foram criadas");
		Map<String, Pessoa> mapa = new HashMap<>();
		mapa.put("Carlos", new Pessoa("Carlos", "Soares", "19", "225345139", "11111111111"));
		
		mapa.computeIfAbsent("Antonio", chave -> verificarChaveNoMapa(chave));
		mapa.computeIfAbsent("Henrique", objetoPessoa -> new Pessoa("Henrique", "Cunha", "19", "225345139", "11111111111"));
			
		mapa.forEach((k, v) -> {
			System.out.println("chave: " + k);
				System.out.println("nome: " + v.getNome());
		});
		
	}
	
    private static void UsoDoMetodoComputeIfAbsent3() {
		
    	System.out.println("verifica as chaves que n�o existiam e as criam e verifica seus tamanhos");
    	Map<String, Integer> nameMap = new HashMap<>();
    	Integer value = nameMap.computeIfAbsent("John", s -> s.length());
	    System.out.println("Value: " + value);	
	    
	    Integer v = nameMap.computeIfAbsent("Antonio", chave -> verificarTamanhoChaveMapa(chave));
	    System.out.println("V: " + v);
	    nameMap.forEach((chave, valor) -> {
	    	System.out.println("Chave: " + chave + " " + "Valor: " + valor);
	    });
	}
    
	private static Integer verificarTamanhoChaveMapa(String chave) {

		return chave.length();
	}

	private static Pessoa verificarChaveNoMapa(String s) {

		return new Pessoa("Antonio", "Cunha", "19", "225345139", "11111111111");
	}

	private static List<Pessoa> listPessoa() {
		
		List<Pessoa> list = new ArrayList<>();
		list.add(new Pessoa("Pedro", "Soares", "14", "225345139", "11111111111"));
		return list;
	}
	

}
