
/*
Problema 1:
Crear un programa que retorne true si el dinero ingresado
es mayor a una UIT y false si no lo es
Problema 2:
Realizar un programa que indique si eres mayor de edad
en función a una edad ingresada

*/
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problema 1");
        System.out.print("Ingrese una cantidad de dinero: ");
        int money = scanner.nextInt();
        final int UIT = 4600;
        if (money > UIT) {
            System.out.println("Es mayor a una UIT");
        } else {
            System.out.println("No es mayor a una UIT");
        }
        System.out.println("Problema 2");
        System.out.print("Ingrese una edad: ");
        int age = scanner.nextInt();
        scanner.close();
        String result = age >= 18 ? "Usted es mayor de edad" : "Usted no es mayor de edad";
        System.out.println(result);
    }
}