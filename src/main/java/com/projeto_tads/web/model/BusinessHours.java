package com.projeto_tads.web.model;

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
    
    UUID id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dateHourStart;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dateHourEnd;
    
}

