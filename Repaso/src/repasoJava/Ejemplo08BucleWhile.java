package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo08BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "Lucia";
		
		String acceso = "";
		
		while (!password.equals(acceso)) { //Se usa equals si es texto
			
			acceso = JOptionPane.showInputDialog("Introduce la clave de acceso, por favor");
			if(!password.equals(acceso)) {
				System.out.println("La clave es incorrecta");
			}
			
		}
		
		System.out.println("Bienvenido");
	
		//Ejercicio 1
		/*Debes crear un programa que genere un número aleatorio entre 1 y 100 y lo guarde en una variable. 
		 Al ejecutar el programa este pedirá por consola la introducción de un número entre 1 y 100.
		-Si el nº introducido por el usuario es mayor que el generado por el programa aleatoriamente, 
		saldrá un mensaje en consola indicando que “el nº es menor”.
		-Si el nº introducido por el usuario es menor que el generado por el programa aleatoriamente, 
		saldrá un mensaje en consola indicando que “el nº es mayor”.
		La operativa se repetirá indefinidamente hasta que el usuario adivine el nº aleatorio generado 
		por el programa. Cuando se adivine el nº aleatorio, debe salir un mensaje en consola que diga 
		“Correcto” y el nº de intentos consumidos para averiguar el nº*/
		
		int clave = (int)(Math.random() * 100) + 1;
		System.out.println(clave);
		
		int introducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce la clave"));
		int intentos = 0;

		while(clave!=introducido) { //Se usa == si es un número
			intentos ++;
			
			if(clave < introducido) {
				
				System.out.println("el nº es menor");
				
			}else if(clave > introducido) {
				
				System.out.println("el nº es mayor");
				
			}
			introducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce la clave"));

		}
		System.out.println("Correcto");
		System.out.println(intentos);
		
		
	}

}
