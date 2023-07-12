package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Plante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanteRepository extends JpaRepository<Plante, Integer> {
    List<Plante> findAll();
}
