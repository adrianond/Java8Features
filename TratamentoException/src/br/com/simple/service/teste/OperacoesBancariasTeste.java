package br.com.simple.service.teste;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Agencia;
import br.com.simple.model.Banco;
import br.com.simple.model.Conta;
import br.com.simple.service.OperacoesBancariasImpl;

public class OperacoesBancariasTeste {
	
	public static void main(String[] args) {
		
		Banco banco = saldoContaCorrente();
		int qtdClientes = 2;
		//forço exceção de divisão por zero
		int qtdClientesException = 0;
		int resultado = 0;
		//forço nullPointerException
		Conta conta2 = null;
		
		OperacoesBancariasImpl operacoesBancarias = new OperacoesBancariasImpl();
		try {
			resultado = operacoesBancarias.saldoContaPorCliente(conta2 , qtdClientesException);
			System.out.println("O valor do saldo da conta corrente para cada cliente é: " + resultado);
		} catch (MinhaException e) {
			System.out.println("Erro na consulta do saldo da conta corrente por cliente -> " + e.getCausa());
		}
	}

	private static Banco saldoContaCorrente() {
		
		Conta conta = new Conta("0190731", "0", 1000);
		Agencia agencia = new Agencia("1482", conta);
		Banco banco = new Banco(agencia, "Bradesco.SA", "237");
		
		return banco;
	}

}
