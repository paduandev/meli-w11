package exemplo01;

public interface Consumivel {
    final int NUMBER = 1; // final implicitamente

    public void comprar(); // abstract

    public default void comprarAPrazo() {
        System.out.println("comprando....");
    }

    public static void fazer(){};
}
