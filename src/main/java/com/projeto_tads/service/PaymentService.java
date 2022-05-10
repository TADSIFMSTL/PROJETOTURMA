package com.projeto_tads.service;

import java.util.List;
import java.util.UUID;

import com.projeto_tads.model.Payment;
import com.projeto_tads.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    @Autowired
    PaymentRepository paymentRepository;


    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }


    public Payment getPaymentById(UUID id) {
        return paymentRepository.getById(id);
    }


    public void savePayment(Payment payment) {
        paymentRepository.save(payment);
    }


    public void deletePaymentById(UUID id) {
        paymentRepository.deleteById(id);
    }
}
