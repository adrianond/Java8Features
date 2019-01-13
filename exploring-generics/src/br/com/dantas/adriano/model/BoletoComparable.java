package br.com.dantas.adriano.model;

import java.util.Date;

public class BoletoComparable implements Comparable<BoletoComparable> {

	private String valor;
	private Date data_pagamento;
	private String credor;
	
	public BoletoComparable(String valor, Date date_pagamento, String credor){
		this.data_pagamento = date_pagamento;
		this.valor = valor;
		this.credor = credor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	@Override
	public int compareTo(BoletoComparable boleto) {

		if (this.data_pagamento.before(boleto.getData_pagamento())) {
			return -1;
		}
		if (this.data_pagamento.after(boleto.getData_pagamento())) {
			return 1;
		}
		return 0;
	}
}
