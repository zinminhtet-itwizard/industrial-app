package com.example.indestrial.app.payment;

public enum PaymentType {
  REFUND(new RefundPayment()),
  PROCESS(new ProcessPayment()),
  VALIDATE(new ValidatePayment());

  private final PaymentStrategy strategy;

  PaymentType(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  public PaymentStrategy getStrategy() {
    return strategy;
  }
}