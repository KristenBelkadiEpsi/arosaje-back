package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Integer> {
}
