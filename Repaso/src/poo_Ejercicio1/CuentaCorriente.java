package poo_Ejercicio1;

import java.util.Random;

public class CuentaCorriente {

	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	Random random = new Random();
	
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	//	this.numeroCuenta = 1000000 + (long) (random.nextDouble() * (1000000000 - 1000000));
		//Math.abs: recoge el número absoluto, es decir cualquier número lo convierte en positivo si es negativo
		//nextLong(): genera un número Long
		numeroCuenta = Math.abs(random.nextLong());
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setIngreso(double ingreso) {
		if(ingreso < 0) {
			System.out.println("No se permiten ingresos negativos");
		}
		else {
			saldo += ingreso;
		}
	}
	
	public void setReintegro(double reintegro) {
		saldo -= reintegro;
	}
	
	//static quiere decir que el método donde lo apliques pertenece a la própia clase
	//Es decir no se puede usar en la misma clase donde está generado
	public static void Transferencia(CuentaCorriente titul1, CuentaCorriente titul2, double cantidad) {
		titul1.saldo -= cantidad;
		titul2.saldo += cantidad;
	}
	
	public String getDatosCuenta() {
		return "Titular: " + nombreTitular + "\n" +
				"Nº de cuenta: " + numeroCuenta + "\n" +
				"Saldo: " + saldo;	
	}
}
