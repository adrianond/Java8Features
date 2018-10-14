package br.com.simple.service;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Conta;

public class OperacoesBancariasImpl implements OperacoesBancarias {

	@Override
	public void sacar() {
		// TODO Auto-generated method stub

	}

	/**
	 * a partir do java 7, podemos tratar mais de um tipo de exceção do mesmo
	 * cacth (Multicatch), nesse caso ArithmeticException ou
	 * NullPointerException
	 */
	public int saldoContaPorCliente(Conta conta, int qtd_clientes) throws MinhaException{

		int saldoPorCliente = 0;
		try {
			saldoPorCliente = conta.getSaldo() / qtd_clientes;

		} catch (ArithmeticException | NullPointerException e) {
			throw new MinhaException("Erro em: [OperacoesBancariasImpl.saldoContaPorCliente method] ", e.getCause() + " " + e.getMessage());
		}
		return saldoPorCliente;
	}

}
