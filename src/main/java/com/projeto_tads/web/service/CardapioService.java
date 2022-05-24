package com.projeto_tads.web.service;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.web.model.Cardapio;
import com.projeto_tads.web.repository.CardapioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardapioService {
    
    
    @Autowired
    CardapioRepository cardapioRepository;

    public List< Cardapio> getCardapios() {
        return this.cardapioRepository.findAll();
    }

    public void save( Cardapio cardapio) {
        cardapioRepository.save(cardapio);
    }

    public void delete(UUID id) {
        cardapioRepository.deleteById(id);
    }

    public  Cardapio findById(UUID id) {
        return cardapioRepository.findById(id).get();
    }
}


