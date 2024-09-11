import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        int x;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um horário:");
        x = ler.nextInt();
        if(x>9 && x<19){
            System.out.println("O horário está dentro do horário comercial");
        }else{
            System.out.println("O horário está fora do horário comercial");
        }
    }
}
