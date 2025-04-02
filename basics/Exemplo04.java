import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String palavras;
        String dados;

        System.out.println("Digite um número");
        dados = entrada.nextLine();
        numero = Integer.parseInt(dados);

        // entrada.nextLine();
        System.out.println("Digite uma palavra");
        palavras = entrada.nextLine();


        System.out.println("lido: " + numero);
        System.out.println("lido: " + palavras);

        entrada.close();

    }
}
