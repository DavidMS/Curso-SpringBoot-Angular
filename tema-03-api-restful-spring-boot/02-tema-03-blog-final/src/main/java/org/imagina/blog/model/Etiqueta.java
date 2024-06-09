package org.imagina.blog.model;

import java.util.List;

public class Etiqueta {
    private int id;
    private String nombre;
    private List<Integer> postList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getPostList() {
        return postList;
    }

    public void setPostList(List<Integer> postList) {
        this.postList = postList;
    }
}
