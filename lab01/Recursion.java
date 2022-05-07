//Problema de ejemplo para el tema de recursion en Java
public class Recursion {
	public static void main(String[] args) {
		int fact5 = factorial(5);
		System.out.println(fact5);
	}
	//la funcion recursiva permite que esta funcion se llame a si misma
	public static int factorial(int num) {
		//se requiere de una condicion de finalizacion
		if (num < 1) 
			return 1;
		//mientras no este en la condicion, la funcion se repetira indefinidamente
		else
			return num*factorial(num-1);
	}
}
