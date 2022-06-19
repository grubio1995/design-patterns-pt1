package br.com.loja.alura.imposto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class CalculadoraImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
