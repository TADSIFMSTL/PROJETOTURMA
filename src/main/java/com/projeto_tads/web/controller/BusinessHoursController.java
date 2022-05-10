/* package com.projeto_tads.web.controller;

import com.projeto_tads.web.service.BusinessHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/BusinessHours")

public class BusinessHoursController {

    @Autowired
    private BusinessHoursService service;

} */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.frontbackend.thymeleaf.bootstrap.model.Event;
import com.projeto_tads.web.model.BusinessHours;

@Controller
@RequestMapping("/BusinessHours")
public class BusinessHoursController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("BusinessHours", new BusinessHours());
        return "BusinessHours ";
    }

    @PostMapping
    public String save(BusinessHours businesshours, Model model) {
        model.addAttribute("businesshours", businesshours);
        return "saved";
    }
}