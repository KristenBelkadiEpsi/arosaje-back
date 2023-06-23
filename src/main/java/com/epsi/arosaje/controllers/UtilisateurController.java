package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Utilisateur;
import com.epsi.arosaje.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping("/login")
    public Utilisateur login(@RequestHeader(name = "username", required = true) String username, @RequestHeader(name = "password", required = true) String password) {
        Utilisateur utilisateur = utilisateurRepository.findByUserName(username, password);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println(utilisateur);
        return utilisateur;
    }

    @PostMapping("/register")
    public void register(@RequestHeader("username") String username, @RequestHeader("password") String password,
                         @RequestHeader("email") String email) {
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(username);
        utilisateur.setEmail(email);
        utilisateur.setMotdepasse(password);
        utilisateurRepository.save(utilisateur);
    }
}
