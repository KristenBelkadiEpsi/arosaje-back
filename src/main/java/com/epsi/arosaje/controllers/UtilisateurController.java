package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Utilisateur;
import com.epsi.arosaje.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping("/login")
    public Map<String, String> login(@RequestHeader("username") String username, @RequestHeader("password") String password, @RequestHeader("email") String email) {
        Utilisateur utilisateur = utilisateurRepository.findUser(username, password, email);
        HashMap<String, String> result = new HashMap<>();
        result.put("nom", utilisateur.getNom());
        result.put("email", utilisateur.getEmail());

        return result;
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
