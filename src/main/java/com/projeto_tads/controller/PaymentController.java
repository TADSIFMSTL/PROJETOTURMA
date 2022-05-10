package com.projeto_tads.controller;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.model.Payment;
import com.projeto_tads.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {
    
    @Autowired
    PaymentService paymentService;


    @GetMapping("/")
    public String getPayment(Model frontEndModel) {
        List<Payment> paymentsList = paymentService.getAllPayments();
        frontEndModel.addAttribute("paymentsList", paymentsList);
        return "";
    }


    @PostMapping("/save")
    public String savePayment(@ModelAttribute("") Payment payment) {
        paymentService.savePayment(payment);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String deletePayment(@PathVariable("id") UUID id) {
        paymentService.deletePaymentById(id);
        return "redirect:/";
    }


    @PostMapping("/update/{id}")
    public String updatePayment(@PathVariable("id") UUID id, @ModelAttribute("") Payment payment) {
        paymentService.savePayment(payment);
        return "redirect:/";
    }
}
