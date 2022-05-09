/*
 * Escriba una función que reciba un double, haga un casting al valor
 * y lo devuelva como un entero
*/

public class TypeCasting {
	public static void main (String [] args) {
		//Crearemos una constante para el ejemplo (PI = 3.1416)
		final double PI = 3.1416;
		//Luego castearemos la constante con la ayuda de la función toInt
		int castPI = toInt(PI);
		//Imprimiremos PI y su valor casteado
		System.out.println(PI);
		System.out.println(castPI);
	}
	public static int toInt (double n) {
		return (int) n;
	}
}
