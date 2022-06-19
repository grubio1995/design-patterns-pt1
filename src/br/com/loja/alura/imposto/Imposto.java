package br.com.loja.alura.imposto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public interface Imposto {

	 BigDecimal calcular(Orcamento orcamento);
}
