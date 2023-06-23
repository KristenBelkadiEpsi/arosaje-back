package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Botaniste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotanisteRepository extends JpaRepository<Botaniste, Integer> {
}
