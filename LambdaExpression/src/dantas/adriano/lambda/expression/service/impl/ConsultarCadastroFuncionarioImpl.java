package dantas.adriano.lambda.expression.service.impl;

import java.util.ArrayList;
import java.util.List;

import dantas.adriano.lambda.expression.service.ConsultarCadastroFuncionario;
import dantas.adriano.model.Funcionario;

public class ConsultarCadastroFuncionarioImpl  {
	
	static List<Funcionario> lista = new ArrayList<>();
	public static void main(String[] args) {
		
		ConsultarCadastroFuncionarioImpl consultar = new ConsultarCadastroFuncionarioImpl();
		
		//crio a lambda expression para implementar o m�todo da interface funcional
		ConsultarCadastroFuncionario consultarFunc = ((funcionario) -> {
			lista.add(funcionario);
			return lista;
		});
		
		// Executo o m�todo listarFuncionarios o qual � respons�vel por executar a lambda expression 
		List<Funcionario> list = consultar.listarFuncionarios(consultarFuncionariosCadastrados(), consultarFunc);
		
		list.forEach(f -> {
			System.out.println("Tamanho da lista: " + list.size());
			System.out.println("Funcionario: " + f.getNome() + " " + "Idade: " + f.getIdade() + " " + "Cargo: " + f.getCargo());
		});
		
		
	}



	private static Funcionario consultarFuncionariosCadastrados() {
		Funcionario func = new Funcionario("Paulo", "42", "Gerente de Contas");
		return func;
	}

	
	//crio m�todo para executar a lmabda expression
	public List<Funcionario> listarFuncionarios(Funcionario func, ConsultarCadastroFuncionario operacao) {
	   
		return 	operacao.consultarCadastroFuncionario(func);
	}
}
