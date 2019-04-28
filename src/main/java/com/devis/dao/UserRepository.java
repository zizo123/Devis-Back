package com.devis.dao;


import org.springframework.data.repository.CrudRepository;

import com.devis.entities.User;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByEmail(String email);

    User findOneByEmailAndPassword(String email, String password);
}
