package main.HojadeEjercicios3;
import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime una cadena de caracteres y te diré si es palíndromo o no: ");
		String cadena = scanner.nextLine();
		scanner.close();
		
		
		System.out.println(InvertirCadena(cadena));
		
		
		if (cadena.equals(InvertirCadena(cadena))) {
			System.out.println("Es palíndromo");
		}
		else {
			System.out.println("No es palíndromo");
		}
		
		
		

	}
	
	public static String InvertirCadena (String cadena) {
		String cadenainvertida = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenainvertida = cadenainvertida + cadena.charAt(i);
			
			
		}
		
		return cadenainvertida;
	}

}
