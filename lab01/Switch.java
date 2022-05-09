import java.util.Scanner;

/*
    Problema: 
    Crear un programa retorne la operacion de dos números 
    en función al operador ingresado

*/

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese un número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese un operador: ");
        String operator = scanner.next();
        scanner.close();
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
