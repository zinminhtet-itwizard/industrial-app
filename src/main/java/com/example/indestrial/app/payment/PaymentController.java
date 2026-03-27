package com.example.indestrial.app.payment;

import org.springframework.web.bind.annotation.RestController;

import com.example.indestrial.app.payment.dto.PaymentRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {

  private final PaymentFactory factory;

  PaymentController(PaymentFactory factory) {
    this.factory = factory;
  }

  @PostMapping("/payment")
  public void handle(@RequestBody PaymentRequest request) {
    PaymentStrategy strategy = factory.create(request.type());
    strategy.execute(request.order());
  }
  
}