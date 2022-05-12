package com.projeto_tads.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BusinessHours{

    // gerar id automatico no banco
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    
    //selecionar data
    UUID id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    
    //data e hora inicial
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dateHourStart;

    //data e hora final
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dateHourEnd;
    
}

