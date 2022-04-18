package com.example.CRUD311.dao;


import com.example.CRUD311.model.User;

import java.util.List;

public interface UserDaoINterface {

    void delete(Long id);
    void update(User user);
    void add(User user);
    List<User> getListUsers();
}
