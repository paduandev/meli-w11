package br.com.meli.starwars.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.meli.starwars.dto.PersonagemDTO;
import br.com.meli.starwars.exceptions.PersonagemNotFoundException;
import br.com.meli.starwars.model.Personagem;
import br.com.meli.starwars.repository.PersonagemRepo;

@Service
public class PersonagemService {

    private PersonagemRepo repo;

    public PersonagemService(PersonagemRepo repo) {
        this.repo = repo;
    }

    public List<PersonagemDTO> findAllByContainsName(String name) {
         List<Personagem> personagens = repo.findAllByContainsName(name);
         if(personagens.isEmpty()) {
            throw new PersonagemNotFoundException("Não achei "+ name);
         }
         return personagens.stream().map(PersonagemDTO::new).toList();
    }

}
