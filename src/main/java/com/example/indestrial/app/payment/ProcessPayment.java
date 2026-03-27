package com.example.indestrial.app.payment;

import jakarta.annotation.PostConstruct;

public class ProcessPayment implements PaymentStrategy {
  private final PaymentRegistry registry;

  ProcessPayment(PaymentRegistry registry) {
    this.registry = registry;
  }

  @PostConstruct
  void register() {
    registry.register("process", this); // "this" = me, ProcessPayment
  }

  @Override
  public void execute(Order order) {}
}
