/*Cree un metodo que imprima los primos en un rango y luego confirmelo en el main, confie en que el usuario colocara un rango valido*/

public class Metodos {
    public static void main(String[] args) {

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

    }
}