package com.projeto_tads.web.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
//@Table(name = "tb_user")
@Data
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
