package com.projeto_tads.service;

import java.util.UUID;

import com.projeto_tads.model.ItemCategory;
import com.projeto_tads.repository.ItemCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCategoryService {
    @Autowired
    private ItemCategoryRepository repository;

    // metodo para criar a categoria item
    public void saveItemCategory(ItemCategory itemcategory) {
        repository.save(itemcategory);
    }

    // metodo para deletar o categoria do item
    public void deleteItemCategory(ItemCategory itemCategory) {
        repository.delete(itemCategory);
    }

    public ItemCategory findById(UUID id) {
        return repository.findById(id).get();
    }

}
