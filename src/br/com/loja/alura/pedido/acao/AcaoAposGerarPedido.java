package br.com.loja.alura.pedido.acao;

import br.com.loja.alura.pedido.Pedido;

public interface AcaoAposGerarPedido {

	abstract void executar(Pedido pedido);
}
