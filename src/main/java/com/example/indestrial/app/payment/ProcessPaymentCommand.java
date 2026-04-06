package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
public class ProcessPaymentCommand implements PaymentCommand {

  @Override
  public PaymentType getType() {
    return PaymentType.PROCESS;
  }

  @Override
  public void execute(OrderData order) {}

  @Override
  public void undo(OrderData order) {}
}
