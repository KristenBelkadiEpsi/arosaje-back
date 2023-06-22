package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select t from User t where t.name  = ?1 and t.password = ?2")
    User findByUserName(String username, String password);
}
