package br.com.performacao.api.cravoecanela.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @CrossOrigin
    @GetMapping
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.ok("OK");
    }

}
