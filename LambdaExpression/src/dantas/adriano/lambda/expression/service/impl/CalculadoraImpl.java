package dantas.adriano.lambda.expression.service.impl;

import dantas.adriano.lambda.expression.service.IMath;

public class CalculadoraImpl {
	
	public static void main(String[] args) {
		
		CalculadoraImpl calc = new CalculadoraImpl();
		//crio as express�es lambdas 
		IMath somar = (a, b) -> a + b;
		IMath subtrair = (a, b) -> a - b;
		IMath multiplicar = (a, b) -> a * b;
		IMath dividir = (a, b) -> a / b;
		
		//Executo a chamada da express�o lambda, passo os valores e a express�o lambda que quero executar
		System.out.println("soma: " + calc.operacao(10, 10, somar));
		System.out.println("divis�o: " + calc.operacao(10, 10, subtrair));
		System.out.println("multiplica��o: " + calc.operacao(10, 10, multiplicar));
		System.out.println("divis�o: " + calc.operacao(10, 10, dividir));
	}

	/**
	 * Crio um m�todo que recebe os argumentos utilizamos na express�o lambda
	 * e a propria express�o
	 * @param a
	 * @param b
	 * @param op
	 * @return
	 */
	public int operacao(int a, int b, IMath op) {
		
		return op.operacao(a, b);
	}
}
