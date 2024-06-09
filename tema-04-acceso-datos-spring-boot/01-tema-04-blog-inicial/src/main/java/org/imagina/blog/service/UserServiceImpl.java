package org.imagina.blog.service;

import org.imagina.blog.model.User;
import org.imagina.blog.repository.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Data data;

    @Override
    public List<User> getUsers() {
        return data.getUserList();
    }

    @Override
    public Optional<User> getUser(int id) {
        return data.getUserList()
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public User addUser(User user) {
        data.getUserList().add(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Iterator itr = data.getUserList().iterator();
        while (itr.hasNext()) {
            User user = (User) itr.next();
            if(user.getId() == id) {
                itr.remove();
            }
        }
    }

    @Override
    public User updateUser(User user) {
        data.getUserList().stream().forEach(oldUser -> {
            if(oldUser.getId() == user.getId()) {
                oldUser.setNombre(user.getNombre());
            }
        });
        return getUser(user.getId()).get();
    }
}
