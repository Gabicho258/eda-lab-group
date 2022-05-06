//Problema de ejemplo para el tema de metodos con parametros

public class MethodParameters {
	public static void main(String[] args) {
		hola("Bryan");
		registro("Bryan Orlando", "Hancco Condori", 20210571);
	}
	//Los metodos permiten 1 parametro
	public static void hola(String nombre) {
		System.out.println("Hola "+nombre+" bienvenido a la programacion en Java");
	}
	//Los metodos tambien permiten multiples parametros
	public static void registro(String nombres, String apellidos, int CUI) {
		System.out.println(apellidos+" / "+nombres+" - "+CUI);
	}
}
