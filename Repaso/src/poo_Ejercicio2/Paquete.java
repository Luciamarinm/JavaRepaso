package poo_Ejercicio2;

import java.util.Random;

public class Paquete {

	private int referenciaEnvio;
	private double peso;
	private String dni;
	private int prioridadEnvio;
	Random random = new Random();
	
	public Paquete(int referenciaEnvio, double peso, String dni, int prioridadEnvio) {
		this.referenciaEnvio = referenciaEnvio;
		this.peso = peso;
		this.dni = dni;
		if(prioridadEnvio >= 0 && prioridadEnvio <= 2) {
			this.prioridadEnvio = prioridadEnvio;
			referenciaEnvio = Math.abs(random.nextInt());
		}
		else {
			System.out.println("La prioridad de envío seleccionada no es correcta");
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getPrioridadEnvio() {
		return prioridadEnvio;
	}

	public void setPrioridadEnvio(int prioridadEnvio) {
		if(prioridadEnvio >= 0 && prioridadEnvio <= 2) {
			this.prioridadEnvio = prioridadEnvio;
			referenciaEnvio = Math.abs(random.nextInt());
		}
		else {
			System.out.println("La prioridad de envío seleccionada no es correcta");
		}
	}
	
}
