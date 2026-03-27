package com.example.indestrial.app.payment;

import jakarta.annotation.PostConstruct;

public class RefundPayment implements PaymentStrategy {

  private final PaymentRegistry registry;

  RefundPayment(PaymentRegistry registry) {
    this.registry = registry;
  }

  @PostConstruct
  void register() {
    registry.register("refund", this); // "this" = me, RefundPayment
  }


  @Override
  public void execute(Order order) {}
}
