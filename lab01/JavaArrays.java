/*Cree un programa que Genere e imprima una matriz de enteros (1-9) aleatoria de mxn (longitud ingresada por usuario) 
y posteriormente sume sus elementos*/

import java.util.*;

public class JavaArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese m y luego n (enteros)");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matriz[][] = new int[m][n];
        int suma = 0;
        System.out.print("Matriz\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("Suma:" + suma);
    }
}