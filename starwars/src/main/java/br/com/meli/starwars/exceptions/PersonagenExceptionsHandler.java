package br.com.meli.starwars.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PersonagenExceptionsHandler {

    @ExceptionHandler(PersonagemNotFoundException.class)
    public ResponseEntity<PersonNotFoundExDetails> handlerNotFound(PersonagemNotFoundException ex) {
        return new ResponseEntity<PersonNotFoundExDetails>(
                new PersonNotFoundExDetails(
                        "Not Found", HttpStatus.NOT_FOUND.value(), ex.getMessage(), LocalDate.now()),
                HttpStatus.NOT_FOUND);
    }
}
