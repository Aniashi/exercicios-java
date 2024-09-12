import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a velocidade por m/s:");
        int velocidade;
        velocidade = ler.nextInt();
        if (velocidade<=5){
            System.out.println("Movimento lento");
        }else if(velocidade>5 && velocidade<=15){
            System.out.println("Velocidade moderada");
        }else{
            System.out.println("Velocidade rápida");
        }
    }
}
