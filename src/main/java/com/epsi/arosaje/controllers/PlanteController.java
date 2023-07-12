package com.epsi.arosaje.controllers;

import com.epsi.arosaje.entities.Plante;
import com.epsi.arosaje.repositories.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class PlanteController {
    @Autowired
    private PlanteRepository planteRepository;

    @GetMapping("/listePlantes")
    public List<Map<String, String>> listePlantes() {
        List<Plante> plantes = planteRepository.findAll();
        List<Map<String, String>> result = plantes.stream().map(plante -> {
            HashMap<String, String> map = new HashMap<>();
            map.put("id", plante.getPlanteId().toString());
            map.put("nom", plante.getNom());
            map.put("photo", plante.getPhoto());
            map.put("description", plante.getDescription());
            return map;
        }).collect(Collectors.toList());
        return result;
    }
}
