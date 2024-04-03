package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo09DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Este programa cuenta los caracteres de la palabra o frase introducida \n"
				+ "Para terminar escribe salir");
		/*String texto =""; //Con while hay que inicializar la variable
		while (!texto.equals("salir")) {
			texto = JOptionPane.showInputDialog("Introduce el texto");
			System.out.println("El texto introducido tiene " + texto.length() + " caracteres");
		}
		System.out.println("Has salido del programa");*/
		
		String texto; //Con do while no nay que inicializar la variable
		do {
			texto = JOptionPane.showInputDialog("Introduce el texto");
			System.out.println("El texto introducido tiene " + texto.length() + " caracteres"); 
		}while(!texto.equals("salir"));
		
		System.out.println("Has salido del programa");
			
		
		
		
	}

}
