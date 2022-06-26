package br.com.loja.alura.orcamento.situacao;

import java.math.BigDecimal;

import br.com.loja.alura.DomainException;
import br.com.loja.alura.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado!");
	}
}
