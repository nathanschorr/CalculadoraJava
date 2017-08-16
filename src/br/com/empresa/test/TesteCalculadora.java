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
	public void somaValorEDividi() {
		calculadora.Somar(20);
		calculadora.Dividir(2);
		assertEquals(calculadora.getResultado(), 10, 0);
	}
	
	@Test
	public void criaCakcyladoraComValorESubtrai() {
		calculadora = new Calculadora(10);
		calculadora.Subtrai(5);
		assertEquals(calculadora.getResultado(), 5, 0);
	}
	
	@Test
	public void criaCalculadoraComValorInicial() {
		calculadora = new Calculadora(10);
		calculadora.Somar(3);
		assertEquals(calculadora.getResultado(), 13, 0);
		
	}
	@Test
	public void criaCalculadoraComValorSubtraiEVolta() {
		calculadora = new Calculadora(10);
		calculadora.Subtrai(2);
		calculadora.Somar(2);
		assertEquals(calculadora.getResultado(), 10, 0);
	}                       
	@Test
	public void criaCalculadoraComValorSomarEVolta() {
		calculadora = new Calculadora(10);
		calculadora.Somar(2);
		calculadora.Subtrai(2);
		assertEquals(calculadora.getResultado(), 10, 0);
	}
	@Test
	public void somaValorEDividiEVolta() {
		calculadora = new Calculadora(10);
		calculadora.Dividir(2);
		calculadora.Somar(5);
		assertEquals(calculadora.getResultado(), 10, 0);
	}             

}



	

