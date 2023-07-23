import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);

        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i > 0;i--){
            System.out.println("Você pode chutar um total de 5 vezes. No momento você tem " + i + " chances.");
            int chute = scanner.nextInt();

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns você acertou! ");
                break;
            }
            if (chute != numeroAleatorio) {
                System.out.println("Infelizmente você errou. Mas tente novamente. ");
            }

        }
    }
}
