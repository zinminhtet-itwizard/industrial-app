package com.example.indestrial.app.payment;

public interface PaymentStrategy {
  void execute(Order order);
}
