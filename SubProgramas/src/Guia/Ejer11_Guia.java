package Guia;

import java.util.Scanner;

public class Ejer11_Guia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Ingrese una palabra");
		frase = sc.nextLine();

		transformar(frase.toLowerCase());

	}

	public static void transformar(String frase) {

		String auxi;
		
		for (int i = 0; i < frase.length(); i++) {
			switch (frase.substring(i, i + 1)) {
				case "a":
					auxi = frase.substring(0, i);
					auxi = auxi.concat("@");
					auxi = auxi.concat(frase.substring(i + 1, frase.length()));
					frase = auxi;
					break;
				case "e":
					auxi = frase.substring(0, i);
					auxi = auxi.concat("#");
					auxi = auxi.concat(frase.substring(i + 1, frase.length()));
					frase = auxi;
					break;
				case "i":
					auxi = frase.substring(0, i);
					auxi = auxi.concat("$");
					auxi = auxi.concat(frase.substring(i + 1, frase.length()));
					frase = auxi;
					break;
				case "o":
					auxi = frase.substring(0, i);
					auxi = auxi.concat("%");
					auxi = auxi.concat(frase.substring(i + 1, frase.length()));
					frase = auxi;
					break;
				case "u":
					auxi = frase.substring(0, i);
					auxi = auxi.concat("*");
					auxi = auxi.concat(frase.substring(i + 1, frase.length()));
					frase = auxi;
					break;
			}
		}
		System.out.println(frase);
		
//		frase = frase.replaceAll("[aeiou]", "@"); //Reemplaza aeiou por #
//		frase = frase.replaceFirst("a", "@"); //Reemplaza la primera "a" encontrada por "@"
//		frase = frase.replace("a", "@"); //Reemplaza todas las "a" por "@"
	}
}

