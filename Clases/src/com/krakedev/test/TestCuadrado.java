package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(5);
		
		double resultadoArea;
		double resultadoPerimetro;
		resultadoArea = c1.calcularArea();
		resultadoPerimetro = c1.calcularPerimetro();
		System.out.println("===============================CUADRADO 1===============================");
		System.out.println("Resultado area: " + resultadoArea);
		System.out.println("Resultado perimetro: " + resultadoPerimetro);
		
		Cuadrado c2 = new Cuadrado(8);
		
		double resultadoArea2;
		double resultadoPerimetro2;
		resultadoArea2 = c2.calcularArea();
		resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("===============================CUADRADO 2===============================");
		System.out.println("Resultado area cuadrado 2: " + resultadoArea2);
		System.out.println("Resultado perimetro cuadrado 2: " + resultadoPerimetro2);
		
		Cuadrado c3 = new Cuadrado(10);
		
		double resultadoArea3;
		double resultadoPerimetro3;
		resultadoArea3 = c3.calcularArea();
		resultadoPerimetro3 = c3.calcularPerimetro();
		System.out.println("===============================CUADRADO 3===============================");
		System.out.println("Resultado area cuadrado 3: " + resultadoArea3);
		System.out.println("Resultado perimetro cuadrado 3: " + resultadoPerimetro3);

	}

}