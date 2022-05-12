package com.projeto_tads.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "tb_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   
    @Id
    private UUID  id;
    private String name;
    private String email;
    private String phone;
    private String password;

    private boolean adm;
    



     //Implementação do Relacionamento
    //@JsonIgnore
    //@OneToMany 
     

}
