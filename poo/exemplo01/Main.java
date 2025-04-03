package exemplo01;

public class Main {
    public static void main(String[] args) {
        Pessoa p1;

        // p1.idade = 12;
        // p2.idade = 23;
        
        // p1 = p2;
        // p1.idade = 77;

        String nome = "Emerson";

        p1 = new Pessoa(nome);

        p1.setIdade(-22);
        int idade =  p1.getIdade();

        System.out.println(idade);


    }
}
