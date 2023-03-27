package main.java.ieseuropa;

public class Decimales {
	
	private static int eliminarDecimales(double numero) {
		return (int)numero;
	}

	public static void main(String[] args) {
		double numero = 2.99;
		System.out.println("Eliminar decimales: " + eliminarDecimales(numero));
	}

}
