package com.projeto_tads.web.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    String neighborhood;
    String country;
    String state;
    String city;
    Float latitude;
    Float longitude;
    String street;
    Float number;
    @OneToOne(mappedBy = "Shopping")    
    List<Shopping> shopping = new ArrayList<Shopping>();
}
