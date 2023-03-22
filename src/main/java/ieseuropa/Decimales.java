package main.java.ieseuropa;

public class Decimales {
	private static float[] ecuacionSegundoGrado(float a, float b, float c){
		float x1 = (float)(-b + Math.sqrt((b*b) -(4*a*c)))/(2*a);
		float x2 = (float)(-b - Math.sqrt((b*b) -(4*a*c)))/(2*a);

		return new float[] {x1,x2};
	}
	public static void main(String[] args) {
		float[] ecuacion = ecuacionSegundoGrado(1f, 3f, -4f);
		System.out.println("Las soluciones son: "+ecuacion[0]+ " "+ecuacion[1]);
	}

}