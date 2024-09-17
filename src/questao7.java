import java.util.Random;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Random random = new Random();
       Scanner ler = new Scanner(System.in);
       int tentativa;
       
        int numeroAleatorio = random.nextInt(101); // 0 a 100


       // System.out.println("Número inteiro aleatório entre 0 e 100: " + numeroAleatorio);
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (!acertou) {
            // Pede ao usuário para inserir um palpite
            System.out.print("Digite seu palpite: ");
            tentativa = ler.nextInt();

            // Verifica se o palpite está correto
            if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior que " + tentativa + ".");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor que " + tentativa + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
    

            }
            }
    }
}
