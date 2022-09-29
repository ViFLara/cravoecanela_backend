package br.com.performacao.api.cravoecanela.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void healthCheck(){
        return;
    }

}
