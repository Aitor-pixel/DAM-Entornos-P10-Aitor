package main.java.ieseuropa;

public class Cadena {
	
	private static int ocurrenciasLetra (String s, char a) {
		int cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) == Character.toLowerCase(a)) {
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ocurrenciasLetra("hola caracola", 'a'));

	}

}
