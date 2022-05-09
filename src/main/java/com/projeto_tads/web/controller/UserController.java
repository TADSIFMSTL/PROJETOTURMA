package com.projeto_tads.web.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.UUID;

import com.projeto_tads.web.model.User;
import com.projeto_tads.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    
    
	@Autowired
	private UserService  service;
	
    @GetMapping("/cadastrar")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "cadastrar";
    } 


    @GetMapping("/")
    public String locAll(Model model) {
        List<User> users = service.findAll();
        model.addAttribute("usersxx", users); 
        return "index";
    } 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable UUID id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	
	}
	
	@PostMapping("/")
    public String saveUser(@ModelAttribute("user") User user) {
        service.insert(user);
        return "redirect:/user/";
    }
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(UUID id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	

	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable("id") UUID id, @ModelAttribute User user) {
        service.insert(user);

        return "redirect:/users/";
    }
		
	
	
	
}

