//Problema de ejemplo para el tema de sobrecarga de metodos
public class MethodOverloading {
	public static void main(String[] args) {
		int divEntera = division(91, 7);
		double divReal = division(13.0, 7.0);
		System.out.println("Resultado entero: "+divEntera);
		System.out.println("Resultado decimal: "+divReal);
	}
	//Los metodos en Java admiten sobrecarga, con varios metodos
	//con el MISMO NOMBRE
	public static int division(int a, int b) {
		return a/b;
	}
	public static double division(double a, double b) {
		return a/b;
	}
}
