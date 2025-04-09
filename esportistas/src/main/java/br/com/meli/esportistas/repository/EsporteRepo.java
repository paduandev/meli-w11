package br.com.meli.esportistas.repository;

import java.util.List;

import br.com.meli.esportistas.model.Esporte;

public class EsporteRepo {
    private static List<Esporte> esportes = List.of(
        new Esporte("Futebol", "iniciante"),
        new Esporte("Basquete", "intermediário"),
        new Esporte("Natação", "avançado")
    );

    public static List<Esporte> getAll() {
        return esportes.stream().toList();
    }
}
