package dantas.adriano.lambda.expression.service.impl;

import dantas.adriano.lambda.expression.service.Calculadora;

public class ClasseAnonima {
	
	Calculadora calc = new Calculadora() {
		
		@Override
		public int subtrair(int a, int b) {
			return a - b;
		}
		
		@Override
		public int somar(int a, int b) {
			return a + b;
		}
		
		@Override
		public int multiplicar(int a, int b) {
			return a * b;
		}
		
		@Override
		public int dividir(int a, int b) {
			return a / b;
		}
	};
	
	public static void main(String[] args) {
		
		ClasseAnonima anonima = new ClasseAnonima();
		System.out.println(anonima.calc.somar(5, 5));
	}

}
