package com.projeto_tads.web.controller;

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

}
