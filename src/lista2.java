import java.util.Scanner;

public class lista2 {
        public static void main(String[] args) throws Exception {
        double emprestimo;
        double salario;
        int parcelas;
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor do empréstimo: ");
        emprestimo = ler.nextDouble();
        System.out.println("Quantidade de parcelas:");
        parcelas = ler.nextInt();
        System.out.println("Seu salário:");
        salario = ler.nextDouble();
        if(emprestimo <=30% salario){
            System.out.println("Empréstimo reprovado");
        }else{
            System.out.println("Empréstimo aprovado");
        }
        
    }
}
