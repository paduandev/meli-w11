package exceptions;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int valor = 0;




        // double resposta = 10 / valor;

        try {
            problema(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



        // try(Scanner s = new Scanner("");) {
            
        //     System.out.println(resposta);
        // } catch (ArithmeticException e) {
        //     System.out.println("Erro: " + e.getMessage());
        //     e.printStackTrace();
        // } catch (Exception e) {
        //     System.out.println("Erro: " + e.getMessage());
        // } finally {
        //     System.out.println("Acabou");
        // }
        
        
        

    }

    public static void problema(int valor) throws Exception {
        if(valor == 0){
            throw new Exception("Vc não pode dividir por zero");
        }
    }
}
