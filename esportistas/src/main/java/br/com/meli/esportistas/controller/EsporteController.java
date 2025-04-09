package br.com.meli.esportistas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.esportistas.model.Esporte;
import br.com.meli.esportistas.repository.EsporteRepo;

@RestController
public class EsporteController {
    
    @GetMapping("/findSports")
    public ResponseEntity<List<Esporte>> getAllEsportes() {
        List<Esporte> listaEsportes = EsporteRepo.getAll();

        if(listaEsportes.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(listaEsportes);
    }
}
