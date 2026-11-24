package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est = new Estudiante("Juan");
		est.calificar(9.0);
		System.out.println(est.resultado);
	}
}