package com.devis.metier.impl;


import com.devis.dao.UserRepository;
import com.devis.entities.User;
import com.devis.metier.UserMetier;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.List;

@Service
public class UserMetierImpl implements UserMetier {

    private final UserRepository userRepository;

    @Autowired
    public UserMetierImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    private void populateSampleData() {
        //userRepository.save(new User("email@test", "pass", "firstname", "lastname"));
    }


    @Override
    public List<User> getUsers() {
        Iterator<User> userIterator = userRepository.findAll().iterator();
        return IteratorUtils.toList(userIterator);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        return userRepository.findOneByEmailAndPassword(email, password);
    }
}
