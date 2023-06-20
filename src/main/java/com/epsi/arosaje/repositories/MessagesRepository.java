package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Messages;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessagesRepository extends JpaRepository<Messages, Integer> {
}
