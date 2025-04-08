package exemplo01;

public class Main {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa();

        Cliente c = new Cliente();

        Pessoa p1 = new Cliente();

        ((Cliente)p1).comprar();
        
        Cliente cp = (Cliente) p1;
        cp.comprar();

        Consumivel cm = new Cliente();

    }
}
