package main.java.ieseuropa;


public class CadenaDeTexto {
	private static int calcularLongitudNombre(String cadena) {
		return cadena.length();
	}
	private static String repetirOcurrencias(String texto) {
		String repetido = "";
		for (int i = 0; i < texto.length(); i++) {
			repetido += texto.charAt(i);
			repetido += texto.charAt(i);
		}
		return repetido;
	}
	public static void main(String[] args) {
		System.out.println(calcularLongitudNombre("github"));
		System.out.println(repetirOcurrencias("NBA"));
	}

}
