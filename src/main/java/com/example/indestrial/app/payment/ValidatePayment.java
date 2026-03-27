package com.example.indestrial.app.payment;

import jakarta.annotation.PostConstruct;

public class ValidatePayment implements PaymentStrategy {

  private final PaymentRegistry registry;

  ValidatePayment(PaymentRegistry registry) {
    this.registry = registry;
  }

  @PostConstruct
  void register() {
    registry.register(PaymentType.VALIDATE, this); // "this" = me, RefundPayment
  }

  @Override
  public void execute(Order order) {}
}
