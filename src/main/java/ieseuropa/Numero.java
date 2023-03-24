package main.java.ieseuropa;

public class Numero {

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

	}

}
