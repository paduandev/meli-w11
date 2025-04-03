package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = 2;

        try(Scanner s = new Scanner("");) {
            double resposta = 10 / valor;
            System.out.println(resposta);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Acabou");
        }
        
        
        

    }
}
