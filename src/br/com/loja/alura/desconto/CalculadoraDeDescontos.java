package br.com.loja.alura.desconto;

import java.math.BigDecimal;

import br.com.loja.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular (Orcamento orcamento) {
		if(orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
		}
		
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));			
		}
		
		return BigDecimal.ZERO;
	}
}
