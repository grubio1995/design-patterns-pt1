package br.com.loja.alura.desconto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
