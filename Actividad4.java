package main.HojadeEjercicios3;
import java.util.*;

/**
 * @author elena
 */

public class Actividad4 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main (String [] args) {
		/**
		 * Aquí declaro las variables
		 */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introduce una palabra y te la invierto: ");
		String cadena = scanner.next();
		
		scanner.close();
		
		/**
		 * Aquí digo el resultado utilizando el método InvertirCadena que hemos creado
		 */
		
		System.out.print("La cadena que ha escrito ha sido: " + cadena + " ahora invertida es: " + InvertirCadena(cadena));
		

	}
	
	/**
	 * Este es mi método InvertirCadena
	 * @param cadena
	 * @return
	 */
	
	public static String InvertirCadena (String cadena) {
		
		
		/**
		 * Aquí declaro la variable de la cadena invertida
		 */
	
		
		String cadenainvertida = "";
		
	
		/**
		 * Aquí inserto un bucle for para poder recorrer la cadena de caracteres
		 */
	
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenainvertida = cadenainvertida + cadena.charAt(i);
			
		}
		
		/**
		 * Aquí indico lo que quiero que el programa me devuelva
		 */
	
		return cadenainvertida;
	
	
	
	
	
	}
}