package com.projeto_tads.service;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.repository.UserRepository;
import com.projeto_tads.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.StringUtils;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(UUID id) {

        repository.deleteById(id);
        if(id == null ){
            org.thymeleaf.util.StringUtils.isEmpty("vazio");
        }
    }

    public User findById(UUID id){  
        return repository.findById(id).get(); 
    }

    public void updateUser(User user) {
        repository.save(user);
    }

}
