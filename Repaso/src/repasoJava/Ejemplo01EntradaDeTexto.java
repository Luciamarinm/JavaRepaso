package repasoJava;

import java.util.Scanner;

public class Ejemplo01EntradaDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		System.out.println("Tu edad es: " + edad);
		
	}

}

