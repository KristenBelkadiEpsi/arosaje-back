package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//commentaire test
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    @Query(value = "select t from Utilisateur t where t.nom  = ?1 and t.motdepasse = ?2 and t.email = ?3")
    Utilisateur findUser(String username, String password, String email);
}
