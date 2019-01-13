package br.com.simple.service;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Conta;

public class OperacoesBancariasImpl implements OperacoesBancarias {
	
	/**
	 * a partir do java 7, podemos tratar mais de um tipo de exceção do mesmo
	 * cacth (Multicatch), nesse caso ArithmeticException ou
	 * NullPointerException
	 */
	public Double saldoContaPorCliente(Conta conta, int qtd_clientes) throws MinhaException{

		Integer saldoPorCliente = 0;
		Double saldoFinal = 0.0;
		try {
			Integer saldo = conta.getSaldo().intValue();
			saldoPorCliente = saldo / qtd_clientes;
			saldoFinal = saldoPorCliente.doubleValue();
		} catch (ArithmeticException | NullPointerException e) {
			throw new MinhaException("Erro em: [OperacoesBancariasImpl.saldoContaPorCliente method] ", e.getCause() + " " + e.getMessage());
		}
		return saldoFinal;
	}

	
	public Double consultarSaldoContaCorrente(Conta conta) throws MinhaException {
		
		return conta.getSaldo();
	}

	public Double efetuarSaqueContaCorrente(Conta conta, int valorSaque) throws MinhaException {
		
		Integer saldo = conta.getSaldo().intValue();
		 
		 if(valorSaque > saldo) {
			 throw new MinhaException("Erro em: [OperacoesBancariasImpl.efetuarSaqueContaCorrente method] ", "Saldo Insuficiente");
		 } else {
			 saldo = saldo - valorSaque;
			 conta.setSaldo(saldo.doubleValue());
		 }
		return conta.getSaldo();
	}

	public Double efetuarDepositoContaCorrente(Conta conta, int valorDeposito) throws MinhaException {

		Integer saldo = conta.getSaldo().intValue() + valorDeposito;
		conta.setSaldo(saldo.doubleValue());
		
		return conta.getSaldo();
	}

}
