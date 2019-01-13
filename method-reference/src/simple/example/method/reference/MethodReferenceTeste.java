package simple.example.method.reference;

import simple.example.method.reference.model.Funcionario;
import simple.example.method.reference.service.IFuncionario;
import simple.example.method.reference.service.IFuncionarioCadastrado;
import simple.example.method.reference.service.FuncionarioService;

public class MethodReferenceTeste {

	public static void main(String[] args) {
		
		System.out.println("methodReferenceEstatico();");
		methodReferenceEstatico();
		System.out.println("----------------------------------------------------");
		
		System.out.println("methodReferenceInstanciaObjetoParticular();");
		methodReferenceInstanciaObjetoParticular();
		System.out.println("----------------------------------------------------");
		
		System.out.println("methodReferenceToConstructor();");
		methodReferenceToConstructor();
	}

	private static void methodReferenceToConstructor() {
		 new MethodReferenceTeste().listarFuncionarioCadastrado();		
	}

	private static void listarFuncionarioCadastrado() {
		//implementa o método da interface funcional com Lambda
		IFuncionarioCadastrado funcionario = (nome, idade, cargo) -> new Funcionario(nome, idade, cargo);
		Funcionario f = funcionario.consultarFuncionario("Paulo", "42", "Gerente de Contas");
		System.out.println("Funcionario: " + f.getNome());
		
		System.out.println("----------------------------------------------------");
		
		//implementa o método da interface com method reference -> menos verboso
		IFuncionarioCadastrado func = Funcionario::new;
		Funcionario f2 = func.consultarFuncionario("Gustavo", "42", "Gerente de Contas");
		System.out.println("Funcionario: " + f2.getNome());
	}

	private static void methodReferenceInstanciaObjetoParticular() {
		methodReferenceInstanciaObjetoParticular1();
	}

	private static void methodReferenceInstanciaObjetoParticular1() {
		FuncionarioService funcionarioService = new FuncionarioService();
		// implementa o método da interface funcional
		IFuncionario op = (IFuncionario) funcionarioService::consultar;
		op.consultarFuncionarios().forEach(f -> {
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(f.getNome());
			System.out.println("Nome: " + funcionario.getNome());
		});
	}

	private static void methodReferenceEstatico() {
		methodReferenceEstaticoExample1();
	}

	private static void methodReferenceEstaticoExample1() {

		// implementa o método da interface funcional
		IFuncionario staticRef = FuncionarioService::retornarFuncionariosCadastrados;
		staticRef.consultarFuncionarios().forEach(f -> {
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(f.getNome());
			System.out.println("Nome: " + funcionario.getNome());
		});
	}

	
}
