import java.math.BigDecimal;

import br.com.loja.alura.imposto.CalculadoraImpostos;
import br.com.loja.alura.imposto.TipoImposto;
import br.com.loja.alura.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100.00"));
		BigDecimal imposto = new CalculadoraImpostos().calcular(orcamento, TipoImposto.ICMS);
		System.out.println("Valor imposto: " + imposto);
	}

}
