import java.math.BigDecimal;

import br.com.loja.alura.desconto.CalculadoraDeDescontos;
import br.com.loja.alura.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {

		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"),4);
		BigDecimal desconto = new CalculadoraDeDescontos().calcular(primeiroOrcamento);
		System.out.println("Valor desconto: " + desconto);
		
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"),1);
		desconto = new CalculadoraDeDescontos().calcular(segundoOrcamento);
		System.out.println("Valor desconto: " + desconto);
	}

}
