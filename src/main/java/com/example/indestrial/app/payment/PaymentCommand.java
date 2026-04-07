package com.example.indestrial.app.payment;

public interface PaymentCommand {
  void execute(OrderData order);
}
