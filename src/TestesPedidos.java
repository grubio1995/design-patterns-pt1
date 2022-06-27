import java.math.BigDecimal;
import java.util.Arrays;

import br.com.loja.alura.pedido.GeraPedido;
import br.com.loja.alura.pedido.GeraPedidoHandler;
import br.com.loja.alura.pedido.acao.EnviarEmailPedido;
import br.com.loja.alura.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Gabriel";
		BigDecimal valorOrcamento = new BigDecimal("300.00");
		int quantidadeItens = 5;
		
		GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), 
						new EnviarEmailPedido()));
		handler.executa(geraPedido);
	}

}
