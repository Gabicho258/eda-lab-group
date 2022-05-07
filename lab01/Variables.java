/*Imprima el promedio ponderado que obtuvo Jose en el curso de P.Web 
(17,18,18) en el siguiente formato "Nombre:(su nombre) Nota:(su nota);
ademas debera tratar de utilizar por lo menos 3 tipos de variable 
distintas*/
public class Variables {

    public static void main(String[] args) {
        int nota1 = 17, nota2 = 18, nota3 = 18;
        double prom = 1.0 * (nota1 + nota2 + nota3) / 3;
        String nombre = "Jose";
        System.out.println("Nombre:" + nombre + " Nota:" + prom);
    }
}