package simple.example.method.reference.service;

import simple.example.method.reference.model.Funcionario;

@FunctionalInterface
public interface IFuncionarioCadastrado {

	public Funcionario consultarFuncionario(String nome, String idade, String cargo);
}
