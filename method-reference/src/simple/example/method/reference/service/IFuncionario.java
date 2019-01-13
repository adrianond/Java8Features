package simple.example.method.reference.service;

import java.util.List;

import simple.example.method.reference.model.Funcionario;

@FunctionalInterface
public interface IFuncionario {

	public List<Funcionario> consultarFuncionarios();
}
