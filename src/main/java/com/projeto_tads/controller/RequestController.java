package com.projeto_tads.controller;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.model.Request;
import com.projeto_tads.service.RequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request")
public class RequestController {
    
    @Autowired
    RequestService requestService;


    @GetMapping("/list")
    public String listAllRequests(Model frontEndModel) {
        List<Request> requestsList = requestService.getAllRequests();
        frontEndModel.addAttribute("requestsList", requestsList);
        frontEndModel.addAttribute("noDataRequest", new Request());
        return "";
    }


    @PostMapping("/save")
    public String saveRequest(@ModelAttribute("noDataRequest") Request request) {
        requestService.saveRequest(request);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String deleteRequest(@PathVariable("id") UUID id) {
        requestService.deleteRequestById(id);
        return "redirect:/";
    }


    @PostMapping("/update/{id}")
    public String updateRequest(@PathVariable("id") UUID id, @ModelAttribute("noDataRequest") Request request) {
        requestService.saveRequest(request);
        return "redirect:/";
    }
}
