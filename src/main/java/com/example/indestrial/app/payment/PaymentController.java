package com.example.indestrial.app.payment;

import org.springframework.web.bind.annotation.RestController;

import com.example.indestrial.app.payment.dto.PaymentRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PaymentController {

  private final PaymentCommandRegistry registry;
  private final PaymentInvoker invoker;

  public PaymentController(PaymentCommandRegistry registry, PaymentInvoker invoker) {
    this.registry = registry;
    this.invoker = invoker;
  }

  @PostMapping("/payment")
  public void handle(@RequestBody PaymentRequest request) {
    PaymentType type = PaymentType.valueOf(request.type());
    PaymentCommand command = registry.getCommand(type);
    invoker.execute(command, request.orderData());
  }

}