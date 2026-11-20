package com.clearminds.cuentas.test;

import com.clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("A");

		System.out.println("-------- Valores Modificados ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		Cuenta cuenta4 = new Cuenta("09876"); 
		cuenta4.setSaldo(1200.50);

		Cuenta cuenta5 = new Cuenta("11223", "A", 350.00); 

		Cuenta cuenta6 = new Cuenta("55443");
		cuenta6.setTipo("C");
		cuenta6.setSaldo(890.75);

		System.out.println("-------- Cuentas Adicionales ---------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}