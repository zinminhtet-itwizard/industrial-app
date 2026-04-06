package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
public class ValidatePaymentCommand implements PaymentCommand {

  @Override
  public PaymentType getType() {
    return PaymentType.VALIDATE;
  }

  @Override
  public void execute(Order order) {}

  @Override
  public void undo(Order order) {}
}
