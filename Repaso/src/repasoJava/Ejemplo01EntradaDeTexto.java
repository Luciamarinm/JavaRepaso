package repasoJava;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo01EntradaDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt(); //Devuelve un Int
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //Si no lo ponemos, el enter se perderá y el programa lo omitirá
		String nombre = entrada.nextLine(); //Si no lo usamos al inicio no guardará el nombre 
		
		System.out.println("Tu edad es: " + edad + " y tu nombre es " + nombre);
		System.out.println("¿Cual es la edad de tu hermano?");
		int edadHermano = entrada.nextInt();
		if(edad < edadHermano) { //Para concatenar e interiormente hacer sumas, hay que usar parentesis
			System.out.println("Eres menor que tu hermano por " + (edadHermano - edad) + " años");
		} else if(edad > edadHermano) {
			System.out.println("Eres mayor que tu hermano por " + (edad - edadHermano) + " años");
		} else {
			System.out.println("Teneis la misma edad");
		}

		
		entrada.close(); //cerrar clase Scanner
	}

}

