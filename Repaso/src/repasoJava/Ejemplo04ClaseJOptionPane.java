package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo04ClaseJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esto abrirá una ventana de dialogo y entrada de texto
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre por favor:"); //Tipo String
		System.out.println("Tu nombre es: " + nombre);
		//Para pedir otros tipos de datos
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad por favor:"));	
		System.out.println("Tu edad es: " + edad);
		
		//Ejercicio: 
		/*Al ejecutar el programa nos debe pedir introducir dos valores numéricos utilizando una ventana 
		de tipo showInputDialog:
		Una base
		Un exponente
		Una vez introducidos los dos valores, 
		el programa mostrará en consola el resultado de elevar la base al exponente*/
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número por favor:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número por favor:"));
		double potencia = Math.pow(numero1, numero2);
		System.out.println("El resultado de " + numero1 + " elevado a " + numero2 + " es " + potencia);
	}

}
