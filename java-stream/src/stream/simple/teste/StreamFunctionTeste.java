package stream.simple.teste;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import stream.simple.StreamFunctions;
import stream.simple.model.Funcionario;

public class StreamFunctionTeste {
	
	public static void main(String[] args) throws Exception {
		
		StreamFunctions stream = new StreamFunctions();
		
		//filtarFuncPelaInicialNome(stream);
		//somarIdadeFuncionarios(stream);
		//somarIdadeFuncionariosEmProcessoParalalo(stream);
		//verificarMaiorMenorIdadeListaFuncionarios(stream);
		//retonarMediaIdadeFuncionarios(stream);
       // retornaMapaComListaFuncionariosComMesmaIdade(stream);
        //retornaOptional(stream);
        streamComparator(stream);
		
	}

	private static void streamComparator(StreamFunctions stream) {
		List<Funcionario> lista = stream.comparator(consultarFuncionariosCadastrados());
		lista.forEach(func -> {
			System.out.println("Nomes ordenados por ordem alfab�tica: " + func.getNome());
		});
	}

	private static void retornaOptional(StreamFunctions stream) throws Exception {
		 Optional<Funcionario> funcionario = stream.retornaOptional(consultarFuncionariosCadastrados3());
		 funcionario.ifPresent(f -> System.out.println("Funcion�rio: " + f.getNome() + " " + "idade: " +f.getIdade()));
			
		 funcionario.orElseThrow(() -> new Exception("N�o foi encontrado o objeto Funcionario"));
		 //funcionario.orElse(new Funcionario("Paulo", "42", "Gerente de Contas"));
		
	}

	private static void retornaMapaComListaFuncionariosComMesmaIdade(StreamFunctions stream) {
		Map<String, List<Funcionario>> mapa = stream.retornaMapaFuncionarios(consultarFuncionariosCadastrados3());
		
		List<Funcionario> lista  = mapa.get("24");
		lista.forEach(funcionario -> {
			 System.out.println("Idade do funcion�rio : " + funcionario.getNome() + " " + "� : " + funcionario.getIdade());
		});
		System.out.println("-----------------------------------------------------------------------------------------");
		
		mapa.forEach((k, v) -> {
			 System.out.println("A chave : " + k + " " + "cont�m uma lista de funcion�rios com a mesma idade");
			 //listas de funcion�rios com a mesma idade
			 v.forEach(f -> {
				 System.out.println("Idade do funcion�rio : " + f.getNome() + " " + "� : " + f.getIdade());
			 });
		});
		      
	}

	private static void retonarMediaIdadeFuncionarios(StreamFunctions stream) {
		double mediaIdade = stream.verificarMediaIdadeFunc(consultarFuncionariosCadastrados());
		System.out.println("M�dia de idade dos funcion�rios �: " + mediaIdade);
		
	}

	private static void verificarMaiorMenorIdadeListaFuncionarios(StreamFunctions stream) {
		
		int maiorIdade = stream.verificarMaiorIdadeListaFuncionarios(consultarFuncionariosCadastrados());
		int menorIdade = stream.verificarMenorIdadeListaFuncionarios(consultarFuncionariosCadastrados());
		
		stream.verificarMaiorMenorIdadeListaFuncionarios(consultarFuncionariosCadastrados(), maiorIdade, menorIdade);
		
	}

	private static void somarIdadeFuncionariosEmProcessoParalalo(StreamFunctions stream) {
		 stream.filtarFuncByNameSomarIdadeProcessoParalelo(consultarFuncionariosCadastrados2());
	}

	private static void somarIdadeFuncionarios(StreamFunctions stream) {
        int resultado = stream.filtarFuncByNameSomarIdade(consultarFuncionariosCadastrados());
        System.out.println("Soma das idades dos funcion�rios com nome iniciados pela letra A �: " + resultado);
	}

	private static void filtarFuncPelaInicialNome(StreamFunctions stream) {
		List<Funcionario> listaRetorno = stream.filtarFuncByName(consultarFuncionariosCadastrados());
		
		listaRetorno.forEach(f -> {
			System.out.println("Nome: " + f.getNome());
		});
	}
	
	private static List<Funcionario> consultarFuncionariosCadastrados() {
		Funcionario paulo = new Funcionario("Paulo", "42", "Gerente de Contas");
		Funcionario ricardo = new Funcionario("Ricardo", "62", "Gerente de Planejamento");
		Funcionario lenadro = new Funcionario("Leandro", "32", "Gerente Executivo");
		Funcionario adriano = new Funcionario("Adriano", "30", "Gerente Executivo");
		Funcionario adalto = new Funcionario("Adalto", "24", "Gerente de pessoas");
		
		List<Funcionario> lista = Arrays.asList(paulo, ricardo, lenadro, adriano, adalto);
		return lista;
	}
	
	private static List<Funcionario> consultarFuncionariosCadastrados2() {
		
		List<Funcionario> lista = null; 
		
		for(int i =0; i < 300; i++) {
			Funcionario paulo = new Funcionario("Paulo", "42", "Gerente de Contas");
			Funcionario ricardo = new Funcionario("Ricardo", "62", "Gerente de Planejamento");
			Funcionario lenadro = new Funcionario("Leandro", "32", "Gerente Executivo");
			Funcionario adriano = new Funcionario("Adriano", "30", "Gerente Executivo");
			Funcionario adalto = new Funcionario("Adalto", "24", "Gerente de pessoas");
			lista = Arrays.asList(paulo, ricardo, lenadro, adriano, adalto);
		}
		return lista;
	}
	
	private static List<Funcionario> consultarFuncionariosCadastrados3() {
		Funcionario paulo = new Funcionario("Paulo", "42", "Gerente de Contas");
		Funcionario ricardo = new Funcionario("Ricardo", "62", "Gerente de Planejamento");
		Funcionario lenadro = new Funcionario("Leandro", "32", "Gerente Executivo");
		Funcionario adriano = new Funcionario("Adriano", "30", "Gerente Executivo");
		Funcionario adalto = new Funcionario("Adalto", "24", "Gerente de pessoas");
		Funcionario guilherme = new Funcionario("Guilherme", "24", "Gerente de pessoas");
		Funcionario joao = new Funcionario("Joao", "24", "Gerente de pessoas");
		Funcionario pedro = new Funcionario("Pedro", "24", "Gerente de pessoas");
		
		List<Funcionario> lista = Arrays.asList(paulo, ricardo, lenadro, adriano, adalto, guilherme, joao, pedro);
		return lista;
	}

}
