package main.java.ieseuropa;

import java.util.Arrays;

public class Array {
	
	private static float calcularMediana(int [] a) {
		int mitad = a.length/2;
		Arrays.sort(a);
		if (a.length % 2 == 0) {
			return (a[mitad - 1] + a[mitad]) / 2;
		} else {
			return a[mitad];
		}
	}
	
	public static int maximo(int[]a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		int[]a = {3, 4, 2, 6, 7};
		System.out.println(maximo(a));
		System.out.println("La mediana es: " + calcularMediana(a));
	}

}
