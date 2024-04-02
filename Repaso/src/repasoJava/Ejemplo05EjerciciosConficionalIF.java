package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo05FlujosEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int distancia_colegio;
		
		double renta_familiar;
		
		byte hermanos_centro;
		
		distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la distancia al colegio en km"));
		renta_familiar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la renta familiar"));
		hermanos_centro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el nº de hermanos"));
		if(distancia_colegio > 10 || renta_familiar < 20000 || hermanos_centro >= 2) {
			System.out.println("El alumo tiene beca"); 
			
		}else {
			System.out.println("El alumno no tiene beca");
		}
	}
}
