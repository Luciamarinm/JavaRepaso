package repasoJava;

public class Ejemplo02ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 1:");
		double numero = 9;
		double resultado;
		resultado = Math.sqrt(numero); //Esta función funciona con double, no con float
		System.out.println("La raiz cuadrada de " + numero + " es " + resultado);
		
		System.out.println("Ejercicio 2:");
		int base = 4;
		int exponente = 8;
		double resultadoPotencia = Math.pow(base, exponente);
		System.out.println(base + " elevado a " + exponente + " es igual a " + resultadoPotencia);
		
		System.out.println("Ejercicio 3");	
		double numeroRedondeo = 16.35;
		int resultadoRedondeo = (int)Math.round(numeroRedondeo); 
		System.out.println(numeroRedondeo + " redondeado = " + resultadoRedondeo);
		
		/* si no ponemos la F, será double en vez de float 
		eso quiere decir que int no sería apropiado, ya que requeriría un Long, por el tipo de función */
		int resultado1 = Math.round(8.3F);
		//Castear para que no pase eso
		int resultado2 = (int)Math.round(3.4);
		
		
		
		
	}

}
