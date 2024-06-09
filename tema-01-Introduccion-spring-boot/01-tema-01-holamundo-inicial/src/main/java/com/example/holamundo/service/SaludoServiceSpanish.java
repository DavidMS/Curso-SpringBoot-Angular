package com.example.holamundo.service;

import com.example.holamundo.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("spanish")
public class SaludoServiceSpanish implements SaludoService {

    public String hello() {
        return "Hola Mundo!";
    }

    public String helloPersonalizado(String nombre) {
        return "Hola Mundo mi nombre es " + nombre;
    }

    public User saludoPersonalizado(User user) {
        user.setNombre("Nombre modificado");
        return user;
    }
}
