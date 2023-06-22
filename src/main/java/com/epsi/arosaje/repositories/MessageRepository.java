package com.epsi.arosaje.repositories;

import com.epsi.arosaje.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepository extends JpaRepository<Message, Integer> {
}
