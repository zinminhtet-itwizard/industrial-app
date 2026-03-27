package com.example.indestrial.app.payment;

import org.springframework.web.bind.annotation.RestController;

import com.example.indestrial.app.payment.dto.PaymentRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {

  private final PaymentRegistry registry;

  PaymentController(PaymentRegistry registry) {
    this.registry = registry;
  }

  @PostMapping("/payment")
  public void handle(@RequestBody PaymentRequest request) {
    PaymentStrategy strategy = registry.get(request.type());
    strategy.execute(request.order());
  }
  
}