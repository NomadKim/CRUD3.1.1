package com.example.CRUD311.service;

import com.example.CRUD311.dao.UserDaoImplementation;
import com.example.CRUD311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserImplem implements UserInterface{

    @Autowired
    private UserDaoImplementation userDaoImplementation;

    @Override
    public void delete(Long id) {
        userDaoImplementation.delete(id);
    }

    @Override
    public void update(User user) {
        userDaoImplementation.update(user);
    }
    @Override
    public void add(User user) {
        userDaoImplementation.add(user);
    }

    @Override
    public List<User> getListUsers() {
        return userDaoImplementation.getListUsers();
    }
}
