package org.imagina.blog.model;

import java.util.List;

public class Post {
    private int id;
    private String titulo;
    private String contenido;
    private List<Integer> etiquestaList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<Integer> getEtiquestaList() {
        return etiquestaList;
    }

    public void setEtiquestaList(List<Integer> etiquestasList) {
        this.etiquestaList = etiquestasList;
    }
}
