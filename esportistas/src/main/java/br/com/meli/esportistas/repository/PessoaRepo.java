package br.com.meli.esportistas.repository;

import java.util.List;

import br.com.meli.esportistas.model.Esporte;
import br.com.meli.esportistas.model.Pessoa;
import br.com.meli.esportistas.model.dto.PessoaDTO;

public class PessoaRepo {
    private static List<Pessoa> pessoas = List.of(
        new Pessoa("Marcos", "Floariano", 20, new Esporte("Futebol", "iniciante")),
        new Pessoa("Mariana", "Silva", 20, new Esporte("Basquete", "intermediário")),
        new Pessoa("Armando", "Torres", 20, new Esporte("Natação", "avançado"))
    );

    public List<Pessoa> getAll() {
        return pessoas.stream().toList();
    }

    public static List<PessoaDTO> getPessoasDTO() {
        return pessoas.stream().map(p->new PessoaDTO(p)).toList();
    }

}
