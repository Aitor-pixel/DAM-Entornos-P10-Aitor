package main.java.ieseuropa;

import java.util.ArrayList;

public class Numero {

	private static String numeroSuerte(int numero) {
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			numeros.add(i);
		}
		numeros.removeIf(num -> (num % 2 == 0));
		int pos = 1;
		while (pos < numeros.size()) {
			int lista = numeros.get(pos);
			for (int i = lista - 1; i < numeros.size(); i += lista - 1) {
				numeros.remove(i);
			}
			pos++;
		}
		if (numeros.contains(numero)) {
			return "es un numero de la suerte";
		} else {
			return "no es un numero de la suerte";
		}
	}

	private static int calcularFactorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int numero = 5;
		System.out.println("Factorial: " + numero + " != " + calcularFactorial(numero));
		System.out.println("El numero " + numero + " " + numeroSuerte(numero));

	}
}
