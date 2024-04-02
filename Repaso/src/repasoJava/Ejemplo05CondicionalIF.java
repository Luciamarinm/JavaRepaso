package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo05Flujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce una edad"));
		if(edad >= 18) {
			if(edad < 40) {
				System.out.println("Eres mayor de edad y eres muy joven");
			}else if(edad > 40 && edad < 65) {
				System.out.println("Eres mayor de edad y eres maduro");
			}else {
				System.out.println("Eres mayor de edad y eres mayor");
			}
		}else {
			System.out.println("Eres menor de edad");
		}
		
	}

}
