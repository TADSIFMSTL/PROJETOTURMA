package com.projeto_tads.web.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    String descricao;
    @OneToMany(mappedBy = "Cardapio")    
    List<Cardapio> Cardapio;
    
}