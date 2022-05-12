package com.projeto_tads.repository;

import java.util.UUID;

import com.projeto_tads.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, UUID>{
    
}
