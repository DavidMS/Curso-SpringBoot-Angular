package org.imagina.blog.repository;

import jakarta.annotation.PostConstruct;
import org.imagina.blog.model.Etiqueta;
import org.imagina.blog.model.Post;
import org.imagina.blog.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Data {

    private List<User> userList;
    private List<Post> postList;
    private List<Etiqueta> etiquetaList;

    @PostConstruct
    private void init() {
        // Creación de etiquetas
        Etiqueta spring = new Etiqueta();
        spring.setId(1);
        spring.setNombre("spring");

        Etiqueta angular = new Etiqueta();
        angular.setId(2);
        angular.setNombre("angular");

        // Creación de posts
        Post post1 = new Post();
        post1.setId(1);
        post1.setTitulo("Un post sobre spring boot");
        post1.setContenido("Este es un post sobre spring boot en el que se habla de Spring boot");


        Post post2 = new Post();
        post2.setId(2);
        post2.setTitulo("Un post sobre angular");
        post2.setContenido("Este es un post sobre angular en el que se habla de Angular");


        // Creación de usuarios
        User user1 = new User();
        user1.setId(1);
        user1.setNombre("Paco");

        User user2 = new User();
        user2.setId(2);
        user2.setNombre("Alberto");

        // Estableciendo relaciones
        spring.setPostList(Arrays.asList(post1.getId()));
        angular.setPostList(Arrays.asList(post2.getId()));

        post1.setEtiquestaList(Arrays.asList(spring.getId()));
        post2.setEtiquestaList(Arrays.asList(angular.getId()));

        user1.setPostList(Arrays.asList(post1.getId()));
        user2.setPostList(Arrays.asList(post2.getId()));

        // Rellenar las listas
        userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);

        etiquetaList = new ArrayList<>();
        etiquetaList.add(spring);
        etiquetaList.add(angular);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public List<Etiqueta> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<Etiqueta> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }
}
