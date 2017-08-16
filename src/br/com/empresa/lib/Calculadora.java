package br.com.empresa.lib;

public class Calculadora {
	private double resultado;
	
	public Calculadora() {
		
	}
	
	public Calculadora(double valor) {
		this.resultado = valor;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	
	public double Somar(double valor) {
		return this.resultado += valor;
	}
	
	public double Dividir(double valor) {
		return this.resultado /= valor;
	}

	public double Subtrai(double valor) {
		return this.resultado -= valor;
	}

	public double Multiplicacao(double valor) {
		return this.resultado *= valor;
	}


}


