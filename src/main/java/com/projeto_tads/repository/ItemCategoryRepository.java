package com.projeto_tads.repository;

import java.util.UUID;

import com.projeto_tads.model.ItemCategory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory,UUID>{
    
}
