package exemplo01;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }

    // overload = sobrecarga
    public Pessoa(String nome, int idade){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }
    
    public void setIdade(String idade) {
        this.idade = Integer.parseInt(idade);
    }

    public String getNome() {
        return nome;
    }
}