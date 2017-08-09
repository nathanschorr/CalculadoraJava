package br.com.empresa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.empresa.lib.Calculadora;

public class TesteCalculadora {

	@Test
	public void somaNumeroInteiros() {
		Calculadora  calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2,3), 5, 0);
	}
	
	@Test
	public void somaNumeroComVirgula() {
		Calculadora  calculadora = new Calculadora();
		assertEquals(calculadora.Soma(2.7,3.8), 6.5, 0);
		
	}




}



