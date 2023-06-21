package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Users;
import com.epsi.arosaje.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;


    @PostMapping("/register")
    public void register(@RequestHeader("username") String username, @RequestHeader("password") String password, @RequestHeader("email") String email) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(email);
        Users user = new Users();
        user.setName(password);
        user.setEmail(email);
        user.setPassword(password);
        usersRepository.save(user);
    }
}
