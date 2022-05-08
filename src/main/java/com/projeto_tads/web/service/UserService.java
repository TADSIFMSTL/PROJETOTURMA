package com.projeto_tads.web.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.projeto_tads.web.model.User;
import com.projeto_tads.web.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    }

    public User findById(UUID id){  
        return repository.findById(id).get(); 
    }

    public void updateStudent(User user) {
        repository.save(user);
    }

}
