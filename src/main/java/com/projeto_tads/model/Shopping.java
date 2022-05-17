package com.projeto_tads.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shopping {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long cnpj;

<<<<<<< HEAD
  String name;
  String telephone;
  // @OneToOne(mappedBy = "Adress")
  // List<Adress> adress = new ArrayList<Adress>();
  
  // @OneToOne (mappedBy = "Restaurant")
  // List<Restaurant> restaurant = new ArrayList<Restaurant>();
}
=======
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long cnpj;
    String name;
    String telephone;
   // @OneToOne(mappedBy = "Adress")    
   // List<Adress> adress = new ArrayList<Adress>();

    // @OneToOne (mappedBy = "Restaurant")
    // List<Restaurant> restaurant = new ArrayList<Restaurant>();
}
>>>>>>> 8c3b73b3f39da5363a9d1959c018c1669ad72b95
