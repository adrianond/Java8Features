package dantas.adriano.lambda.expression.service;

/**
 * Interface funcional que será usada pela expressão lambda - coloco a anotação @FunctionalInterface para ficar explicito que trara - se
 * de uma iterface funcional para que outro progrador não crie outro método nessa interface, pois  em interface funcional só pode haver um método abstrato
 * senão na classe que estamos utilizando irá dar erro de compilação!
 * @author 660454
 *
 */
@FunctionalInterface
public interface IMath {
	
	int operacao(int a , int b);
}
