public class Exemplo01 {

    public static void main(String[] args) {

        int numero = 5;

        float numero2;

        numero2 = (float) 5.99;

        numero = (int) numero2;

        System.out.println(numero);
        System.out.println(0.1 + 0.2);

        System.out.println((double) numero / 2); // casting

        // BigDecimal numero; // para uso em caso de problemas de precisão com decimal

        String nome1 = "Joao";
        String nome2 = "joao";

        System.out.println(nome1 == nome2); // Isso não compara os conteúdos !!!!

        System.out.println(nome1.equals(nome2));
        System.out.println(nome1.equalsIgnoreCase(nome2));
    }

}