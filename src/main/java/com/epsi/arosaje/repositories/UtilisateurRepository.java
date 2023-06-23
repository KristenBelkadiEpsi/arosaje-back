package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
//commentaire test
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    @Query(value = "select * from Utilisateur t where t.name  = ?1 and t.password = ?2",nativeQuery = true)
    Utilisateur findByUserName(String username, String password);
}
