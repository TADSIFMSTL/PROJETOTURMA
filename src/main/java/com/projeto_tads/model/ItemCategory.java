package com.projeto_tads.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  UUID id;
  String title;
  String description;
  String obrigatorio;
  String qtdItens;
}
