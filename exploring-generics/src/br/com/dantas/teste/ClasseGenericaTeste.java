package br.com.dantas.teste;

import java.util.List;
import br.com.dantas.adriano.model.Empresa;
import br.com.dantas.adriano.model.Funcionario;
import br.com.dantas.adriano.model.ModelGenerico;
import br.com.dantas.adriano.model.Pessoa;
import br.com.dantas.adriano.service.ClasseService;
import br.com.dantas.adriano.service.EmpresaService;

public class ClasseGenericaTeste {
	
	static List<?> generica = null;

	public static void main(String[] args) {

		ClasseService<Pessoa> s1 = new ClasseService<>();
		ClasseService<Funcionario> s2 = new ClasseService<>();
		EmpresaService<Empresa> empresa = new  EmpresaService<>();

		Pessoa p = new Pessoa("Pedro", "Abravanel", "35", "22222222", "11111111111");
		Funcionario f = new Funcionario("Sergio", "12", "24/11/2017");

		consultarDados(s1, s2, p, f);
		
		retornoConsultaGeral(empresa, f);
		
		consultarDadosEmpresa(empresa, p, f);
	}

	private static void consultarDadosEmpresa(EmpresaService<Empresa> empresa, Pessoa p, Funcionario f) {
		Empresa emp = empresa.consultar(p, f);
		System.out.println("Dados da empresa:" + emp.getFunc().getIdFunc() + " " + emp.getFunc().getData_Admissao());
	}

	private static void consultarDados(ClasseService<Pessoa> s1, ClasseService<Funcionario> s2, Pessoa p, Funcionario f) {
		
		Pessoa pessoa;
		Funcionario func;
		ModelGenerico<Pessoa> g = new ModelGenerico<>(p);
		//ModelGenerico<Pessoa> g = new ModelGenerico<>();
		//g.setDados(p);

		// ModelGenerico<Funcionario> g2 = new ModelGenerico<>(f);
		ModelGenerico<Funcionario> g2 = new ModelGenerico<>();
		g2.setDados(f);

		if (s1.consultar(g.getDados(), g2.getDados()) instanceof Pessoa) {
			pessoa = s1.consultar(g.getDados(), g2.getDados());
			System.out.println(pessoa.getNome());
		
		} if (s2.consultar(g.getDados(), g2.getDados()) instanceof Funcionario) {
			func = s2.consultar(g.getDados(), g2.getDados());
			System.out.println(func.getIdFunc());
		}
	}
	
	private static void retornoConsultaGeral(EmpresaService<Empresa> empresa, Funcionario f) {
		generica =  empresa.retornoConsultaGeral(f);
		
		for(Object p : generica) {
			Empresa emp = (Empresa) p;
			System.out.println("Dados da Lista da empresa:" + emp.getFunc().getData_Admissao() + " " + emp.getFunc().getIdFunc());
		}
		
	}

}
