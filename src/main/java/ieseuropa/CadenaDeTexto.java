package main.java.ieseuropa;

public class CadenaDeTexto {
	
	private static String repetirCadena(String cadena1, String cadena2, int veces) {
		String resultado = "";
		for (int i=0; i<veces; i++) {
			resultado += cadena1 + " " + cadena2 + " ";
		}
		return resultado;
	}

	public static void main(String[] args) {
		String cadena1 = "hola";
		String cadena2 = "mundo";
		int veces = 2;
		System.out.println(repetirCadena(cadena1, cadena2, veces));
	}

}
