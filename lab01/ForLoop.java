
/*
Problema: 
Crear un programa que imprima desde un número ingresado por
el usuario hasta el 1.

*/
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.close();
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
