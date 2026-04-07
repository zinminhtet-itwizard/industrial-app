package com.example.indestrial.app.payment;

import org.springframework.stereotype.Component;

@Component
@PaymentHandler(PaymentType.VALIDATE)
public class ValidatePaymentCommand implements PaymentCommand {

  @Override
  public void execute(OrderData order) {}
}
