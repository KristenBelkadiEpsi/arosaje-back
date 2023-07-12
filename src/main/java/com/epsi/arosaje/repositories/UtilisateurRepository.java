package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//commentaire test
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
<<<<<<< HEAD
    @Query(value = "select t from Utilisateur t where t.nom  = ?1 and t.motdepasse = ?2 and t.email = ?3")
    Utilisateur findUser(String username, String password, String email);
=======
    @Query(value = "select t from Utilisateur t where t.nom = ?1 and t.motdepasse = ?2")
    Utilisateur findByUserName(String username, String password);
>>>>>>> cccead28e50d7e28c3513aac7f140883a1955291
}
