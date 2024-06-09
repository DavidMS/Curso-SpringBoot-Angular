package com.example.holamundo.controller;

import com.example.holamundo.model.User;
import com.example.holamundo.service.SaludoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Message {

    private SaludoService saludoService;

    public Message(@Qualifier("spanish") SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping
    @Operation(summary = "Un saludo al mundo", description = "Este endpoint saluda al mundo amablemente.")
    public String hello() {
        return saludoService.hello();
    }

    @GetMapping("/{nombre}")
    public String helloPersonalizado(@PathVariable String nombre) {

        return saludoService.helloPersonalizado(nombre);
    }

    @PostMapping
    public User saludoPersonalizado(@RequestBody User user) {
        return saludoService.saludoPersonalizado(user);
    }

}
