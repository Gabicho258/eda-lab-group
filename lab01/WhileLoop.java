
/*  Problema
Crear un programa que retorne todos los números pares entre 1 y 
un número ingresado por el usuario.
*/

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        scanner.close();
        int limit = 2;
        while (num >= limit) {
            System.out.println(limit);
            limit += 2;
        }
    }
}
