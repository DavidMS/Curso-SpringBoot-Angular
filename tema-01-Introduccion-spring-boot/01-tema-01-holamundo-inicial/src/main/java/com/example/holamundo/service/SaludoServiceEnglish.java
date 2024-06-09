package com.example.holamundo.service;

import com.example.holamundo.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("english")
public class SaludoServiceEnglish implements SaludoService{

    public String hello() {
        return "Hello World!";
    }

    public String helloPersonalizado(String nombre) {
        return "Hello World my name is " + nombre;
    }

    public User saludoPersonalizado(User user) {
        user.setNombre("Modifyed name");
        return user;
    }
}
