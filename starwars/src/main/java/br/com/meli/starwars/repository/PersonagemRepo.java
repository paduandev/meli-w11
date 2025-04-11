package br.com.meli.starwars.repository;

import java.util.List;

import br.com.meli.starwars.model.Personagem;

public interface PersonagemRepo {
    List<Personagem> findAllByContainsName(String name);
}
