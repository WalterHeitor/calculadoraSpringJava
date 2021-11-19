package br.com.softwalter.calculadora.infrastructure.http.controller;

import br.com.softwalter.calculadora.infrastructure.http.dto.NumberRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MathController {
    @GetMapping
    public ResponseEntity<Double> calcular(@RequestBody NumberRequest numberRequest){
        return ResponseEntity.ok().body(1D);
    }
}
