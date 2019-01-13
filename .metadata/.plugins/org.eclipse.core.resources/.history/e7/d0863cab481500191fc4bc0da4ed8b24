package dantas.adriano.lambda.expression.service.impl;

import dantas.adriano.lambda.expression.service.ValidadorCpf;

public class ValidadorCPFImpl {
	
	public static void main(String[] args) {
		
		ValidadorCPFImpl validadorImpl = new ValidadorCPFImpl();
		ValidadorCpf validador = (v) -> v.matches("(?!(\\d)\\1{10})\\d{11}");
		
		if (validadorImpl.validarDoc("28996612804", validador)) {
			System.out.println("CPF Correto");
		} else {
			System.out.println("CPF Incorreto");
		}
	}
	
	public boolean validarDoc(String v, ValidadorCpf operacao){
		
		return operacao.validarCPF(v);
	}

}
