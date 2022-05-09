/*
 * Crea un función que reciba un string (nombre), lo ponga en 
 * mayúscula, luego concatenarlo para que imprima un saludo
 * (Bienvenido PEDRO!) y la longitud del nombre (Longitud: 5)
*/

public class Strings {
	public static void main (String [] args ) {
		String [] integrantes = {"gabriel", "bryan", "franco", "barbara", "carlo"};
		for (String nombre : integrantes)
			displayGreeting(nombre);
	}
	public static void displayGreeting (String name) {
		//Concatenaremos el nombre con el saludo (+)
		//Convertiremos el nombre a mayúsculas con la función toUpperCase()
		System.out.println("Bienvenido " + name.toUpperCase() + "!");
		//Hallaremos la longitud del nombre con la función length()
		System.out.println("Longitud: " + name.length());
	}
}
