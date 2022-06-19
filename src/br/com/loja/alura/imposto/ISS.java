package br.com.loja.alura.imposto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}
	
}
