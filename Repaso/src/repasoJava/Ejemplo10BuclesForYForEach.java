package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo10BuclesForYForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0 ; i <= 4 ; i++) {
			System.out.println(i);
		}
		for (int i = 4 ; i >= 0 ; i--) {
			System.out.println(i);
		}
		for (int i = 0 ; i <= 10 ; i+=2) {
			System.out.println(i);
			if(i==6) {
				System.out.println("Ha llegado a 6");
				break;//Esto sale del bucle
			}
		}
		
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		//Ejercicios
		System.out.println("Ejericicio 1");
		/*En este ejercicio se pide al usuario que introduzca su dirección de email
		 con ayuda de la clase JOptionPane.
		Una vez introducido el email, el programa debe decir si la dirección de email es correcta
		o no teniendo en cuenta los siguientes requisitos:
		-Debe tener una @
		-No debe tener más de una @
		-Debe tener un punto
		-La dirección de email debe tener al menos 4 caracteres.
		El programa pedirá introducir indefinidamente la dirección de email si no es correcta
		 o si tienes menos de 4 caracteres.*/
		

		boolean valido = false;
		do {
			String email = JOptionPane.showInputDialog("Introduce tu email");
			int contadorArroba = 0;
			boolean punto = false;
			for(int i = 0 ; i < email.length() ; i++) {

				if(email.charAt(i) == '@') contadorArroba++;
				if(email.charAt(i) == '.') punto = true;
			}
			if(contadorArroba == 1 && punto == true && email.length() >= 4) {
				valido = true;
			}else {
				email = JOptionPane.showInputDialog("Email no valido, Introduce tu email");
			}
		}while(valido == false);
		
		System.out.println("Email correcto, bienvenido");
		
		System.out.println("Ejericicio 2");
		/*En este ejercicio, se pide el cálculo del factorial de un número introducido por el usuario
		 desde una ventana JOptionPane. El factorial de un número es igual a ese número multiplicado
		 por todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.*/
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		System.out.println(numero);
		for (int i = numero-1 ; i >= 1 ; i--) {
			numero *= i;
			System.out.println("x" + i);
			
		}
		System.out.println(numero);
		
		
		//For each
		int [] valores = new int[5];
		
		valores[0]=1;
		valores[1]=2;
		valores[2]=3;
		valores[3]=4;
		valores[4]=5;
		
		for(int i = 0;i <valores.length; i++) {
			System.out.println(valores[i]);
		}
		for(int elemento:valores) {
			System.out.println(elemento);
		}
	}

}
