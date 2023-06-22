package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Plant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlantRepository extends JpaRepository<Plant, Integer> {
}
