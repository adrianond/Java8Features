package dantas.adriano.lambda.expression.service;

/**
 * Interface funcional que ser� usada pela express�o lambda - coloco a anota��o @FunctionalInterface para ficar explicito que trara - se
 * de uma iterface funcional para que outro progrador n�o crie outro m�todo nessa interface, pois  em interface funcional s� pode haver um m�todo abstrato
 * sen�o na classe que estamos utilizando ir� dar erro de compila��o!
 * @author 660454
 *
 */
@FunctionalInterface
public interface IMath {
	
	int operacao(int a , int b);
}
