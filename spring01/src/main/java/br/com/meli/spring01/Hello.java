package br.com.meli.spring01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
    
    @GetMapping("/ola")
    public String hello()  {
        return "Olá Mundo!";
    }
}
