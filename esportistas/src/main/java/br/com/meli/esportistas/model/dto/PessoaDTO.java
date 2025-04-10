package br.com.meli.esportistas.model.dto;

import br.com.meli.esportistas.model.Pessoa;

public class PessoaDTO {
    private String nome;
    private String sobreNome;
    private String esporte;

    public PessoaDTO(Pessoa pessoa) {
        nome = pessoa.getNome();
        sobreNome = pessoa.getSobreNome();
        esporte = pessoa.getEsporte().getNome();
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

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
    
}
