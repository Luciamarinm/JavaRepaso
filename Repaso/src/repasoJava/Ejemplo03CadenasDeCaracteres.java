package repasoJava;
import java.util.Scanner;
public class Ejemplo03CadenasDeCaracteres {
	
	public static void main(String[] args) {
		
		//String no es un tipo primitivo
		/*Métodos:
		-lenght(): devuelve la longitud de una cadena de carácteres 
		-charAt(n): devuelve la posición de un carácter dentro de una cadena.(empieza en 0).
		-substring(x,y): devuelve una subcadena dentro de una cadena, siendo X el carácter a partir del cuál
		se extrae e Y el nº de carácteres que se quieren extraer.
		-equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son.
		Distingue mayúsculas y minúsculas.
		-equalsIgnoreCase(cadena): igual que el anterior peros in tener en cuenta mayúsculas y minúsculas.
		*/
		
		String nombre = "Lucia";
		System.out.println("Tu nombre es " + nombre);
		System.out.println(nombre.length());
		System.out.println(nombre.charAt(2));
		char letra = nombre.charAt(3);
		System.out.println(letra);
		int numero = nombre.length() - 1;
		System.out.println("La última letra es " + nombre.charAt(numero));
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre de otra persona");
		String otroNombre = entrada.next();
		System.out.println(nombre.equalsIgnoreCase(otroNombre));
		if(nombre.equalsIgnoreCase(otroNombre)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombres son distintos");
		}
		
		
		String frase = "Hola que tal";
		System.out.println(frase.substring(5));
		System.out.println(frase.substring(5, 8));
		}
}
