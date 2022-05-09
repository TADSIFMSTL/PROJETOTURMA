package com.projeto_tads.web.service;

import com.projeto_tads.web.repository.BusinessHoursRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessHoursService {
    
    @Autowired
    private BusinessHoursRepository repository;
}
