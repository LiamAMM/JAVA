package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion val = new Validacion();

		System.out.println(val.validarMonto(10.0));
		System.out.println(val.validarMonto(-5.0));
		System.out.println(val.validarMonto(0.0));
	}
}