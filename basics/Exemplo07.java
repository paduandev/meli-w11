public class Exemplo07 {
    public static void main(String[] args) {

        int cont = 0;

        while (cont < 5) {
            System.out.println(cont);
            cont++;
        }

        System.out.println(cont);

        System.out.println("-----");

        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
        }
        
        int i = 0;
        for ( ; ; ) {
            if(i < 5){
                break;
            }
            i++;
            System.out.println(i);
        }

    }
}
