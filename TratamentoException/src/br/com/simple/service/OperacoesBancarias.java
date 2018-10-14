package br.com.simple.service;

import br.com.simple.exceptions.MinhaException;
import br.com.simple.model.Conta;

public interface OperacoesBancarias {
	
	public void sacar() throws MinhaException;
	
	public int saldoContaPorCliente(Conta saldo, int qtd_clientes) throws MinhaException;

}
