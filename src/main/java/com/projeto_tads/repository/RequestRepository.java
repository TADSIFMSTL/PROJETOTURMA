package com.projeto_tads.repository;

import java.util.UUID;

import com.projeto_tads.model.Request;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {
    
}
