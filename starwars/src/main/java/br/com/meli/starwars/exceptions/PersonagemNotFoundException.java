package br.com.meli.starwars.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonagemNotFoundException extends RuntimeException {

    public PersonagemNotFoundException(String msg) {
        super(msg);
    }

}
