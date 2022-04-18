package com.example.CRUD311.dao;

import com.example.CRUD311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImplementation implements UserDaoINterface{

    @PersistenceContext
    private EntityManager entityManager;

//    @Autowired
//    public UserDaoImplementation(EntityManager entityManager){
//        this.entityManager = entityManager;
//    }

    @Override
    @Transactional
    public void delete(Long id) {
        User user2 = entityManager.find(User.class, id);
        entityManager.remove(user2);
    }

    @Override
    @Transactional
    public void update(User user) {
        User user2 = entityManager.find(User.class, user.getId());
        entityManager.detach(user2);
        user2.setFirstName(user.getFirstName());
        user2.setLastName(user.getLastName());
        user2.setEmail(user.getEmail());
        entityManager.merge(user2);
    }

    @Override
    @Transactional
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> getListUsers() {
        return entityManager.createQuery("select users from User users").
                getResultList();
    }

}
