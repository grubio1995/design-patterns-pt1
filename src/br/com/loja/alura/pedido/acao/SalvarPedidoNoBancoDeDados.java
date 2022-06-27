package br.com.loja.alura.pedido.acao;

import br.com.loja.alura.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Enviando email com os dados do pedido ");
	}

}
