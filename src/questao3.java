import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) throws Exception {
        int x;
        double salario;
        double bonus;
        double salAtual;
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor do desempenho do do funcionario entre 20, 40, 60, 80:");
        x = ler.nextInt();

        if (x==20){
            System.out.println("Funcionario tem um desempenho insastifatorio");
            System.out.println();
        }else if(x==40){
            System.out.println("Funcionario tem um desempenho Regular");
            System.out.println();
        }else if (x==60){
            System.out.println("Funcionario tem um desempenho Bom");
            System.out.println();
        }else if (x==80){
            System.out.println("Funcionario tem um desempenho Ótimo");
            System.out.println();
        }

       // double salario;
        System.out.println("Salário: ");
        salario = ler.nextDouble();

        if (x==20){
            bonus = 0.05 * salario;
            salAtual = salario + bonus;
            System.out.println("Recebeu um aumento salarial de 5%, o salário atual é de: "+salAtual);
        }else if(x==40){
            bonus = 0.10 * salario;
            salAtual = salario + bonus;
            System.out.println("Recebeu um aumento salarial de 10%, o salário atual é de: "+salAtual);
        }else if(x==60){
            bonus = 0.15 * salario;
            salAtual = salario + bonus;
            System.out.println("Recebeu um aumento salarial de 15%, o salário atual é de: "+salAtual);
        }else if(x==80){
            bonus = 0.20 * salario;
            salAtual = salario + bonus;
            System.out.println("Recebeu um aumento salarial de 20%, o salário atual é de: "+salAtual);
        }
    }
}
