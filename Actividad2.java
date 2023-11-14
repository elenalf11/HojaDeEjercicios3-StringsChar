package main.HojadeEjercicios3;
import java.util.*;

/**
 * @author elena
 */

public class Actividad2 {
	
	/**
	 * Este es mi método main
	 * @param args
	 */

	public static void main(String[] args) {
		
		/**
		 * Declaro las variables y pido al usario una cadena de caracteres
		 */
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Dime una frase y te cambiaré algunas letras: ");
		String frase = scanner.nextLine();
		scanner.close();
		
		/**
		 * Sustituyo algunos caracteres con el método .replace(oldChard, newChard).
		 */
		
		System.out.println(frase.replace('e', 'x'));
		
		

	}

}
