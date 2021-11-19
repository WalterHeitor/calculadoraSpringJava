package br.com.softwalter.calculadora.infrastructure.http.controller;

import br.com.softwalter.calculadora.infrastructure.http.dto.ClientRequest;
import br.com.softwalter.calculadora.infrastructure.http.dto.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ClientController {
    @GetMapping
    public ResponseEntity<ClientResponse> saveClient(@RequestBody ClientRequest numberRequest){

        return ResponseEntity.ok().body(null);
    }
}
