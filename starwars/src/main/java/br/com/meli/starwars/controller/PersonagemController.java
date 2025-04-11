package br.com.meli.starwars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.starwars.dto.PersonagemDTO;
import br.com.meli.starwars.service.PersonagemService;

@RestController
@RequestMapping("/starwars")
public class PersonagemController {

    @Autowired
    private PersonagemService service;


    @GetMapping("/{name}")
    public ResponseEntity<List<PersonagemDTO>> getByName(@PathVariable String name) {
        List<PersonagemDTO> personagens = service.findAllByContainsName(name);

        if(personagens.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personagens);
    }

    @GetMapping("/outro/{name}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<PersonagemDTO> getByNameOuto(@PathVariable String name) {
        List<PersonagemDTO> personagens = service.findAllByContainsName(name);
        return personagens;

    }
}

