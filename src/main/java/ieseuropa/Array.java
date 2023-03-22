package main.java.ieseuropa;

public class Array {
	private static int media(int[]array) {
		int suma = 0;
		for(int i=0;i<array.length;i++) {
				suma += array[i];
		}
		return suma / array.length;
	}

	public static void main(String[] args) {
		int[] array = {2,5,56,17,45,23,9,122,1};
		System.out.println("La media es " + media(array));
	}

}
