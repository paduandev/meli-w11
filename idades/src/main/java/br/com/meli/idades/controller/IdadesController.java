package br.com.meli.idades.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdadesController {

    @GetMapping("/idade/{dia}/{mes}/{ano}")
    public ResponseEntity<Integer> calcIdade(@PathVariable int dia, @PathVariable int mes, @PathVariable int ano) {
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        int idade = (int) dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);

        // return ResponseEntity.ok(idade);

        // return ResponseEntity.badRequest().build();

        // return new ResponseEntity<Integer>(idade, HttpStatus.CREATED);

        return ResponseEntity.status(HttpStatus.OK).body(idade);
    }
}
