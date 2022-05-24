package com.projeto_tads.web.repository;

import java.util.UUID;

import com.projeto_tads.web.model.Cardapio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CardapioRepository extends JpaRepository<Cardapio, UUID> {
    
}
