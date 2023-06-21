package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UsersRepository extends JpaRepository<Users, Integer> {
    @Query("select t from Users t where t.name  = ?1")
    Users findByUserName(String username);
}
