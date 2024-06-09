package org.imagina.blog.service;

import org.imagina.blog.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    Optional<User> getUser(int id);
    User addUser(User user);
    void deleteUser(int id);
    User updateUser(User user);
    List<User> findOlderUsers(int edad);
}
