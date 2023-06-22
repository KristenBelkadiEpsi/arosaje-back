package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Tip;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TipRepository extends JpaRepository<Tip, Integer> {
}
