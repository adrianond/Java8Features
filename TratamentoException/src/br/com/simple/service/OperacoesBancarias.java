package br.com.simple.service;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Conta;

public interface OperacoesBancarias {
	
	public Double saldoContaPorCliente(Conta saldo, int qtd_clientes) throws MinhaException;
	
	public Double consultarSaldoContaCorrente(Conta conta) throws MinhaException;
	
	public Double efetuarSaqueContaCorrente(Conta conta, int valorSaque) throws MinhaException;
	
	public Double efetuarDepositoContaCorrente (Conta conta, int valorDeposito) throws MinhaException;

}
