package br.com.loja.alura.orcamento.situacao;

import br.com.loja.alura.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
