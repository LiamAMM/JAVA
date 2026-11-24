package com.cmc.repaso.entidades;

public class Validacion {

	public boolean validarMonto(double monto) {
		if (monto > 0) {
			return true;
		} else if (monto < 0) {
			return false;
		} else {
			return false;
		}
	}
}