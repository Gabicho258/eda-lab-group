/*
 * Se tiene un array de enteros, crear una función que devuelva
 * un array que contenga el mayor entero y el menor entero del
 * array usando la clase Math
*/

public class Maths {
	public static void main (String [] args) {
		int[] numbers = {-234, 5, 89, 5};
		int[] maxMin = getMaxMin(numbers);

		System.out.println("El maximo valor es: " + maxMin[0]);
		System.out.println("El minimo valor es: " + maxMin[1]);
	}
	public static int[] getMaxMin (int[] numbers) {
		//Iniciamos las variable con el primer valor del arreglo
		int min = numbers[0], max = numbers[0];

		//Iteramos y aplicamos las funciones de la clase Math
		//para hallar el minimo y maximo valor
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(numbers[i], max);
			min = Math.min(numbers[i], min);
		}
		//Retornamos el maximo y el minimo en forma de arreglo
		return new int[] {max, min};
	}
}
