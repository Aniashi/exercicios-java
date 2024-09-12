import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String cpf;
        System.out.println("Informe seu cpf em 11 dígitos");
        System.out.println("Apenas números:");
        cpf = ler.nextLine();
        int validacao = contarDigitos(cpf);
        System.out.println(" o número informado tem "+validacao+" digítos");
        if (validacao == 11){
            System.out.println("cpf válido");
        }else{
            System.out.println("cpf inválido");
        }
    }
        public static int contarDigitos(String numero) {
            
            String numeroLimpo = numero.replaceAll("\\D", "");
           
            return numeroLimpo.length();
        }
        
}


