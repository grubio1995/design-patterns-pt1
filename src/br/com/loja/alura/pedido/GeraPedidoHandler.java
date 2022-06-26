package br.com.loja.alura.pedido;

import java.time.LocalDateTime;

import br.com.loja.alura.orcamento.Orcamento;

public class GeraPedidoHandler {

	// construtor com injeção de dependências: repository, service,, etc.
	
	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no bano de dados");
		System.out.println("Enviar email com dados do novo pedido");
	}
}
