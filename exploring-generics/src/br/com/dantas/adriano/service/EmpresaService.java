package br.com.dantas.adriano.service;

import java.util.ArrayList;
import java.util.List;

import br.com.dantas.adriano.model.Empresa;
import br.com.dantas.adriano.model.Funcionario;
import br.com.dantas.adriano.model.Pessoa;

public class EmpresaService<T> implements InterfaceService<T> {
	
	private Funcionario func = retornarFuncionario();
	private Empresa emp;
	List<?> generica = null;
	List<Empresa> empList = null;

	public T consultar(Pessoa p, Funcionario f) {
		
		if(func.getIdFunc().equals(f.getIdFunc())) {
		    emp = new Empresa();
		    emp.setFunc(func);
		}
		return (T) emp;
	}

	private Funcionario retornarFuncionario() {
		Funcionario f = new Funcionario();
		f.setData_Admissao("10/12/2018");
		f.setIdFunc("12");
		return f;
	}

	@Override
	public List<?> retornoConsultaGeral(Funcionario f) {
        
		generica = new ArrayList<>();
		empList = new ArrayList<>();
		if(func.getIdFunc().equals(f.getIdFunc())) {
		    emp = new Empresa();
		    emp.setFunc(func);
		    empList.add(emp);
		}
		generica = empList;
		return generica;
	}
	
	

}
