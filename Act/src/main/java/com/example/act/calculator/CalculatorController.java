package com.example.act.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/division")
public class CalculatorController {

    @GetMapping("/{a}/{b}")
    public ResponseEntity<?> resta(@PathVariable int a, @PathVariable int b) {
        if(b == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error 400: 'b' no puede ser 0");
        }else {
            int resultado = a / b;
            return ResponseEntity.ok(resultado);
        }
    }

}