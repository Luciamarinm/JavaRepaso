package repasoJava;

import java.util.Scanner;

public class Ejemplo11Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] valores = new int[5]; 
		
		valores[0]=1;
		valores[1]=2;
		valores[2]=3;
		valores[3]=4;
		valores[4]=5;
		
		//for
		for(int i = 0;i <valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println(" ");
		//For each
		for(int elemento:valores) {
			System.out.print(elemento + " ");
		}
		
		String [] nombre_persona = {"Juan", "Maria", "Antonio", "Laura"}; 
		System.out.println(" ");
		//for
		for(int i = 0;i <nombre_persona.length; i++) {
			System.out.print(nombre_persona[i] + " ");
		}
		System.out.println(" ");
		//For each
		for(String elemento:nombre_persona) {
			System.out.print(elemento + " ");
		}
		
		//Array bidimensional
		int [][] numeros = new int [3][2]; //3 el número de dimensiones que habrá y el 2 es el número de valores
		System.out.println(" ");
		for(int i = 0 ; i < 3 ; i++) {
			for(int z = 0 ; z < 2; z++) {
				numeros[i][z]= z*(i+1);
				System.out.print(i +" x " + z + " = " + numeros[i][z] + " ");
			}
			System.out.println(" ");
		}
		
		int [][] numeros2 = {
				{1,25,9},
				{2,25,9}}; 	
		for(int[] numero2: numeros2) { //Hay que especificar que va a ser un array
			for(int numeroDimension: numero2) {
				System.out.print(numeroDimension + " ");
			}
			System.out.println(" ");
				
		}
		Scanner entrada = new Scanner(System.in);
		//Ejercicios
		/* Ejercicio 1: Almacenar un array
		 * En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. 
		 * Los números introducidos se almacenarán en un array. 
		 * El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
		 * */
	/*	
		int [] ejercicio1 = new int [10];
		int negativos = 0;
		int positivos = 0;
		int cero = 0;
		for(int i = 0 ; i < ejercicio1.length ; i++) {
			System.out.println("Introduce un número");
			ejercicio1[i] = entrada.nextInt();
			if(ejercicio1[i] == 0) {
				cero++;
			} else if (ejercicio1[i] < 0){
				positivos++;
			} else {
				negativos++;
			}
		}
		System.out.println("Números negativos: " + negativos);
		System.out.println("Números positivos: " + positivos);
		System.out.println("Ceros: " + cero); */
		
				
		/*Ejercicio 2: Media en posiciones pares del array
		 * En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
		 * Los números se almacenarán en un array y el programa calculará la media de los números introducidos
		 * en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
		 * */
	/*	int [] ejercicio2 = new int [10];
		
		int suma = 0;
		int numeroE2 = 0;

		float media;
		for(int i = 0 ; i < ejercicio2.length ; i++) {
			System.out.println("Introduce un número");
			ejercicio2[i] = entrada.nextInt();
		}
		for(int i = 0 ; i < ejercicio2.length ; i++) {
			if(i % 2 == 0) {
				suma+=ejercicio2[i];
				System.out.print(ejercicio2[i] + " ");
				numeroE2++;
			}
		}
		/*
		
		media = (float)suma/numeroE2; //Castear para que salga decimales
		System.out.print("= " + media);

		
		/*Ejercicio 3: Almacenar aleatorios en array
		 * En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las posiciones
		 * un nº aleatorio entre 1 y 100. El programa debe imprimir en consola todos los valores almacenados
		 * en el array. Utiliza un bucle for-each para leer los valores almacenados.
		 * (Debes utilizar el método random() de la clase Math).
		 * */
		
		int [] ejercicio3 = new int [100];
		
		for(int i = 0 ; i < ejercicio3.length ; i++) {
			ejercicio3[i] = (int)(Math.random() * 100) + 1;
		}
		for(int i = 0 ; i < ejercicio3.length ; i++) {
			System.out.print(ejercicio3[i] + " ");
			
		}
		
	}

}
