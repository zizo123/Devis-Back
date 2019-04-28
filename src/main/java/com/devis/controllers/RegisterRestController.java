package com.devis.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devis.entities.User;
import com.devis.metier.UserMetier;

@RestController
@RequestMapping("oil")
public class RegisterRestController {

    private final UserMetier userService;

    @Autowired
    public RegisterRestController(UserMetier userService) {
        this.userService = userService;
    }
    @CrossOrigin
    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> register(@RequestBody User user) {
        if (userService.findUserByEmail(user.getEmail()) != null) {
            return new ResponseEntity<>(new User(), HttpStatus.OK);
        }

        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }
}
