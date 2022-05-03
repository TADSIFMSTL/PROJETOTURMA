package com.projeto_tads.service;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.model.Request;
import com.projeto_tads.repository.RequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    
    @Autowired
    RequestRepository requestRepository;


    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }


    public Request getRequestById(UUID id) {
        return requestRepository.getById(id);
    }


    public void saveRequest(Request request) {
        requestRepository.save(request);
    }


    public void deleteRequestById(UUID id) {
        requestRepository.deleteById(id);
    }
}
