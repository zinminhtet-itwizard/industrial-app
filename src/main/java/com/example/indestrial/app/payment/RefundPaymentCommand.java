package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
public class RefundPaymentCommand implements PaymentCommand {

  @Override
  public PaymentType getType() {
    return PaymentType.REFUND;
  }

  @Override
  public void execute(Order order) {}

  @Override
  public void undo(Order order) {}
}
