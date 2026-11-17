package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante rest1;
		
		rest1 = new Restaurante();
		
		System.out.println("=======================Restaurante 1 : Creado=======================");
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println("=======================Restaurante 1 : valores asignados=======================");
		
		rest1.setNombre("Colorado");
		rest1.setDireccion("Calle 123");
		rest1.setCalificacion(4.5);
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		System.out.println("=======================Restaurante 2 : Creado=======================");
		Restaurante rest2 = new Restaurante();
		
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());
		
		System.out.println("=======================Restaurante 2 : valores asignados=======================");
		
		rest2.setNombre("KFC");
		rest2.setDireccion("Santa Maria");
		rest2.setCalificacion(4.8);
		
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());

	}

}