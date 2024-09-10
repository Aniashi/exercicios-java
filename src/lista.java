import java.util.Scanner;

public class lista {
    public static void main(String[] args) throws Exception {
    int x;
    Scanner ler = new Scanner(System.in);
    System.out.println("Valor do desempenho do do funcionario:");
    x = ler.nextInt();
    if (x<=20){
        System.out.println("Funcionario tem um desempenho insastifatorio");
    }else if(x<=40){
        System.out.println("Funcionario tem um desempenho Regular");
    }else if (x<=60){
        System.out.println("Funcionario tem um desempenho Bom");
    }else if (x<=80){
        System.out.println("Funcionario tem um desempenho Ótimo");
    }
}
}