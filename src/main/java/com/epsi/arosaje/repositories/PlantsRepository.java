package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Plants;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlantsRepository extends JpaRepository<Plants, Integer> {
}
