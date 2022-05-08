import java.util.Scanner;

/*
    Problema: 
    Realizar un programa del juego de cartas Blackjack.
*/

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Juego del Blackjack");
        int random;
        int accumulatedUser = 0;
        int accumulatedPc = 0;
        while (true) {
            System.out.println("Puntaje acumulado jugador: " + accumulatedUser);
            System.out.println("¿Desea continuar sacando cartas?");
            System.out.println("1. Sacar carta");
            System.out.println("2. Parar");
            int input = scanner.nextInt();
            if (input == 1) {
                random = (int) (Math.random() * (13)) + 1;
                System.out.println("Carta: " + random);
                accumulatedUser += random;
                random = (int) (Math.random() * (13)) + 1;
                accumulatedPc += random;
                if (accumulatedUser > 21 || accumulatedPc > 21) {
                    checkWinner(accumulatedUser, accumulatedPc);
                    break;
                }
            } else {
                checkWinner(accumulatedUser, accumulatedPc);
                break;
            }
        }

        scanner.close();

    }

    public static void checkWinner(int accumulatedUser, int accumulatedPc) {
        if (accumulatedUser > 21) {
            System.out.println("¡Perdiste!");
            System.out.println("Puntaje acumulado jugador: " + accumulatedUser);
        } else {
            if (accumulatedUser > accumulatedPc) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Ganó la máquina!");
            }
            System.out.println("Puntaje acumulado jugador: " + accumulatedUser);
            System.out.println("Puntaje acumulado PC: " + accumulatedPc);
        }
    }
}
