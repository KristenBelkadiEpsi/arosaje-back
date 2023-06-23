package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Plante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanteRepository extends JpaRepository<Plante, Integer> {
}
