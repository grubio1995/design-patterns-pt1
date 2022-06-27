package br.com.loja.alura.pedido.acao;

import br.com.loja.alura.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedidos no banco de dados!");
	}

}
