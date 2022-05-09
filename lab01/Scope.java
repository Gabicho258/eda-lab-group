//Problema de ejemplo para el tema del 'alcance' en Java
//El alcance de las variables se determina se esta esta o no
//dentro de un bloque de codigo, por ejemplo
public class Scope {
	public static void main(String[] args) {
		//aqui no se puede hacer uso de nomCurso

		String nomCurso = "Programación Web 2";
		//aqui SI se puede usar nomCurso
		for (int i=0; i<1; i++) {
			//aqui SI se puede hacer uso de nomCurso
			//y tambien de i
			System.out.println(nomCurso);
		}
		//aqui NO se puede hacer uso de i
		//pero SI se puede hacer uso de nomCurso
		otroCurso();
	}
	//dentro de un metodo distinto a main nomCurso no existe
	public static void otroCurso() {
		//puedo asignarle otro valor a pesar de que exista en main
		String nomCurso = "Estructura de Datos y Algoritmos";
		System.out.println(nomCurso);
	}
}
