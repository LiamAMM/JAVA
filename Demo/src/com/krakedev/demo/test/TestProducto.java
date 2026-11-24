package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto producto1 = new Producto(101, "Teclado Mecanico");
		producto1.setDescripcion("Teclado compacto para escritorio");
		producto1.setPeso(0.75);
		
		producto1.imprimir();
	}

}
