package com.example.indestrial.app.payment;

import org.springframework.web.bind.annotation.RestController;

import com.example.indestrial.app.payment.dto.PaymentRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {

  private final PaymentCommandRegistry registry;

  public PaymentController(PaymentCommandRegistry registry) {
    this.registry = registry;
  }

  @PostMapping("/payment")
  public void handle(@RequestBody PaymentRequest request) {
    PaymentType type = PaymentType.valueOf(request.type());
    PaymentCommand command = registry.getCommand(type);
    command.execute(request.orderData());
  }

}