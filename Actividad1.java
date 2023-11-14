package main.HojadeEjercicios3;
import java.util.*;

/**
 * @author elena
 */

public class Actividad1 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		/**
		 * Aquí declaro las variables
		 */
		
		System.out.println("Dime una cadena de caracteres y te diré cuantas veces aparece la a/A: ");
		String cadena = scanner.nextLine();
		
		scanner.close();
		
		/**
		 * Aquí compruebo la longitud de la cadena de caracteres
		 */
		System.out.println(cadena.length());
		
		/**
		 * Aquí cuento cuantas veces aparece la a o la A
		 */
		
		char a = 'a';
		char A = 'A';
		
		for (int j = 0; j < cadena.length(); j++) {
			System.out.println(cadena.charAt(1));
		}
		
		
		
		
		

	}

}
