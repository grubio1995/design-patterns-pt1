package br.com.loja.alura.desconto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular (Orcamento orcamento) {

		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));

		return cadeiaDeDescontos.calcular(orcamento);

	}
}
 	 	