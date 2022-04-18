package com.example.CRUD311.service;

import com.example.CRUD311.model.User;

import java.util.List;

public interface UserInterface {

    void delete(Long id);
    void update(User user);
    void add(User user);
    List<User> getListUsers();

}
