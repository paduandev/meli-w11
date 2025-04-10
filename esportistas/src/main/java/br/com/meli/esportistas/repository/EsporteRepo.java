package br.com.meli.esportistas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.meli.esportistas.model.Esporte;

@Repository
public class EsporteRepo {
    private static List<Esporte> esportes = List.of(
        new Esporte("Futebol", "iniciante"),
        new Esporte("Basquete", "intermediário"),
        new Esporte("Natação", "avançado")
    );

    public List<Esporte> getAll() {
        return esportes.stream().toList();
    }

    public Optional<Esporte> getByName(String nome) {
        return esportes.stream().filter(e->e.getNome().equals(nome)).findFirst();
    }
}
