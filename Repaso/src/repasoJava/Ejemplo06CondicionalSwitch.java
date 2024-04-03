package repasoJava;

import javax.swing.JOptionPane;

public class Ejemplo06CondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("Introduce nº de hijos"));
		
		switch (hijos) {
		case 0: 
			
			System.out.println("La natalidad es baja");
			break;
			
		case 1:
			
			System.out.println("Tienes un hijo");
			break;
			
		case 2:
			
			System.out.println("Tienes dos hijos");
			break;
			
		case 3:
			
			System.out.println("Tienes tres hijos");
			break;
			
		default:
			
			System.out.println("Sois familia numerosa");
			break;
		}
		
		double salario1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del padre"));
		double salario2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario de la madre"));
		double salario_mayor;
		
		/*if(salario1 > salario2)  {
			salario_mayor = salario1;
			System.out.println("El salario mayor es el del padre: " + salario_mayor);
		}
		else if(salario1 < salario2) {
			salario_mayor = salario2; 
			System.out.println("El salario mayor es el de la madre: " + salario_mayor);	
		}
		else {
		System.out.println("Los salarios son iguales");
			
		}*/
		
	}
}

