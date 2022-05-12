package com.projeto_tads.service;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.model.Shopping;
import com.projeto_tads.repository.ShoppingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {

    @Autowired
    ShoppingRepository shoppingRepository;

    public List<Shopping> getShopping(){
        return shoppingRepository.findAll();

    }

    public void save(Shopping shopping){
        shoppingRepository.save(shopping);
    }
    
    public void deleteById(UUID id){
        shoppingRepository.deleteById(id);
    }
    
    public Shopping findById(UUID id){
        return shoppingRepository.findById(id).get();
    }

    public void updateShopping(Shopping shopping) {
        shoppingRepository.save(shopping);
    }

}