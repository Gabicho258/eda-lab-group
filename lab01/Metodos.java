/*Cree un metodo que imprima los primos en un rango y luego confirmelo en el main, confie en que el usuario colocara un rango valido*/

public class Metodos {
    public static void main(String[] args) {
        primosRango(103, 103);
    }

    static boolean esPrimo(int n) {
        // no existen primos pares o menores a 2
        if (n < 2 || n % 2 == 0)
            return false;
        else {
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    static void primosRango(int a, int b) {
        if (a <= 2 && b >= 2)
            System.out.print(2 + " ");
        // como todo ningun par es primo uso operadores ternarios para iniciar por un
        // primo y luego incremento de 2 en 2
        for (int i = (a % 2 == 0) ? a + 1 : a; i <= b; i += 2) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

    }
}