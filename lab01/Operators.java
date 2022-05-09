/*
 * Cree una calculadora simple con las operaciones básicas
 * adición (+), resta (-), multiplicación (*), división (/)
 * y módulo (%)
*/

import java.util.Scanner;

public class Operators {
	public static void main (String [] args) {
		int a, b, operacion;
		Scanner sc = new Scanner (System.in);

		System.out.print("Seleccione la operacion\n1. Suma\n2. Resta\n3. Multiplicación\n4. Division\n5. Módulo\nOPCION: ");
		operacion = sc.nextInt();

		System.out.print("Valor 1: ");
		a = sc.nextInt();

		System.out.print("Valor 2: ");
		b = sc.nextInt();

		switch (operacion) {
			case 1:
				System.out.println(a + b);
				break;
			case 2:
				System.out.println(a - b);
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				System.out.println(a / b);
				break;
			case 5:
				System.out.println(a % b);
				break;
			default:
				System.out.println("Ingrese una operación válida");
		}
	}
}
