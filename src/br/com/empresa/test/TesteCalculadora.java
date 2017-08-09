package br.com.empresa.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.empresa.lib.Calculadora;

public class TesteCalculadora {
	private Calculadora calculadora;
	
	@Before
	public void before() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void somaNumeroInteiros() {
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 3, 0);
	}
	
	@Test
	public void somaNumeroComVirgula() {
		calculadora.Somar(2.33);
		assertEquals(calculadora.getResultado(), 2.33, 0);
		
	}


	@Test
	public void criaCalculadoraComValorInicial() {
		calculadora = new Calculadora(10);
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 13, 0);
		
	}

}



