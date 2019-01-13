package dantas.adriano.lambda.expression.service.impl;

import java.util.ArrayList;
import java.util.List;

import dantas.adriano.lambda.expression.service.ConsultarCadastroFuncionario;
import dantas.adriano.model.Funcionario;

/**
 * Implementando interface funcional sem usar lambda expression
 * @author 660454
 *
 */
public class ConsultarCadastroFuncionarioImpl2 implements ConsultarCadastroFuncionario {
	
	static List<Funcionario> lista = new ArrayList<>();
	public static void main(String[] args) {
		
		ConsultarCadastroFuncionarioImpl2 consultar = new ConsultarCadastroFuncionarioImpl2();
		
		List<Funcionario> list = consultar.listarFuncionarios(consultarFuncionariosCadastrados());
		
		list.forEach(f -> {
			System.out.println("Tamanho da lista: " + list.size());
			System.out.println("Funcionario: " + f.getNome() + " " + "Idade: " + f.getIdade() + " " + "Cargo: " + f.getCargo());
		});
		
		System.out.println("sobescrevendo o m�doto default da interface funcional");
		System.out.println("resultado da soma: " + consultar.somar(10, 5));
	}

	
	//crio m�todo para executar a lmabda expression
	public List<Funcionario> listarFuncionarios(Funcionario func) {
		return 	consultarCadastroFuncionario(func);
	}



	@Override
	public List<Funcionario> consultarCadastroFuncionario(Funcionario func) {
		lista.add(func);
		return lista;
	}
	
	private static Funcionario consultarFuncionariosCadastrados() {
		Funcionario func = new Funcionario("Paulo", "42", "Gerente de Contas");
		return func;
	}
}
