package br.unipe.topicos;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import br.unipe.topicos.service.OperacoesService;

@SpringBootTest
class OperacoesApplicationTests {

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void somaTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.somar(1,3);
		Assertions.assertEquals(4, resultado);
	}
	
	@Test
	public void subtracaoTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.subtrair(3,3);
		Assertions.assertEquals(0, resultado);
	}
	@Test
	public void multiplicacaoTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.multiplicar(2, 3);
		Assertions.assertEquals(6, resultado);
	}
	@Test
	public void divisaoTeste() {
		OperacoesService op = new OperacoesService();
		double resultado =op.dividir(8, 4);
		Assertions.assertEquals(2, resultado);
	}

}
