package poo_Ejercicio2;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int nSucursal, nPaquetes, ref, prioridad;
		double peso; 
		String direccion, ciudad, dni;
		
		System.out.println("Introduce los datos de la sucursal");
		System.out.println();
		System.out.println("Número de la sucursal");
		
		nSucursal = entrada.nextInt();
		System.out.println("Direección: ");
		direccion = entrada.next();
		System.out.println("Cudad: ");
		ciudad = entrada.next();
		
		Sucursal s1 = new Sucursal(nSucursal, direccion, ciudad);
		System.out.println("Introduzca el nº de paquetes a enviar");
		nPaquetes = entrada.nextInt();
		Paquete[] paquetes = new Paquete[nPaquetes];
		System.out.println("Introduzca los datos de cada paquete");
		
		for(int i = 0; i<nPaquetes ; i++) {
			System.out.println("Introduzca los datos del paquete " + (i + 1));
			System.out.println("Referencia: ");
			ref = entrada.nextInt();
			System.out.println("DNI del remitente: ");
			dni = entrada.next();
			System.out.println("Peso: ");
			peso = entrada.nextDouble();
			System.out.println("Prioridad: ");
			prioridad = entrada.nextInt();
			paquetes[i] = new Paquete (ref, peso, dni, prioridad);
		}
		
		System.out.println("\nLos datos de la sucursal son: ");
		System.out.println("Sucursal " + s1.getNumeroSucursal());
		System.out.println("Situada en " + s1.getDireccion() + " de " + s1.getCiudad());
		System.out.println("\n\nLos datos de los paquetes son: ");
		for(int i = 0 ; i < nPaquetes ; i++) {
			System.out.println("Paquete: " + (i+1));
			System.out.println("Precio = " + s1.calculaPrecio(paquetes[i]));
			System.out.println("Peso= " + paquetes[i].getPeso());
			System.out.println("----------------------------------------------------------");
		}
		
		
	}

}
