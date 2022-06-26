package br.com.loja.alura.orcamento;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.situacao.EmAnalise;
import br.com.loja.alura.orcamento.situacao.SituacaoOrcamento;

public class Orcamento extends SituacaoOrcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);'x'
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);		
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

}
