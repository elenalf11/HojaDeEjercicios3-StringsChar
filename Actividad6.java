package main.HojadeEjercicios3;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese una cadena de caracteres: ");
		String frase = scanner.nextLine();
		
		System.out.println("¿Qué letra quiere cambiar?: ");
		String letrafuera = scanner.next();
		
		System.out.println("¿Por cuál quieres cambiarla?: ");
		String letranueva = scanner.next();
		
		scanner.close();
		
		System.out.println("Tu nueva cadena de caracteres es:   " + frase.replace(letrafuera, letranueva));
	}

}
