package com.krakedev;

public class Calculadora {
	
	private double resultado;

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double sumar(int a, int b) {
		resultado = a + b;
		return resultado;
	}
	
	public int restar(int a, int b) {
		int res;
		res = a - b;
		return res;
	}
	
	public double multiplicar(int a, int b) {
		resultado = a * b;
		return resultado;
	}
	
	public double dividir(int a, int b) {
		resultado = a / b;
		return resultado;
	}
	
	public double promediar(int a, int b, int c) {
		resultado = (a + b + c) / 3;
		return resultado;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Sali al almuezo. Regreso en 15 minutos");
	}

}