package com.cmc.repaso.entidades;

public class Item {
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos;

	public void imprimir() {
		System.out.println(productosActuales + " " + productosDevueltos + " " + productosVendidos);
	}

	public void vender(int cantidad) {
		this.productosActuales = this.productosActuales - cantidad;
		this.productosVendidos = this.productosVendidos + cantidad;
	}

	public void devolver(int cantidad) {
		this.productosActuales = this.productosActuales + cantidad;
		this.productosVendidos = this.productosVendidos - cantidad;
		this.productosDevueltos = this.productosDevueltos + cantidad;
	}
}