package com.devis.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devis.metier.UserMetier;

@RestController
@RequestMapping("oil")
public class UserRestController {

    private final UserMetier userService;

    @Autowired
    public UserRestController(UserMetier userService) {
        this.userService = userService;
    }
    @CrossOrigin
    @RequestMapping(
            value = "/users",
            method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }
    @CrossOrigin
    @RequestMapping(
            value = "/user/{id}",
            method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }
}
