package com.example.holamundo.service;

import com.example.holamundo.model.User;

public interface SaludoService {
    public String hello();
    public String helloPersonalizado(String nombre);
    public User saludoPersonalizado(User user);
}
