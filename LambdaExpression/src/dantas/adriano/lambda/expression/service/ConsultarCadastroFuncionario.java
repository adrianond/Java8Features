package dantas.adriano.lambda.expression.service;

import java.util.List;
import dantas.adriano.model.Funcionario;

@FunctionalInterface
public interface ConsultarCadastroFuncionario {

	List<Funcionario> consultarCadastroFuncionario(Funcionario func);

	default int somar(int a, int b) {
		return a + b;
	}
	
	default int somar(int a) {
		return a + 2;
	}

}
