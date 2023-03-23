package main.java.ieseuropa;

public class Array {
	
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
	}

}
