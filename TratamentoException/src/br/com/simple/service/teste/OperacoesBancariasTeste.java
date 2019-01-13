package br.com.simple.service.teste;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Agencia;
import br.com.simple.model.Banco;
import br.com.simple.model.Conta;
import br.com.simple.service.OperacoesBancariasImpl;

public class OperacoesBancariasTeste {

	public static void main(String[] args) {

		Banco banco = saldoContaCorrente();

		// consultarSaldoPorCliente(banco);

		// consultarSaldoContaCorrente(banco);

		// efetuarSaqueContaCorrente(banco);

		efetuarDepositoEmContaCorrente(banco);
	}

	private static void efetuarDepositoEmContaCorrente(Banco banco) {
		OperacoesBancariasImpl operacoesBancarias = new OperacoesBancariasImpl();
		try {
			Double saldo = operacoesBancarias.efetuarDepositoContaCorrente(banco.getAgencia().getConta(), 500);
			System.out.println("Saldo atual em conta corrente é: " + saldo);
		} catch (MinhaException e) {
			System.out.println("Erro na efetuação do depósito em conta corrente -> " + e.getCausa());
		}
	}

	private static void efetuarSaqueContaCorrente(Banco banco) {
		OperacoesBancariasImpl operacoesBancarias = new OperacoesBancariasImpl();
		try {
			Double saldo = operacoesBancarias.efetuarSaqueContaCorrente(banco.getAgencia().getConta(), 1100);
			System.out.println("Saldo atual em conta corrente é: " + saldo);
		} catch (MinhaException e) {
			System.out.println("Erro na efetuação do saque na conta corrente -> " + e.getCausa());
		}
	}

	private static void consultarSaldoContaCorrente(Banco banco) {

		OperacoesBancariasImpl operacoesBancarias = new OperacoesBancariasImpl();
		try {
			Double saldo = operacoesBancarias.consultarSaldoContaCorrente(banco.getAgencia().getConta());
			System.out.println("Saldo em conta é: " + saldo);
		} catch (MinhaException e) {
			System.out.println("Erro na consulta do saldo da conta corrente -> " + e.getCausa());
		}
	}

	private static void consultarSaldoPorCliente(Banco banco) {
		int qtdClientes = 2;
		// forço exceção de divisão por zero
		int qtdClientesException = 0;
		Double resultado = 0.0;
		// forço nullPointerException
		Conta conta2 = null;

		OperacoesBancariasImpl operacoesBancarias = new OperacoesBancariasImpl();
		try {
			resultado = operacoesBancarias.saldoContaPorCliente(banco.getAgencia().getConta(), qtdClientesException);
			System.out.println("O valor do saldo da conta corrente para cada cliente é: " + resultado);
		} catch (MinhaException e) {
			System.out.println("Erro na consulta do saldo da conta corrente por cliente -> " + e.getCausa());
		}
	}

	private static Banco saldoContaCorrente() {

		Conta conta = new Conta("0190731", "0", 1000.00);
		Agencia agencia = new Agencia("1482", conta);
		Banco banco = new Banco(agencia, "Bradesco.SA", "237");

		return banco;
	}

}
