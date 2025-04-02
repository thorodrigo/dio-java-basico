import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);
        int verificacao = 0;

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos de idade");
        System.out.println("E tenho " + altura + " metros de altura");        
        System.out.println("Os dados estão corretos?");
                        
        verificacao = scanner.nextInt();

        if (verificacao == 1){
            System.out.println("Relatorio enviado"); 
        } else {
            System.err.println("Relatorio rejeitado");
        }
    }
}
