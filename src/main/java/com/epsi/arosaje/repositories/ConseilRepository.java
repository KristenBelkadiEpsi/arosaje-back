package com.epsi.arosaje.repositories;


import com.epsi.arosaje.entities.Conseil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConseilRepository extends JpaRepository<Conseil, Integer> {
}
