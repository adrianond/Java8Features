package br.com.dantas.adriano.model;

import java.util.Comparator;

public class BoletoComp implements Comparator<Boleto> {

	@Override
	public int compare(Boleto boleto1, Boleto boleto2) {

		if (boleto1.getData_pagamento().before(boleto2.getData_pagamento())) {
			return -1;
		}
		if (boleto1.getData_pagamento().after(boleto2.getData_pagamento())) {
			return 1;
		}
		return 0;
	}

}
