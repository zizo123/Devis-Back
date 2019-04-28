package com.devis.metier;

import java.util.List;

import com.devis.entities.User;

public interface UserMetier {
    List<User> getUsers();

    User getUser(Long id);

    User createUser(User user);

    User findUserByEmail(String email);

    User findUserByEmailAndPassword(String email, String password);
}
