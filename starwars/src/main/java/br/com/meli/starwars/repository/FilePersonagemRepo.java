package br.com.meli.starwars.repository;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.starwars.model.Personagem;

@Repository
public class FilePersonagemRepo implements PersonagemRepo {
    private final List<Personagem> personagens;

    public FilePersonagemRepo() {
        personagens = loadData();
    }

    @Override
    public List<Personagem> findAllByContainsName(String name) {
        return personagens.stream().filter(p->match(name, p)).toList();
    }

    private boolean match(String name, Personagem personagem) {
        return personagem.getName().toUpperCase().contains(name.toUpperCase());
    }

    private List<Personagem> loadData() {
        File file = null;

        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo");
        }

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Personagem>> typeRef = new TypeReference<>(){};
        try {
            List<Personagem> personagens = mapper.readValue(file, typeRef);
            return personagens;
        } catch (Exception e) {
            System.out.println("Erro na leitura");
        }

        return Collections.emptyList();
    }

    
}
