package simple.example.method.reference.service;

import java.util.Arrays;
import java.util.List;

import simple.example.method.reference.model.Funcionario;

public class FuncionarioService {

	public static List<Funcionario> retornarFuncionariosCadastrados() {

		return consultarFuncionariosCadastrados();
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

	public List<Funcionario> consultar() {
		Funcionario paulo = new Funcionario("Paulo", "42", "Gerente de Contas");
		Funcionario ricardo = new Funcionario("Ricardo", "62", "Gerente de Planejamento");
		Funcionario lenadro = new Funcionario("Leandro", "32", "Gerente Executivo");
		Funcionario adriano = new Funcionario("Adriano", "30", "Gerente Executivo");
		Funcionario adalto = new Funcionario("Adalto", "24", "Gerente de pessoas");

		List<Funcionario> lista = Arrays.asList(paulo, ricardo, lenadro, adriano, adalto);
		return lista;
	}

}
