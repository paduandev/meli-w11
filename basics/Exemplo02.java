public class Exemplo02 {
    public static void main(String[] args) {
        boolean c1, c2;

        c1 = true;
        c2 = false;

        System.out.println( (10 < 2) && (4 > 9) ); // (4 > 9) não será executado neste caso

        System.out.println( (10 < 2) || (4 > 9) );
    }
}
