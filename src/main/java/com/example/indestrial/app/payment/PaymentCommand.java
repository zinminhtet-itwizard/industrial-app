package com.example.indestrial.app.payment;

public interface PaymentCommand {
  PaymentType getType();
  void execute(OrderData order);
}
