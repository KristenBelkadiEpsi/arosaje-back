package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Message;
import com.epsi.arosaje.entities.User;
import com.epsi.arosaje.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public User login(@RequestHeader("username") String username, @RequestHeader("password") String password) {
        User user = userRepository.findByUserName(username, password);
        return user;
    }
    @PostMapping("/register")
    public void register(@RequestHeader("username") String username, @RequestHeader("password") String password,
            @RequestHeader("email") String email) {
        User user = new User();
        user.setName(password);
        user.setEmail(email);
        user.setPassword(password);
        userRepository.save(user);
    }
}
