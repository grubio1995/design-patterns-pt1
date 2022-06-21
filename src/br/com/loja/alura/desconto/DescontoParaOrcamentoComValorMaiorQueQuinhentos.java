package br.com.loja.alura.desconto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
