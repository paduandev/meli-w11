package br.com.meli.esportistas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.esportistas.model.Esporte;
import br.com.meli.esportistas.model.dto.PessoaDTO;
import br.com.meli.esportistas.repository.EsporteRepo;
import br.com.meli.esportistas.repository.PessoaRepo;

@RestController
public class EsporteController {

    @Autowired
    private EsporteRepo repo;
    
    @GetMapping("/findSports")
    public ResponseEntity<List<Esporte>> getAllEsportes() {
        List<Esporte> listaEsportes = repo.getAll();

        if(listaEsportes.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(listaEsportes);
    }

    @GetMapping("/findSports/{nome}")
    public ResponseEntity<Esporte> getByName(@PathVariable String nome) {
        Optional<Esporte> optinalEsporte = repo.getByName(nome);

        if(optinalEsporte.isPresent()) {
            return ResponseEntity.ok(optinalEsporte.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findSportsPersons")
    public ResponseEntity<List<PessoaDTO>> getPessoas() {
        List<PessoaDTO> pessoasDTO = PessoaRepo.getPessoasDTO();

        return ResponseEntity.ok(pessoasDTO);
    }
}
