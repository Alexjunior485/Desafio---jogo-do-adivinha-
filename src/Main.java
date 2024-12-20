i       mport java.util.Random;
import jav              a.  util.Scanner;

public class Main {
        publ            ic static void main(String[] args) {
                Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = random.nextInt(100) + 1; // Número entre 1 e 100
        int palpite;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        do {
            System.out.print("Digite seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroSorteado) {
                System.out.println("O número é maior.");
            } else {
                    System.out.println("O número é menor.");
}
        } while (true);

               scanner.close();
    }



















