package poo_Ejercicio3;

import java.util.Random;

public class CuentaCorriente {

	private double saldo;
	private final String nombre;
	private final Long numeroCuenta;
	Random random = new Random();
	
	public CuentaCorriente(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.numeroCuenta = Math.abs(random.nextLong());
	}
	
	public String getDatosCuenta() {
		return "El titular de la cuenta es " + this.nombre +
				", El saldo de la cuenta es " + this.saldo +
				" y el número de la cuenta es " + this.numeroCuenta;
	}
	
	public void ingresarDinero(double cantidad) {
		if(cantidad < 0) {
			System.out.println("No se permiten ingresos negativos");
		}
		else {
			saldo += cantidad;
		}
	}
	
	public void retirarDinero(double cantidad) {
		this.saldo -= cantidad;
	}
	
	public static void transferencia(CuentaCorriente cc1, CuentaCorriente cc2, double cantidad) {
		cc1.saldo -= cantidad;
		cc2.saldo += cantidad;
	}
}
