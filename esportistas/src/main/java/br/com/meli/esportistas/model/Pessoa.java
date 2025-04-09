package br.com.meli.esportistas.model;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;
    private Esporte esporte;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobreNome, int idade, Esporte esporte) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.esporte = esporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }
}
