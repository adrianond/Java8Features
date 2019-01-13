package dantas.adriano.lambda.expression.service.impl;

import dantas.adriano.lambda.expression.service.IMath;

public class CalculadoraImpl {
	
	public static void main(String[] args) {
		
		CalculadoraImpl calc = new CalculadoraImpl();
		//crio as expressões lambdas 
		IMath somar = (a, b) -> a + b;
		IMath subtrair = (a, b) -> a - b;
		IMath multiplicar = (a, b) -> a * b;
		IMath dividir = (a, b) -> a / b;
		
		//Executo a chamada da expressão lambda, passo os valores e a expressão lambda que quero executar
		System.out.println("soma: " + calc.operacao(10, 10, somar));
		System.out.println("divisão: " + calc.operacao(10, 10, subtrair));
		System.out.println("multiplicação: " + calc.operacao(10, 10, multiplicar));
		System.out.println("divisão: " + calc.operacao(10, 10, dividir));
	}

	/**
	 * Crio um método que recebe os argumentos utilizamos na expressão lambda
	 * e a propria expressão
	 * @param a
	 * @param b
	 * @param op
	 * @return
	 */
	public int operacao(int a, int b, IMath op) {
		
		return op.operacao(a, b);
	}
}
