package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto prod = new Producto("Mouse", 20.0);
		prod.setPrecio(-10.0);
		System.out.println(prod.precio);
		System.out.println(prod.calcularPrecioPromo(15));
	}
}