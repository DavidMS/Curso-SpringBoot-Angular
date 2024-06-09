package org.imagina.blog.service;

import org.imagina.blog.model.User;
import org.imagina.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findOlderUsers(int edad) {
        return userRepository.findTop3ByEdadGreaterThanEqual(edad);
    }
}
