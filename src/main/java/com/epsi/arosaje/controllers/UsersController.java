package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Users;
import com.epsi.arosaje.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/login")
    public Users login(@RequestHeader("username") String username, @RequestHeader("password") String password){
        Users users = usersRepository.findByUserName(username);
        return users;
    }
    @PostMapping("/register")
    public void register(@RequestHeader("username") String username, @RequestHeader("password") String password, @RequestHeader("email") String email) {
        Users user = new Users();
        user.setName(password);
        user.setEmail(email);
        user.setPassword(password);
        usersRepository.save(user);
    }
}
