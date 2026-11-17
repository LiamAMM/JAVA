package com.krakedev;

public class Mensajeria {
	
	private String nombre;
	private String apodo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public void saludar() {
		System.out.println("¡Hola!");
	}
	
	public void saludarPersona(String nombre, String apodo) {
		System.out.println("Hola: " + nombre + " Tu apodo es: " + apodo);
	}
	
}