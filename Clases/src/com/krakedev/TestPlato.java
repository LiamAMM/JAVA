package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		Plato platoB;
		Plato platoC;
		
		platoA = new Plato();
		platoB = new Plato();
		platoC = new Plato();
		
		platoA.setNombre("Ensalada César");
		platoA.setTipo("Entrada");
		platoA.setPrecio(5.99);
		platoA.setDisponible(true);
		
		platoB.setNombre("Pollo a la parrilla");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(12.99);
		platoB.setDisponible(true);
		
		platoC.setNombre("Tarta de chocolate");
		platoC.setTipo("Postre");
		platoC.setPrecio(6.49);
		platoC.setDisponible(false);
		
		System.out.println("=======================================Plato A=======================================");
		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());
		
		System.out.println("=======================================Plato B=======================================");
		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());
		
		System.out.println("=======================================Plato C=======================================");
		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());
	}

}