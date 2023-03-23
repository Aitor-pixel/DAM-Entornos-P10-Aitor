package main.java.ieseuropa;

import java.util.Scanner;

public class Numero {
	
	public static void esPrimo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero del cual quieres ver si es primo");
		int num = teclado.nextInt();
		int resto=0;
		for (int i=2 ; i<num ; i++) {
			resto=num%i;
			if (resto==0) {
				System.out.println("No es primo");
				break;
			}
		}
		if (resto!=0) {
			System.out.println("Es primo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esPrimo();

	}

}
